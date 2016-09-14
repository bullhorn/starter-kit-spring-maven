package com.client.core.datatables.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.SearchParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.client.core.AppContext;
import com.client.core.datatables.model.configuration.column.ColumnConfiguration;
import com.client.core.datatables.tools.JQueryDataTableParamModel;
import com.google.common.collect.Sets;

/**
 * Extend this class to get data tables editable functionality for free.
 * 
 * Contains generic logic to handle datatables retrieving of data, editing data, entity validation, sorting of rows, filtering of rows.
 * 
 * If custom functionality needs to be added, DO NOT edit this class, instead overwrite the relevant methods in your concrete class.
 * 
 * @author magnus.palm
 * 
 * @param <T>
 *            entity that will be handled by the datatables, represents one Bullhorn entity of any type
 */
public abstract class BullhornDataTablesService<T extends BullhornEntity> extends AbstractDataTablesService<T, Integer> {

    private final Set<String> fields;

	private final BullhornData bullhornData;
    private final Class<T> type;

    public BullhornDataTablesService(Validator validator, Set<String> fields, BullhornData bullhornData, Class<T> type) {
        super(validator);
        this.fields = fields;
        this.bullhornData = bullhornData;
        this.type = type;
    }

    public BullhornDataTablesService(Set<String> fields, BullhornData bullhornData, Class<T> type) {
        this.fields = fields;
        this.bullhornData = bullhornData;
        this.type = type;
    }

    public BullhornDataTablesService(Validator validator, BullhornData bullhornData, Class<T> type) {
        super(validator);
        this.bullhornData = bullhornData;
        this.type = type;
        this.fields = Sets.newHashSet("*");
    }

    public BullhornDataTablesService(BullhornData bullhornData, Class<T> type) {
        this.bullhornData = bullhornData;
        this.type = type;
        this.fields = Sets.newHashSet("*");
    }

    public BullhornDataTablesService(Validator validator, Class<T> type) {
        super(validator);
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        this.type = type;
        this.fields = Sets.newHashSet("*");
    }

    public BullhornDataTablesService(Class<T> type) {
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        this.type = type;
        this.fields = Sets.newHashSet("*");
    }

    public BullhornDataTablesService(Validator validator, Set<String> fields, Class<T> type) {
        super(validator);
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        this.fields = fields;
        this.type = type;
    }

    public BullhornDataTablesService(Set<String> fields, Class<T> type) {
        this.bullhornData = AppContext.getApplicationContext().getBean(BullhornData.class);
        this.fields = fields;
        this.type = type;
    }

    protected abstract Set<String> searchFields();

    protected String getQuery(HttpServletRequest request) {
        if(SearchEntity.class.isAssignableFrom(type)) {
            return "id:[0 TO *]";
        } else if(QueryEntity.class.isAssignableFrom(type)) {
            return "id > 0";
        } else {
            throw new IllegalArgumentException(type.toString()+" is not a QueryEntity or a SearchEntity, so we cannot retrieve data for this type.  Override getQuery() or use a different type.");
        }
    }

    @Override
    public T find(Integer id) throws EntityNotFoundException {
        return bullhornData.findEntity(type, id);
    }

    @Override
    protected T add(T transientObject) {
        if(transientObject instanceof CreateEntity) {
            return bullhornData.insertEntity((CreateEntity) transientObject);
        } else {
            throw new IllegalArgumentException(type.toString()+" is not a CreateEntity, but add was called.");
        }
    }

    @Override
    protected T update(T transientObject) {
        if(transientObject instanceof UpdateEntity) {
            return bullhornData.updateEntity((UpdateEntity) transientObject);
        } else {
            throw new IllegalArgumentException(type.toString()+" is not an UpdateEntity, but add was called.");
        }
    }

    @Override
    protected void remove(T persistentObject) throws EntityNotFoundException {
        if(persistentObject instanceof DeleteEntity) {
            bullhornData.deleteEntity((Class<DeleteEntity>) type, persistentObject.getId());
        } else {
            throw new IllegalArgumentException(type.toString()+" is not a DeleteEntity, but add was called.");
        }
    }

