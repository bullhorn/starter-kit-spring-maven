package com.client.core.soap.tools.id;

import com.bullhorn.entity.AbstractDto;

public interface EntityIdHelper<T extends AbstractDto, ID> {

    /**
     * Will return the unique identifier for the T entity
     * @param entity
     * @return
     */
    public ID getEntityId(T entity);
    

}
