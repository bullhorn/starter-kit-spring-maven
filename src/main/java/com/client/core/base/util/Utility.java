package com.client.core.base.util;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.client.ApplicationContextProvider;
import com.client.core.base.model.relatedentity.BullhornRelatedEntity;
import com.client.core.base.model.relatedentity.StandardRelatedEntity;
import com.client.core.base.workflow.node.WorkflowAction;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.json.JSONArray;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Utility {
    private static BullhornData BULLHORN_DATA;

    private static final int BATCH_SIZE = 200;

    /**
     * <p>Extracts the fields of a nested association field in a set of fields. If the field is not found in the association
     * or the association doesn't have any nested fields, it returns a singleton set with just the "id" field</p>
     * <pre>
     * Utility.extractAssociationFieldsFromParent(Sets.newHashSet("id", "categories"), "categories")  = ("id")
     * Utility.extractAssociationFieldsFromParent(Sets.newHashSet("id", "categories(specialties(id,name),id,name)"), "categories") = ("specialties(id,name)", "id", "name")
     * Utility.extractAssociationFieldsFromParent(Sets.newHashSet("id", "categories"), "specialties")   = ("id")
     * </pre>
     *
     * @param parentFields    The complete set of fields of the parent entity that's being requested
     * @param associationName The name of the association whose fields should be extracted. It should exist in {@code parentFields}
     * @return The set of fields inside the association field
     */
    public static Set<String> extractAssociationFieldsFromParent(Set<String> parentFields, String associationName) {
        return parentFields.stream().filter(field -> field.startsWith(associationName))
                .findFirst()
                .map(field -> {
                    if (!field.contains("(")) {
                        return Collections.singleton("id");
                    }
                    return splitOutsideParentheses(field.substring(
                            field.indexOf("(") + 1,
                            field.length() - 1
                    ));
                })
                .orElseGet(() -> Collections.singleton("id"));
    }

    public static Map<? extends BullhornRelatedEntity, Set<String>> getRequestedFields(BullhornRelatedEntity[] relatedEntities,
                                                                                       List<? extends WorkflowAction<?, ?>> actions) {
        Map<? extends BullhornRelatedEntity, Set<String>> requestedFields = actions.stream().map(WorkflowAction::getRelatedEntityFields).reduce(Maps.newLinkedHashMap(), (firstMap, secondMap) -> {
            return Stream.concat(firstMap.entrySet().stream(), secondMap.entrySet().stream())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            Utility::mergeFieldSets));
        });

        return Stream.concat(Stream.of(relatedEntities), Stream.of(StandardRelatedEntity.values())).collect(Collectors.toMap(Function.identity(), relatedEntity -> {
            if (requestedFields.containsKey(relatedEntity)) {
                return Utility.mergeFieldSets(relatedEntity.getDefaultFields(), requestedFields.get(relatedEntity));
            }

            return relatedEntity.getDefaultFields();
        }));
    }

    public static Set<String> mergeFieldSets(Set<String> set1, Set<String> set2) {
        return mergeNestedFields(Sets.union(set1, set2));
    }

    public static Set<String> mergeNestedFields(Set<String> fields) {
        return fields.parallelStream().map(field -> {
            return field.replaceAll("\\s+", "");
        }).collect(Collectors.groupingBy(field -> {
            return StringUtils.substringBefore(field, "(").trim();
        })).entrySet().parallelStream().map(entry -> {
            if (entry.getValue().size() == 1) {
                return entry.getValue().get(0).trim();
            } else {
                Set<String> nestedFields = entry.getValue().parallelStream().map(nestedField -> {
                    return StringUtils.substringBeforeLast(StringUtils.substringAfter(nestedField, "("), ")");
                }).flatMap(nestedField -> {
                    return splitOutsideParentheses(nestedField).stream();
                }).collect(Collectors.toSet());

                return mergeNestedFields(nestedFields).parallelStream().collect(Collectors.joining(",", entry.getKey() + "(", ")"));
            }
        }).collect(Collectors.toSet());
    }

    public static Set<String> splitOutsideParentheses(String value) {
        Set<String> result = Sets.newHashSet();

        StringBuilder current = new StringBuilder();
        Integer isParenthesis = 0;

        for (Integer index = 0; index < value.length(); index++) {
            if (value.charAt(index) == '(') {
                isParenthesis++;
                current.append('(');
            } else if (value.charAt(index) == ')' && isParenthesis > 0) {
                isParenthesis--;
                current.append(')');
            } else if (value.charAt(index) == ',' && isParenthesis == 0) {
                result.add(current.toString());
                current = new StringBuilder();
            } else {
                current.append(value.charAt(index));
            }
        }

        if (StringUtils.isNotBlank(current)) {
            result.add(current.toString());
        }

        return result;
    }

    public static boolean isNumbersOnly(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(String value) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i)) && !".".equalsIgnoreCase(Character.toString(value.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static Set<Integer> parseCommaSeparatedIntegers(String value) {
        return parseCommaSeparated(value, Utility::forceParseInteger);
    }

    public static Set<String> parseCommaSeparatedStrings(String value) {
        return parseCommaSeparated(value, Function.identity());
    }

    private static <T> Set<T> parseCommaSeparated(String value, Function<String, T> map) {
        return Stream.of(StringUtils.defaultIfBlank(value, "").split(",")).parallel().map(map).collect(Collectors.toSet());
    }

    public static <T, R> Boolean valueChanged(T oldEntity, T newEntity, Function<T, R> get) {
        R oldValue = get.apply(oldEntity);
        R newValue = get.apply(newEntity);

        if (oldValue instanceof Address) {
            return valueChanged((Address) oldEntity, (Address) newEntity, Address::getAddress1)
                    || valueChanged((Address) oldEntity, (Address) newEntity, Address::getAddress2)
                    || valueChanged((Address) oldEntity, (Address) newEntity, Address::getCity)
                    || valueChanged((Address) oldEntity, (Address) newEntity, Address::getState)
                    || valueChanged((Address) oldEntity, (Address) newEntity, Address::getZip)
                    || valueChanged((Address) oldEntity, (Address) newEntity, Address::getCountryID);
        } else if (oldValue instanceof BullhornEntity) {
            return valueChanged((BullhornEntity) oldValue, (BullhornEntity) newValue, BullhornEntity::getId);
        }

        return valueChanged(oldValue, newValue);
    }

    public static <T> Boolean valueChanged(T oldValue, T newValue) {
        if (oldValue == null) {
            return newValue != null;
        } else if (newValue == null) {
            return true;
        } else if (oldValue instanceof String) {
            String oldString = StringUtils.defaultIfBlank((String) oldValue, "");
            String newString = StringUtils.defaultIfBlank((String) newValue, "");

            return !oldString.equals(newString);
        } else if (oldValue instanceof Boolean) {
            return oldValue != newValue;
        } else if (oldValue instanceof Integer) {
            return !oldValue.equals(newValue);
        } else if (oldValue instanceof BigDecimal) {
            return ((BigDecimal) oldValue).compareTo((BigDecimal) newValue) != 0;
        } else if (oldValue instanceof DateTime) {
            return Days.daysBetween((DateTime) oldValue, (DateTime) newValue).getDays() != 0;
        } else if (oldValue instanceof BullhornEntity) {
            return valueChanged((BullhornEntity) oldValue, (BullhornEntity) newValue, BullhornEntity::getId);
        }

        return !oldValue.equals(newValue);
    }

    private static final String SEARCH_DATE_FORMAT = "yyyyMMddHHmmss";


    public static String formatDateForSearch(DateTime value) {
        return value.toString(SEARCH_DATE_FORMAT);
    }

    public static String escapeWhitespaceForSearch(String value) {
        return value.replaceAll("\\s", "\\\\ ").replaceAll("\\)", "\\\\)").replaceAll("\\(", "\\\\(");
    }

    public static String escapeQuotesForQuery(String value) {
        return value.replaceAll("'", "''");
    }

    public static Map<String, String> commaDelimitedStringToMap(String commaDelimited) {
        List<String> parsed = Arrays.asList(commaDelimited.split(","));
        Map<String, String> theMap = new LinkedHashMap<String, String>();

        for (String value : parsed) {
            theMap.put(value, value);
        }

        return theMap;
    }

    public static void combineJsonArrays(JSONArray jsonArray1, JSONArray jsonArray2) {
        IntStream.range(0, jsonArray2.length()).forEach(index -> {
            jsonArray1.put(jsonArray2.get(index));
        });
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();

        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static Boolean isPositive(Integer value) {
        return value != null && value > 0;
    }

    public static Boolean isPositive(BigDecimal value) {
        return value != null && value.compareTo(BigDecimal.ZERO) > 0;
    }

    public static Boolean isPositive(Object value) {
        return isPositive(forceParseBigDecimal(value));
    }

    public static BigDecimal parseBigDecimal(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return null;
        } else {
            try {
                Double check = Double.parseDouble(value.toString());

                return new BigDecimal(check);
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    public static BigDecimal forceParseBigDecimal(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return BigDecimal.ZERO;
        } else {
            try {
                Double check = Double.parseDouble(value.toString());

                return new BigDecimal(check);
            } catch (NumberFormatException e) {
                return BigDecimal.ZERO;
            }
        }
    }

    public static Integer parseInteger(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return null;
        } else {
            try {
                return Integer.parseInt(value.toString());
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    public static Integer forceParseInteger(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return 0;
        } else {
            try {
                return Integer.parseInt(value.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    public static Double parseDouble(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return null;
        } else {
            try {
                return Double.parseDouble(value.toString());
            } catch (NumberFormatException e) {
                return null;
            }
        }
    }

    public static Double forceParseDouble(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return 0D;
        } else {
            try {
                return Double.parseDouble(value.toString());
            } catch (NumberFormatException e) {
                return 0D;
            }
        }
    }

    public static Long forceParseLong(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return 0L;
        } else {
            try {
                return Long.parseLong(value.toString());
            } catch (NumberFormatException e) {
                return 0L;
            }
        }
    }

    public static BigInteger forceParseBigInteger(Object value) {
        if (value == null || value.toString().isEmpty()) {
            return new BigInteger("0");
        } else {
            try {
                return new BigInteger(value.toString());
            } catch (NumberFormatException e) {
                return new BigInteger("0");
            }
        }
    }

    public static Date parseStringToDate(String dateStr, String dateFormat) {
        if (dateStr == null || dateStr.isEmpty() || dateFormat == null || dateFormat.isEmpty()) {
            return null;
        } else {
            DateFormat format = new SimpleDateFormat(dateFormat);
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {
                return null;
            }
        }
    }

    public static Date forceParseStringToDate(String dateStr, String dateFormat) {
        if (dateStr == null || dateStr.isEmpty() || dateFormat == null || dateFormat.isEmpty()) {
            return DateTime.now().toDate();
        } else {
            TimeZone timeZone = TimeZone.getTimeZone("America/Detroit");
            DateFormat format = new SimpleDateFormat(dateFormat);
            format.setTimeZone(timeZone);
            format.setLenient(false);
            try {
                return format.parse(dateStr);
            } catch (ParseException e) {
                return new Date(0);
            }
        }
    }

    public static DateTime parseStringToDateTime(String dateStr, String dateFormat) {


        Date date = parseStringToDate(dateStr, dateFormat);

        if (date == null) {
            return null;
        }

        DateTime now = nowUsingTimeZone(null);

        DateTime theCorrectDate = new DateTime(date, DateTimeZone.UTC);
        theCorrectDate = theCorrectDate.plusHours(now.getHourOfDay());
        theCorrectDate = theCorrectDate.plusMinutes(now.getMinuteOfHour());
        return theCorrectDate;
    }

    public static DateTimeZone defaultTimeZone() {
        return DateTimeZone.forID("EST5EDT");
    }

    /**
     * Returns today based on time zone; defaults timeZone to "EST5EDT" if null passed in.
     *
     * @param timeZone a valid time zone, if null then defaults to "EST5EDT";
     * @return today's date in DateTime for the passed in timeZone
     */
    public static DateTime nowUsingTimeZone(DateTimeZone timeZone) {
        if (timeZone == null) {
            timeZone = defaultTimeZone();
        }

        return new DateTime(timeZone);
    }

    public static DateTime forceParseStringToDateTime(String dateStr, String dateFormat) {
        return new DateTime(forceParseStringToDate(dateStr, dateFormat));
    }

    public static String formatDate(Date date, String format) {
        if (date == null) {
            return "";
        }

        TimeZone timeZone = TimeZone.getTimeZone("America/Detroit");

        DateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);
        dateFormat.setTimeZone(timeZone);
        return dateFormat.format(date);
    }

    public static String formatDateTime(DateTime date, String format) {
        if (date == null) {
            return "";
        }

        return formatDate(date.toDate(), format);
    }

    public static Boolean stringContains(String toCheckIn, String toCheckFor) {
        if (toCheckIn == null || toCheckFor == null || toCheckFor.isEmpty()) {
            return false;
        }

        if (toCheckIn.isEmpty()) {
            return true;
        }

        List<String> valuesForCheck = Arrays.asList(toCheckIn.split(","));
        for (String value : valuesForCheck) {
            if (value.trim().equalsIgnoreCase(toCheckFor.trim())) {
                return true;
            }
        }

        return false;
    }

    public static Boolean listContains(Collection<String> toCheckIn, String toCheckFor) {
        for (String object : toCheckIn) {
            if (object.equalsIgnoreCase(toCheckFor)) {
                return true;
            }
        }

        return false;
    }

    public static String arrayToString(String[] a, String separator) {
        StringBuilder result = new StringBuilder();
        if (a == null) {
            return null;
        } else if (a.length > 0) {
            result.append(a[0]);
            for (int i = 1; i < a.length; i++) {
                result.append(separator);
                result.append(a[i]);
            }
        }

        return result.toString();
    }

    public static Boolean parseBoolean(String bool) {
        if (bool == null || bool.isEmpty()) {
            return false;
        }

        if (bool.equalsIgnoreCase(Boolean.TRUE.toString())) {
            return true;
        }

        return false;
    }

    public static String parseString(Object value) {
        return value == null ? "" : value.toString();
    }

    public static String createEntireInStatement(Collection<String> values) {
        return createEntireInStatement("", values);
    }

    public static String createEntireInStatement(String field, Collection<String> values) {
        String commaSeparated = values.parallelStream().map(value -> {
            return "'" + value + "'";
        }).collect(Collectors.joining(","));

        return field + " IN (" + commaSeparated + ")";
    }

    public static Integer nullCheck(Integer value) {
        return nullCheck(value, 0);
    }

    public static <T> T nullCheck(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }

    public static BigDecimal nullCheck(BigDecimal value) {
        return nullCheck(value, BigDecimal.ZERO);
    }

    public static String nullCheck(String value) {
        return nullCheck(value, "");
    }

    public static String longDateFormatToShort(String applicationDateFormat) {
        String shortDateFormat = StringUtils.defaultIfBlank(applicationDateFormat, "").replaceAll("MM", "M").replaceAll("dd", "d").replaceAll("yyyy", "yy");

        return new StringBuilder(shortDateFormat).append(" h:mm a").toString();
    }

    public static String javaDateFormatToJavascriptDateFormat(String format) {
        return StringUtils.defaultIfBlank(format, "").replaceAll("d", "D").replaceAll("y", "Y");
    }

    public static String getHostFromBullhornUrl(String currentBullhornUrl) {
        return currentBullhornUrl.substring(0, StringUtils.indexOfIgnoreCase(currentBullhornUrl, "/bullhornstaffing/"));
    }

    public static <T extends QueryEntity, R> void queryAndProcessAll(Class<T> type, String where, Set<String> fields, Consumer<T> process) {
        queryForAll(type, where, fields, (batch) -> batch.parallelStream().forEach(process));
    }

    public static <T extends QueryEntity, R> void sequentialQueryAndProcessAll(Class<T> type, String where, Set<String> fields, Consumer<T> process) {
        queryForAll(type, where, fields, (batch) -> batch.forEach(process));
    }

    public static <T extends QueryEntity, R> List<R> queryAndMapAll(Class<T> type, String where, Set<String> fields, Function<T, R> map) {
        List<R> result = Lists.newArrayList();

        queryForAll(type, where, fields, (batch) -> result.addAll(batch.parallelStream().map(map).toList()));

        return result;
    }

    public static <T extends QueryEntity, R> List<R> sequentialQueryAndMapAll(Class<T> type, String where, Set<String> fields, Function<T, R> map) {
        List<R> result = Lists.newArrayList();

        queryForAll(type, where, fields, (batch) -> result.addAll(batch.stream().map(map).toList()));

        return result;
    }

    public static <T extends QueryEntity> List<T> queryAndFilterAll(Class<T> type, String where, Set<String> fields, Predicate<T> filter) {
        List<T> result = Lists.newArrayList();

        queryForAll(type, where, fields, (batch) -> result.addAll(batch.parallelStream().filter(filter).toList()));

        return result;
    }

    public static <T extends QueryEntity> List<T> sequentialQueryAndFilterAll(Class<T> type, String where, Set<String> fields, Predicate<T> filter) {
        List<T> result = Lists.newArrayList();

        queryForAll(type, where, fields, (batch) -> result.addAll(batch.stream().filter(filter).toList()));

        return result;
    }

    public static <T extends QueryEntity, A, R> R queryAndCollectAll(Class<T> type, String where, Set<String> fields, Collector<T, A, R> collect) {
        A result = collect.supplier().get();

        queryForAll(type, where, fields, (batch) -> {
            A batchResult = collect.supplier().get();

            batch.parallelStream().forEach(entity -> {
                collect.accumulator().accept(batchResult, entity);
            });

            collect.combiner().apply(result, batchResult);
        });

        return collect.finisher().apply(result);
    }

    public static <T extends QueryEntity, A, R> R sequentialQueryAndCollectAll(Class<T> type, String where, Set<String> fields, Collector<T, A, R> collect) {
        A result = collect.supplier().get();

        queryForAll(type, where, fields, (batch) -> {
            A batchResult = collect.supplier().get();

            batch.forEach(entity -> collect.accumulator().accept(batchResult, entity));

            collect.combiner().apply(result, batchResult);
        });

        return collect.finisher().apply(result);
    }

    public static <T extends SearchEntity, R> void searchAndProcessAll(Class<T> type, String where, Set<String> fields, Consumer<T> process) {
        searchForAll(type, where, fields, (batch) -> batch.parallelStream().forEach(process));
    }

    public static <T extends SearchEntity, R> void sequentialSearchAndProcessAll(Class<T> type, String where, Set<String> fields, Consumer<T> process) {
        searchForAll(type, where, fields, (batch) -> batch.forEach(process));
    }

    public static <T extends SearchEntity, R> List<R> searchAndMapAll(Class<T> type, String where, Set<String> fields, Function<T, R> map) {
        List<R> result = Lists.newArrayList();

        searchForAll(type, where, fields, (batch) -> result.addAll(batch.parallelStream().map(map).toList()));

        return result;
    }

    public static <T extends SearchEntity, R> List<R> sequentialSearchAndMapAll(Class<T> type, String where, Set<String> fields, Function<T, R> map) {
        List<R> result = Lists.newArrayList();

        searchForAll(type, where, fields, (batch) -> result.addAll(batch.stream().map(map).toList()));

        return result;
    }

    public static <T extends SearchEntity> List<T> searchAndFilterAll(Class<T> type, String where, Set<String> fields, Predicate<T> filter) {
        List<T> result = Lists.newArrayList();

        searchForAll(type, where, fields, (batch) -> result.addAll(batch.parallelStream().filter(filter).toList()));

        return result;
    }

    public static <T extends SearchEntity> List<T> sequentialSearchAndFilterAll(Class<T> type, String where, Set<String> fields, Predicate<T> filter) {
        List<T> result = Lists.newArrayList();

        searchForAll(type, where, fields, (batch) -> result.addAll(batch.stream().filter(filter).toList()));

        return result;
    }

    public static <T extends SearchEntity, A, R> R searchAndCollectAll(Class<T> type, String where, Set<String> fields, Collector<T, A, R> collect) {
        A result = collect.supplier().get();

        searchForAll(type, where, fields, (batch) -> {
            A batchResult = collect.supplier().get();

            batch.parallelStream().forEach(entity -> collect.accumulator().accept(batchResult, entity));

            collect.combiner().apply(result, batchResult);
        });

        return collect.finisher().apply(result);
    }

    public static <T extends SearchEntity, A, R> R sequentialSearchAndCollectAll(Class<T> type, String where, Set<String> fields, Collector<T, A, R> collect) {
        A result = collect.supplier().get();

        searchForAll(type, where, fields, (batch) -> {
            A batchResult = collect.supplier().get();

            batch.forEach(entity -> collect.accumulator().accept(batchResult, entity));

            collect.combiner().apply(result, batchResult);
        });

        return collect.finisher().apply(result);
    }

    private static <T extends QueryEntity> void queryForAll(Class<T> type, String where, Set<String> fields, Consumer<List<T>> process) {
        queryForAll(type, where, fields, process, 0);
    }

    private static <T extends QueryEntity> void queryForAll(Class<T> type, String where, Set<String> fields, Consumer<List<T>> process, Integer start) {
        QueryParams params = ParamFactory.queryParams();
        params.setStart(start);
        params.setCount(BATCH_SIZE);
        params.setOrderBy("id");
        params.setShowTotalMatched(true);

        ListWrapper<T> result = getBullhornData().query(type, where, fields, params);

        process.accept(result.getData());

        if (result.getStart() + result.getCount() < result.getTotal()) {
            queryForAll(type, where, fields, process, result.getStart() + result.getCount());
        }
    }

    private static <T extends SearchEntity> void searchForAll(Class<T> type, String where, Set<String> fields, Consumer<List<T>> process) {
        searchForAll(type, where, fields, process, 0);
    }

    private static <T extends SearchEntity> void searchForAll(Class<T> type, String where, Set<String> fields, Consumer<List<T>> process, Integer start) {
        SearchParams params = ParamFactory.searchParams();
        params.setStart(start);
        params.setCount(BATCH_SIZE);
        params.setSort("id");

        ListWrapper<T> result = getBullhornData().search(type, where, fields, params);

        process.accept(result.getData());

        if (result.getStart() + result.getCount() < result.getTotal()) {
            searchForAll(type, where, fields, process, result.getStart() + result.getCount());
        }
    }

    private static synchronized BullhornData getBullhornData() {
        if (BULLHORN_DATA == null) {
            BULLHORN_DATA = ApplicationContextProvider.getApplicationContext().getBean(BullhornData.class);
        }

        return BULLHORN_DATA;
    }
}
