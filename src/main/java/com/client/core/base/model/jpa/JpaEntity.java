package com.client.core.base.model.jpa;

import com.client.core.base.model.Entity;

import java.util.Date;

public interface JpaEntity<ID> extends Entity<ID>{

	/**
	 * Returns the primary key of this entity
	 * 
	 * @return
	 */
    @Override
	ID getId();

	void setId(ID id);

	/**
	 * Returns the date of when the record was added
	 * 
	 * @return the dateAdded
	 */
	Date getDateAdded();

	void setDateAdded(Date dateAdded);

	/**
	 * Returns the date when the record was last updated
	 * 
	 * @return the dateUpdated
	 */
	Date getDateUpdated();

	/**
	 * Does not actually set the dateUpdated, here so that form binding will not fail. To update the dateUpdate use overrideDateUpdate
     *
	 * @param dateUpdated
	 */
	void setDateUpdated(Date dateUpdated);

	
}
