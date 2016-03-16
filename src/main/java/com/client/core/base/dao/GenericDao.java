package com.client.core.base.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

/**
 * Generic data-access-object.  Provides database access for a given entity type, represented by a domain class, typically a POJO
 * 
 * @author magnus.palm
 * 
 * @param <T> the entity type
 * @param <ID> the primary key of entity
 */
public interface GenericDao<T, ID> {

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
	 * Adds or updates an object of type T and returns the ID
	 * 
	 * @param transientObject The object to be added/updated
	 * @return the ID of the object just added/updated
	 */
	public ID mergeAndReturnID(T transientObject);

	/**
	 * Get a T record using it's id
	 * 
	 * @param id the primary key of the entity
	 * @return the entity of type T
	 * @throws EntityNotFoundException when no entity with unique identifier ID exists
	 */
	public T find(ID id) throws EntityNotFoundException;

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
	 * Query using the passed in query, with named parameters contained in the queryParameters. If no queryParams needed pass in null for
	 * queryParams and have no named parameters in the query.
	 * <br><br>
	 * Example: queryString = "SELECT * FROM Person p WHERE p.name = :name"; queryParam = Map containing "name":"Mr Toad"
	 * 
	 * <p>
	 * <b> Do not concatenate the queryString with parameters before passing it in to this method! We should be using named parameters via
	 * the queryParamters to avoid SQL-injection attacks. </b>
	 * </p>
	 * 
	 * @param queryString The query to execute, with named parameters if needed
	 * @param queryParameters The parameters that will be used for the query. If null then query executes without params.
	 * @return a List<T> of entities matching the passed in query
	 */
	public List<T> query(String queryString, Map<String, Object> queryParameters);

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
    public List<T> query(String queryString, Map<String, Object> queryParameters, Integer limit);

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
    public List<T> query(String queryString, Map<String, Object> queryParameters, Integer start, Integer limit);

	/**
	 * Handles batch insert or batch update.
	 * 
	 * @param listToMerge the list of elements to merge
	 */
	public void batchMerge(List<T> listToMerge);

	/**
	 * Added for testing
	 * 
	 * @param entityManager the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager);

}