package com.client.core.base.service.transaction;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import com.client.core.base.model.jpa.JpaEntity;

/**
 * Service used to wrap DAO calls with transaction-specific code
 * so as to remove that dependency on code interacting with a database.
 * This object can be directly interacted with without any regards to handling
 * a database transaction or seswsion.
 *
 * @param <T> the type of the entity with which we will be interacting with the database
 * @param <PK> the id of the entity with which we will be interacting with the database
 */
public interface TransactionService<T extends JpaEntity<PK>, PK> {

	/**
	 * Adds an object of type T.
	 * 
	 * @param transientObject The object to be added
	 */
	public void add(T transientObject);
	
	/**
	 * Adds or updates an object of type T
	 * 
	 * @param transientObject The object to be added/updated
	 * @return the object just added/updated
	 */
	public T merge(T transientObject);

	/**
	 * Get a T record using it's id
	 * @param id the primary key of the entity
	 * @return the entity of type T
	 * @throws EntityNotFoundException when no entity with primary key PK exists
	 */
	public T find(PK id) throws EntityNotFoundException;

	/**
	 * Gets a List<T> of all entities in table
	 * 
	 * @return a List<T>. If no entities exists an empty List<T> will be returned.
	 */
	public List<T> findAll();

	/**
	 * Deletes entity T from table.
	 * 
	 * @param persistentObject Entity to delete
	 * @throws EntityNotFoundException if the instance is not an entity or is a detached entity
	 */
	public void remove(T persistentObject) throws EntityNotFoundException;
	
	
	/**
	 * Queries the current table using the passed in where clause
	 * @param queryString a query string
	 * @param queryParameters parameters to inject into the queryString
     *
	 * @return a List<T> of all entities filtered by the passed query
	 */
	public List<T> query(String queryString, Map<String, Object> queryParameters);


	/**
	 * Updates all entities passed in and returns a list of the updated objects
	 * @param transientObjects List<T> of objects to update
	 * 
	 * @return a List<T> of all updated entities
	 */
	public List<T> batchUpdate(List<T> transientObjects);

}
