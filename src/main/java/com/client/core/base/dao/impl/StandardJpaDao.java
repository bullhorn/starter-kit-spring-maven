package com.client.core.base.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.client.core.base.dao.GenericDao;
import com.client.core.base.model.jpa.JpaEntity;
import com.google.common.collect.Lists;

/**
 * Jpa implementation of GenericDao
 * 
 * @author magnus.palm
 * 
 * @param <T> Type of entity
 * @param <ID> Type of primary key of entity
 */
public class StandardJpaDao<T extends JpaEntity<ID>, ID> implements GenericDao<T, ID> {

    private final Class<T> type;

    public StandardJpaDao(Class<T> type) {
        this.type = type;
    }

    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(T transientObject) {
        entityManager.persist(transientObject);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T merge(T transientObject) {
        return entityManager.merge(transientObject);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ID mergeAndReturnID(T transientObject) {
        return entityManager.merge(transientObject).getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T find(ID id) throws EntityNotFoundException {
        T entity = entityManager.find(type, id);

        // if entity is null it did not exist
        if (entity == null) {
            throw new EntityNotFoundException("Entity does not exist. Unable to find.");
        }
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> findAll() {
        String queryString = "SELECT a FROM " + type.getName() + " a ";
        TypedQuery<T> query = entityManager.createQuery(queryString, type);
        List<T> obs = query.getResultList();
        return obs;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(T persistentObject) throws EntityNotFoundException {
        try {
            entityManager.remove(persistentObject);
        } catch (IllegalArgumentException e) {
            throw new EntityNotFoundException("Entity does not exist. Unable to delete.");
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> query(String queryString, Map<String, Object> queryParameters) {
        return this.query(queryString, queryParameters, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> query(String queryString, Map<String, Object> queryParameters, Integer limit) {
        return this.query(queryString, queryParameters, limit, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> query(String queryString, Map<String, Object> queryParameters, Integer limit, Integer start) {
        TypedQuery<T> query = entityManager.createQuery(queryString, type);

        if (queryParameters != null) {
            for (Map.Entry<String, Object> entry : queryParameters.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }

        if(limit != null && limit > 0) {
            query.setMaxResults(limit);
        }

        if(start != null && start > 0) {
            query.setFirstResult(start);
        }

        List<T> values = query.getResultList();

        return values == null ? Lists.newArrayList() : values;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void batchMerge(List<T> listToMerge) {
        if (listToMerge != null && listToMerge.size() > 0) {

            for (T entity : listToMerge) {
                entityManager.merge(entity);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
