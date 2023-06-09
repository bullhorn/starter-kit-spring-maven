package com.client.core.base.dao.impl;

import com.client.core.base.dao.GenericDao;
import com.client.core.base.model.jpa.JpaEntity;
import com.client.core.base.tools.data.QueryResult;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory;
import org.hibernate.hql.spi.ParameterTranslations;
import org.hibernate.hql.spi.QueryTranslator;
import org.hibernate.hql.spi.QueryTranslatorFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StandardJpaDao<T extends JpaEntity<ID>, ID> implements GenericDao<T, ID> {

    private final QueryTranslatorFactory translatorFactory = new ASTQueryTranslatorFactory();

    private final SessionFactoryImplementor sessionFactory;
    private final EntityManager entityManager;

    private final Class<T> type;

    public StandardJpaDao(Class<T> type, EntityManagerFactory entityManagerFactory, EntityManager entityManager) {
        this.type = type;
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactoryImplementor.class);
        this.entityManager = entityManager;
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
        return this.queryForList(queryString, queryParameters, null, limit);
    }

    private List<T> queryForList(String queryString, Map<String, Object> queryParameters, Integer start, Integer limit) {
        TypedQuery<T> query = entityManager.createQuery(queryString, type);

        if (queryParameters != null) {
            for (Map.Entry<String, Object> entry : queryParameters.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }

        return getData(query, start, limit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public QueryResult<T> query(String queryString, Map<String, Object> queryParameters, Integer start, Integer limit) {
        TypedQuery<T> query = entityManager.createQuery(queryString, type);

        if (queryParameters != null) {
            for (Map.Entry<String, Object> entry : queryParameters.entrySet()) {
                query.setParameter(entry.getKey(), entry.getValue());
            }
        }

        return new QueryResult<>(getData(query, start, limit), getTotal(query));
    }

    /**
     * {@inheritDoc}
     */
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

    private List<T> getData(TypedQuery<T> query, Integer start, Integer limit) {
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
        String hqlQuery = query.unwrap(org.hibernate.query.Query.class).getQueryString();

        QueryTranslator translator = translatorFactory.createQueryTranslator(hqlQuery, hqlQuery, EMPTY, sessionFactory, null);

        translator.compile(EMPTY, false);

        String sqlQuery = new StringBuilder("SELECT COUNT(*) FROM (").append(translator.getSQLString())
                .append(") x").toString();

        Query countQuery = entityManager.createNativeQuery(sqlQuery);

        ParameterTranslations parameterTranslations = translator.getParameterTranslations();

        // All parameters are named. As such, getPosition() returns null
        query.getParameters().stream()
                .map(Parameter::getName)
                .map(parameterTranslations::getNamedParameterInformation)
                .forEach(namedParameterInformation -> {
                    Object value = query.getParameterValue(namedParameterInformation.getSourceName());
                    Arrays.stream(namedParameterInformation.getSourceLocations())
                            .forEachOrdered(location -> countQuery.setParameter(location + 1, value));
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
