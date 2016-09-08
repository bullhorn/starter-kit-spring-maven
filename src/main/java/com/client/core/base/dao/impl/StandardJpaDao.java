package com.client.core.base.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory;
import org.hibernate.hql.spi.ParameterTranslations;
import org.hibernate.hql.spi.QueryTranslator;
import org.hibernate.hql.spi.QueryTranslatorFactory;

import com.client.core.AppContext;
import com.client.core.base.dao.GenericDao;
import com.client.core.base.model.jpa.JpaEntity;
import com.client.core.base.tools.data.QueryResult;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Jpa implementation of GenericDao
 * 
 * @author magnus.palm
 * 
 * @param <T> Type of entity
 * @param <ID> Type of primary key of entity
 */
public class StandardJpaDao<T extends JpaEntity<ID>, ID> implements GenericDao<T, ID> {

    private final QueryTranslatorFactory translatorFactory = new ASTQueryTranslatorFactory();
    private final SessionFactoryImplementor sessionFactory;
    private final EntityManager entityManager;

    private final Class<T> type;

    public StandardJpaDao(Class<T> type) {
        this.type = type;

        EntityManagerFactory entityManagerFactory = AppContext.getApplicationContext().getBean("entityManagerFactory", EntityManagerFactory.class);

        this.sessionFactory = (SessionFactoryImplementor) entityManagerFactory.unwrap(SessionFactory.class);
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public StandardJpaDao(EntityManagerFactory entityManagerFactory, Class<T> type) {
        this.type = type;
        this.sessionFactory = (SessionFactoryImplementor) entityManagerFactory.unwrap(SessionFactory.class);
        this.entityManager = entityManagerFactory.createEntityManager();
    }

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
        return this.queryForList(queryString, queryParameters, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> query(String queryString, Map<String, Object> queryParameters, Integer limit) {
        return this.queryForList(queryString, queryParameters, limit, null);
    }

    private List<T> queryForList(String queryString, Map<String, Object> queryParameters, Integer limit, Integer start) {
        TypedQuery<T> query = entityManager.createQuery(queryString, type);

        if (queryParameters != null) {
            for (Map.Entry<String, Object> entry : queryParameters.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }

        return getData(query, limit, start);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryResult<T> query(String queryString, Map<String, Object> queryParameters, Integer limit, Integer start) {
        TypedQuery<T> query = entityManager.createQuery(queryString, type);

        if (queryParameters != null) {
            for (Map.Entry<String, Object> entry : queryParameters.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }

        return new QueryResult<>(getData(query, limit, start), getTotal(query));
    }

    @Override
    public Long getCount(String queryString, Map<String, Object> queryParameters) {
        TypedQuery<T> query = entityManager.createQuery(queryString, type);

        if (queryParameters != null) {
            for (Map.Entry<String, Object> entry : queryParameters.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }

        return getTotal(query);
    }

    private List<T> getData(TypedQuery<T> query, Integer limit, Integer start) {
        if(limit != null && limit > 0) {
            query.setMaxResults(limit);
        }

        if(start != null && start > 0) {
            query.setFirstResult(start);
        }

        List<T> values = query.getResultList();

        return values == null ? Lists.newArrayList() : values;
    }

    private static final Map<String, Object> EMPTY = Maps.newLinkedHashMap();

    private Long getTotal(TypedQuery<T> query) {
        String hqlQuery = query.unwrap(org.hibernate.Query.class).getQueryString();

        QueryTranslator translator = translatorFactory.createQueryTranslator(hqlQuery, hqlQuery, EMPTY, sessionFactory, null);

        translator.compile(EMPTY, false);

        String sqlQuery = new StringBuilder("SELECT COUNT(*) FROM (").append(translator.getSQLString())
                .append(") x").toString();

        Query countQuery = entityManager.createNativeQuery(sqlQuery);

        ParameterTranslations parameterTranslations = translator.getParameterTranslations();

        query.getParameters().stream().forEach( parameter -> {
            String name = parameter.getName();

            for(int position : parameterTranslations.getNamedParameterSqlLocations(name)) {
                countQuery.setParameter(position+1, query.getParameterValue(name));
            };
        });

        return ((Number) countQuery.getSingleResult()).longValue();
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

    @Override
    public Class<T> getType() {
        return type;
    }
}
