package com.client.core.base.service.transaction;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import com.client.core.base.model.jpa.JpaEntity;
import com.client.core.base.tools.data.QueryResult;

/**
 * Service used to wrap DAO calls with transaction-specific code
 * so as to remove that dependency on code interacting with a database.
 * This object can be directly interacted with without any regards to handling
 * a database transaction or seswsion.
 *
 * @param <T> the type of the entity with which we will be interacting with the database
 * @param <ID> the id of the entity with which we will be interacting with the database
 */
public interface TransactionService<T extends JpaEntity<ID>, ID> {

	/**
	 * Adds an object of type T.
	 * 
	 * @param transientObject The object to be added
	 */
	void add(T transientObject);
	
	/**
	 * Adds or updates an object of type T
	 * 
	 * @param transientObject The object to be added/updated
	 * @return the object just added/updated
	 */
	T merge(T transientObject);

	/**
	 * Get a T record using it's id
	 * @param id the primary key of the entity
	 * @return the entity of type T
	 * @throws EntityNotFoundException when no entity with primary key ID exists
	 */
	T find(ID id) throws EntityNotFoundException;

	/**
	 * Gets a List<T> of all entities in table
	 * 
	 * @return a List<T>. If no entities exists an empty List<T> will be returned.
	 */
	List<T> findAll();

	/**
	 * Deletes entity T from table.
	 * 
	 * @param persistentObject Entity to delete
	 * @throws EntityNotFoundException if the instance is not an entity or is a detached entity
	 */
	void remove(T persistentObject) throws EntityNotFoundException;

    /**
     * Deletes entity T with ID id from table.
     *
     * @param id id of entity to delete
     * @throws EntityNotFoundException if the instance is not an entity or is a detached entity
     */
    void remove(ID id) throws EntityNotFoundException;
	
	
	/**
	 * Queries the current table using the passed in where clause
	 * @param queryString a query string
	 * @param queryParameters parameters to inject into the queryString
     *
	 * @return a List<T> of all entities filtered by the passed query
	 */
	List<T> query(String queryString, Map<String, Object> queryParameters);

    /**
     * Query using the passed in query, with named parameters contained in the queryParameters. If no queryParams needed pass in null for
     * queryParams and have no named parameters in the query.
     *
     * Example: queryString = "SELECT * FROM Person p WHERE p.name = :name"; queryParam = Map containing "name":"Mr Toad"
     *
     * <p>
     * <b> Do not concatenate the queryString with parameters before passing it in to this method! We should be using named parameters via
     * the queryParamters to avoid SQL-injection attacks. </b>
     * </p>
     *
     * @param queryString The query to execute, with named parameters if needed
     * @param queryParameters The parameters that will be used for the query. If null then query executes without params.
     * @param limit the maximum number of elements to return
     * @return  a List<T> of entities matching the passed in query, with maximum size equal to the passed in limit
     */
    List<T> query(String queryString, Map<String, Object> queryParameters, Integer limit);

    /**
     * Query using the passed in query, with named parameters contained in the queryParameters. If no queryParams needed pass in null for
     * queryParams and have no named parameters in the query.
     *
     * Example: queryString = "SELECT * FROM Person p WHERE p.name = :name"; queryParam = Map containing "name":"Mr Toad"
     *
     * <p>
     * <b> Do not concatenate the queryString with parameters before passing it in to this method! We should be using named parameters via
     * the queryParamters to avoid SQL-injection attacks. </b>
     * </p>
     *
     * @param queryString The query to execute, with named parameters if needed
     * @param queryParameters The parameters that will be used for the query. If null then query executes without params.
     * @param start the index of the record which we want to be the first returned based on the sort in the queryString
     * @param limit the maximum number of elements to return
     * @return a List<T> of entities matching the passed in query, with maximum size equal to the passed in limit.  The first element will
     *          be the [start]th element in the overall result set
     */
    QueryResult<T> query(String queryString, Map<String, Object> queryParameters, Integer start, Integer limit);

    /**
     * Returns the total number of records matching the query and parameters passed in
     *
     * @param queryString the query to get the total number of records for
     * @param queryParameters the named parameters that will be injected into the query
     * @return the total number of records matching the query
     */
    Long getCount(String queryString, Map<String, Object> queryParameters);


	/**
	 * Updates all entities passed in and returns a list of the updated objects
	 * @param transientObjects List<T> of objects to update
	 * 
	 * @return a List<T> of all updated entities
	 */
	List<T> batchUpdate(List<T> transientObjects);

    Class<T> getType();

}
