package com.client.core.base.tools.entitychanger

interface EntityChanger {

    public <T, V> V retrieveField(T entity, String field, Class<V> type);

    public <T> Object retrieveField(T entity, String field);

    public <T> T setField(T entity, String field, Object value);

}
