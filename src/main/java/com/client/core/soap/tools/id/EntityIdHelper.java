package com.client.core.soap.tools.id;

import com.bullhorn.entity.AbstractDto;

/**
 * Interface for getting the unique identifier ID from an entity of any type T.
 * Implement this interface for your particular entity and return the primary key or other unique identifier
 * 
 * @author magnus.palm
 *
 * @param <T>
 * @param <ID>
 */
public interface EntityIdHelper<T extends AbstractDto, ID> {

    /**
     * Will return the unique identifier for the T entity
     * @param entity
     * @return
     */
    public ID getEntityId(T entity);
    

}
