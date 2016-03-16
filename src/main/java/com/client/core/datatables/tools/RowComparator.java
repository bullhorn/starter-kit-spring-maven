package com.client.core.datatables.tools;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Comparator;
import java.util.Date;

import org.joda.time.DateTime;

import com.client.core.datatables.service.DataTablesService;

public class RowComparator<T> implements Comparator<T> {

    private final JQueryDataTableParamModel param;

    private final DataTablesService<T, ?> dataTablesService;

    public RowComparator(JQueryDataTableParamModel param, DataTablesService<T,?> dataTablesService) {
        super();
        this.param = param;
        this.dataTablesService = dataTablesService;
    }

    @Override
    public int compare(T rowOne, T rowTwo) {

        return compareTwoRows(rowOne, rowTwo);
    }

    private int compareTwoRows(T rowOne, T rowTwo) {
        int sortColumnIndex = param.getiSortColumnIndex();
        int sortDirection = param.getsSortDirection().equals("asc") ? -1 : 1;

        Object valueFromRowOne = dataTablesService.convertEntityToColumns(rowOne).getColumn(sortColumnIndex).getValue();
        Object valueFromRowTwo = dataTablesService.convertEntityToColumns(rowTwo).getColumn(sortColumnIndex).getValue();

        if (valueFromRowOne == null && valueFromRowTwo == null) {
            return 0;
        }
        if (valueFromRowOne == null) {
            return -1 * sortDirection;
        }
        if (valueFromRowTwo == null) {
            return 1 * sortDirection;
        }

        if (valueFromRowOne instanceof Date) {
            Date a = (Date) valueFromRowOne;
            Date b = (Date) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        
        if (valueFromRowOne instanceof DateTime) {
            DateTime a = (DateTime) valueFromRowOne;
            DateTime b = (DateTime) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof java.sql.Date) {
            java.sql.Date a = (java.sql.Date) valueFromRowOne;
            java.sql.Date b = (java.sql.Date) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Timestamp) {
            Timestamp a = (Timestamp) valueFromRowOne;
            Timestamp b = (Timestamp) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Time) {
            Time a = (Time) valueFromRowOne;
            Time b = (Time) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Character) {
            Character a = (Character) valueFromRowOne;
            Character b = (Character) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof String) {
            String a = (String) valueFromRowOne;
            String b = (String) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Short) {
            Short a = (Short) valueFromRowOne;
            Short b = (Short) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Integer) {
            Integer a = (Integer) valueFromRowOne;
            Integer b = (Integer) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Long) {
            Long a = (Long) valueFromRowOne;
            Long b = (Long) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof BigDecimal) {
            BigDecimal a = (BigDecimal) valueFromRowOne;
            BigDecimal b = (BigDecimal) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Double) {
            Double a = (Double) valueFromRowOne;
            Double b = (Double) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Float) {
            Float a = (Float) valueFromRowOne;
            Float b = (Float) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }
        if (valueFromRowOne instanceof Boolean) {
            Boolean a = (Boolean) valueFromRowOne;
            Boolean b = (Boolean) valueFromRowTwo;
            return a.compareTo(b) * sortDirection;
        }

        return 0;

    }

}
