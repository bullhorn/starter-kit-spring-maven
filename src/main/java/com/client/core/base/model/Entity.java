package com.client.core.base.model;

/**
 * An entity 
 * 
 * @author magnus.palm
 * 
 * @param <ID> the type of the identifier for this entity
 */
public interface Entity<ID> {

    /**
     * Returns the unique identifier of the entity. Could be the primary key of a table row.
     * 
     * @return
     */
    public ID getId();

}
