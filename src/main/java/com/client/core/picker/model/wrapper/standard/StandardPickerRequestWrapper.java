package com.client.core.picker.model.wrapper.standard;


import com.client.core.picker.model.wrapper.PickerRequestWrapper;

public class StandardPickerRequestWrapper implements PickerRequestWrapper {
	
	public static final Integer DEFAULT_START = 0;
	public static final Integer DEFAULT_COUNT = 20;

	private String queryString;
	private Integer start;
	private Integer count;
	private String additionalLogic = "";
	
	private String callback;

	public StandardPickerRequestWrapper() {
		super();
	}

	private StandardPickerRequestWrapper(Integer start, String queryString, Integer count, String additionalLogic) {
		super();
		this.queryString = queryString;
		this.start = start;
		this.count = count;
		this.additionalLogic = additionalLogic;
	}

	public static StandardPickerRequestWrapper instanceOf(Integer start, String queryString, Integer count, String additionalLogic) {
		if (start == null) {
			start = DEFAULT_START;
		}
		if (count == null) {
			count = DEFAULT_COUNT;
		}

		return new StandardPickerRequestWrapper(start, queryString, count, additionalLogic);
	}

	public static PickerRequestWrapper instanceOf(Integer start, String queryString, Integer count) {
		return instanceOf(start, queryString, count, "");
	}
	
	public static PickerRequestWrapper instanceOf(String queryString, String additionalLogic) {
		return instanceOf(null, queryString, null, additionalLogic);
	}
	
	public static PickerRequestWrapper instanceOf(String queryString) {
		return instanceOf(queryString, null);
	}

	@Override
	public String getQueryString() {
		return queryString;
	}

	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	@Override
	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	@Override
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String getAdditionalLogic() {
		return additionalLogic;
	}

	public void setAdditionalLogic(String additionalLogic) {
		this.additionalLogic = additionalLogic;
	}

	@Override
	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StandardPickerRequestWrapper)) return false;

        StandardPickerRequestWrapper that = (StandardPickerRequestWrapper) o;

        if (queryString != null ? !queryString.equals(that.queryString) : that.queryString != null) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (additionalLogic != null ? !additionalLogic.equals(that.additionalLogic) : that.additionalLogic != null)
            return false;
        return !(callback != null ? !callback.equals(that.callback) : that.callback != null);

    }

    @Override
    public int hashCode() {
        int result = queryString != null ? queryString.hashCode() : 0;
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (additionalLogic != null ? additionalLogic.hashCode() : 0);
        result = 31 * result + (callback != null ? callback.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("StandardPickerRequestWrapper {")
                .append("\n\t\"additionalLogic\": ")
                .append("'")
                .append(additionalLogic).append('\'')
                .append(",\n\t\"queryString\": ")
                .append("'")
                .append(queryString).append('\'')
                .append(",\n\t\"start\": ")
                .append(start)
                .append(",\n\t\"count\": ")
                .append(count)
                .append(",\n\t\"callback\": ")
                .append("'")
                .append(callback).append('\'')
                .append('}')
                .toString();
    }
}