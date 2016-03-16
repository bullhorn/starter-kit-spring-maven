package com.client.core.base.service.transaction.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import org.springframework.transaction.annotation.Transactional;

import com.client.core.base.dao.GenericDao;
import com.client.core.base.model.jpa.JpaEntity;
import com.client.core.base.service.transaction.TransactionService;

/**
 * Service used to wrap DAO calls with @{@link org.springframework.transaction.annotation.Transactional} annotations
 * so as to handle the transaction in a generic way.  Do NOT wrap any call to a TransactionService in
 * a @{@link org.springframework.transaction.annotation.Transactional} annotation.  The passed in DAO
 * is used for all database calls and defines what type of entity can be retrieved/inserted into
 * the database.
 *
 * @param <T> the type of entity which we will be interacting with the DAO with
 * @param <PK> the id of the entity which we will be interacting with the DAO with
 */
public class StandardTransactionService<T extends JpaEntity<PK>, PK> implements TransactionService<T, PK> {

	private final GenericDao<T, PK> genericDao;
	
	public StandardTransactionService(GenericDao<T, PK> genericDao) {
		super();
		this.genericDao=genericDao;
	}

    /**
     * {@inheritDoc}
     */
	@Override
	@Transactional(readOnly=false)
	public void add(T entity) {
		genericDao.add(entity);
	}

    /**
     * {@inheritDoc}
     */
	@Override
	@Transactional(readOnly=false)
	public T merge(T transientObject) {
		return genericDao.merge(transientObject);
	}

    /**
     * {@inheritDoc}
     */
	@Override
	@Transactional(readOnly=true)
	public T find(PK id) throws EntityNotFoundException {
		return genericDao.find(id);
	}

    /**
     * {@inheritDoc}
     */
	@Override
	@Transactional(readOnly=true)
	public List<T> findAll() {
		return genericDao.findAll();
	}

    /**
     * {@inheritDoc}
     */
	@Override
	@Transactional(readOnly=false)
	public void remove(T persistentObject) throws EntityNotFoundException {
		genericDao.remove(persistentObject);
	}

    /**
     * {@inheritDoc}
     */
	@Override
	@Transactional(readOnly=true)
	public List<T> query(String queryString, Map<String, Object> queryParameters) {
		return genericDao.query(queryString, queryParameters);
	}

    /**
     * {@inheritDoc}
     */
	@Override
	@Transactional(readOnly=false)
	public List<T> batchUpdate(List<T> transientObjects) {
		List<T> updatedEntities = new ArrayList<T>();
		
		for(T transientObject : transientObjects) {
			updatedEntities.add(genericDao.merge(transientObject));
		}
		
		return updatedEntities;
	}

}
