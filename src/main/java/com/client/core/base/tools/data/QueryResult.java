package com.client.core.base.tools.data;

import java.util.List;

import com.client.core.base.model.Entity;
import com.google.common.collect.Lists;

public class QueryResult<T extends Entity> {

    private List<T> data;
    private Long total;

    public QueryResult(List<T> data, Long total) {
        this.data = data == null ? Lists.newArrayList() : data;
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QueryResult)) return false;

        QueryResult<?> that = (QueryResult<?>) o;

        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        return total != null ? total.equals(that.total) : that.total == null;

    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (total != null ? total.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("QueryResult {")
                .append("\n\t\"data\": ")
                .append(data)
                .append(",\n\t\"total\": ")
                .append(total)
                .append('}')
                .toString();
    }
}
