package com.client.core.base.model;

public interface Entity<ID> {

    /**
     * Returns the unique identifier of the entity. Could be the primary key of a table row.
     * 
     * @return
     */
    ID getId();

}
