package com.client.core.base.model.jpa;

import java.util.Date;

import com.client.core.base.model.Entity;

/**
 * Core interface that defines a jpa entity
 * 
 * @author magnus.palm
 * 
 * @param <ID> The primary key of the JpaEntity, most likely an Integer but could also be of a more complex type if needed.
 */
public interface JpaEntity<ID> extends Entity<ID>{

	/**
	 * Returns the primary key of this entity
	 * 
	 * @return
	 */
    @Override
	public ID getId();

	public void setId(ID id);

	/**
	 * Returns the date of when the record was added
	 * 
	 * @return the dateAdded
	 */
	public Date getDateAdded();

	public void setDateAdded(Date dateAdded);

	/**
	 * Returns the date when the record was last updated
	 * 
	 * @return the dateUpdated
	 */
	public Date getDateUpdated();

	/**
	 * Does not actually set the dateUpdated, here so that form binding will not fail. To update the dateUpdate use overrideDateUpdate
     *
	 * @param dateUpdated
	 */
	public void setDateUpdated(Date dateUpdated);

	
}