    @Override
    protected List<T> getData(HttpServletRequest request, JQueryDataTableParamModel param) {
        Integer start = param.getiDisplayStart();
        Integer count = param.getiDisplayLength();

        String sort = "";

        int sortColumnIndex = param.getiSortColumnIndex();

        if(sortColumnIndex > 0) {
            String sortDirection = StringUtils.isBlank(param.getsSortDirection()) || "asc".equals(param.getsSortDirection()) ? "-" : "";
            String sortField = getStandardColumnConfiguration().getColumn(sortColumnIndex).getFieldName();

            sort = sortDirection+sortField;
        }

        String defaultQuery = getQuery(request);

        ListWrapper<T> result;
        Integer unfilteredCount;

        if(SearchEntity.class.isAssignableFrom(type)) {
            if(StringUtils.isBlank(param.getsSearch())) {
                result = search(defaultQuery, start, count, sort);
                unfilteredCount = result.getTotal();
            } else {
                result = searchWithTerm(defaultQuery, start, count, sort, param.getsSearch());
                unfilteredCount = searchForCount(defaultQuery).getTotal();
            }
        } else if(QueryEntity.class.isAssignableFrom(type)) {
            if(StringUtils.isBlank(param.getsSearch())) {
                result = query(defaultQuery, start, count, sort);
                unfilteredCount = result.getTotal();
            } else {
                result = queryWithTerm(defaultQuery, start, count, sort, param.getsSearch());
                unfilteredCount = queryForCount(defaultQuery).getTotal();
            }
        } else {
            throw new IllegalArgumentException(type.toString()+" is not a QueryEntity or a SearchEntity, so we cannot retrieve data for this type.  Override getData(request, param) or use a different type.");
        }

        param.setiTotalRecords(unfilteredCount);
        param.setiTotalDisplayRecords(result.getTotal());

        return result.getData();
    }

    private ListWrapper<T> queryWithTerm(String defaultQuery, Integer start, Integer count, String sort, String term) {
        String query = defaultQuery;

        if(StringUtils.isNotBlank(term)) {
            String likeClause = searchFields().stream().map( field -> {
                return new StringBuilder(field).append(" LIKE '%").append(term).append("%'").toString();
            }).collect(Collectors.joining(" OR "));

            query = new StringBuilder("(").append(defaultQuery).append(")")
                .append(" AND (").append(likeClause).append(")").toString();
        }

        return query(query, start, count, sort);
    }

    private ListWrapper<T> queryForCount(String query) {
        return query(query, 0, 1, null);
    }

    private ListWrapper<T> query(String query, Integer start, Integer count, String sort) {
        QueryParams params = ParamFactory.queryParams();
        params.setStart(start);
        params.setCount(count);
        params.setOrderBy(sort);
        params.setShowTotalMatched(true);

        return (ListWrapper<T>) bullhornData.query((Class<QueryEntity>) type, query, fields, params);
    }

    private ListWrapper<T> searchWithTerm(String defaultQuery, Integer start, Integer count, String sort, String filter) {
        String query = defaultQuery;

        if(StringUtils.isNotBlank(filter)) {
            String escapedFilter = filter.replaceAll("\\ ", "\\\\ ");

            String likeClause = searchFields().stream().map( field -> {
                return new StringBuilder(field).append(":").append(escapedFilter).toString();
            }).collect(Collectors.joining(" OR "));

            query = new StringBuilder("(").append(defaultQuery).append(")")
                    .append(" AND (").append(likeClause).append(")").toString();
        }

        return search(query, start, count, sort);
    }

    private ListWrapper<T> searchForCount(String query) {
        return search(query, 0, 1, null);
    }

    private ListWrapper<T> search(String query, Integer start, Integer count, String sort) {
        SearchParams params = ParamFactory.searchParams();
        params.setStart(start);
        params.setCount(count);
        params.setSort(sort);
//        params.setShowTotalMatched(true);

        return (ListWrapper<T>) bullhornData.search((Class<SearchEntity>) type, query, fields, params);
    }

    @Override
    protected Integer getId(T entity) {
        return entity.getId();
    }

    private ColumnConfiguration columnConfiguration;

    private synchronized ColumnConfiguration getStandardColumnConfiguration() {
        if(this.columnConfiguration == null) {
            try {
                this.columnConfiguration = convertEntityToColumns(type.newInstance());
            } catch(NullPointerException | InstantiationException | IllegalAccessException e) {
                getLog().error("Error getting a standard instance of ColumnConfiguration.  The convertEntityToColumns method must be able to handle a brand new instance of your table entity.  A default constructor is also required.");
            }
        }

        return this.columnConfiguration;
    }

    protected BullhornData getBullhornData() {
        return bullhornData;
    }

    protected Class<T> getType() {
        return type;
    }

}
