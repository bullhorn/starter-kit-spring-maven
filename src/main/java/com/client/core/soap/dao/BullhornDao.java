package com.client.core.soap.dao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.apiservice.result.ApiSaveResult;
import com.bullhorn.entity.AbstractDto;
import com.bullhorn.entity.ApiEntityName;
import com.client.core.soap.service.BullhornAPI;
import com.client.core.base.dao.GenericDao;
import com.client.core.soap.tools.id.EntityIdHelper;
import com.client.core.soap.tools.id.EntityIdHelperFactory;

/**
 * Encapsulates Bullhorn api calls in a GenericDao, this dao can then replace other GenericDaos when needed.
 * 
 * @author magnus.palm
 * 
 * @param <T>
 */
public class BullhornDao<T extends AbstractDto> implements GenericDao<T, Integer> {

    private static final int DEFAULT_MAX_RESULTS = 1000;
    private static final int DEFAULT_START = 0;

	private final Class<T> type;
	private final ApiEntityName entityName;
	private final EntityIdHelper<T, Integer> entityIdHelper;

	public BullhornDao(Class<T> type) {
		this.type = type;
		this.entityName = getEntityTypeName(type);
		this.entityIdHelper = EntityIdHelperFactory.getEntityIdHelper(type);
	}

	@Autowired
	private BullhornAPI bullhornApi;

	@Override
	public void add(T transientObject) {
		bullhornApi.save(transientObject);

	}

	@Override
	public T merge(T transientObject) {
		ApiSaveResult result = bullhornApi.save(transientObject);
		return (T) result.getDto();
	}

	@Override
	public Integer mergeAndReturnID(T transientObject) {
		ApiSaveResult result = bullhornApi.save(transientObject);

		T entity = (T) result.getDto();

		return entityIdHelper.getEntityId(entity);
	}

	@Override
	public T find(Integer id) throws EntityNotFoundException {
		return bullhornApi.findEntity(entityName.value(), id);
	}

	@Override
	public List<T> findAll() {
		DtoQuery dtoQuery = new DtoQuery();
		dtoQuery.setEntityName(entityName.value());
		dtoQuery.setMaxResults(1000);

		return bullhornApi.getQueryResults(entityName.value(), dtoQuery);
	}

	@Override
	public void remove(T persistentObject) throws EntityNotFoundException {
		bullhornApi.delete(persistentObject);
	}

	public List<T> query(String whereClause) {
		DtoQuery dtoQuery = new DtoQuery();
		dtoQuery.setEntityName(entityName.value());
		dtoQuery.setMaxResults(DEFAULT_MAX_RESULTS);

		if (whereClause != null && whereClause.trim().length() > 0) {
			dtoQuery.setWhere(whereClause);
		}

		return bullhornApi.getQueryResults(entityName.value(), dtoQuery);
	}
	
	@Override
	public List<T> query(String queryString, Map<String, Object> queryParameters) {
        return this.query(queryString, queryParameters, DEFAULT_MAX_RESULTS);
	}

    @Override
    public List<T> query(String queryString, Map<String, Object> queryParameters, Integer limit) {
        DtoQuery dtoQuery = new DtoQuery();
        dtoQuery.setEntityName(entityName.value());
        dtoQuery.setMaxResults(limit);

        List<DtoQuery.Parameters.Entry> entries = queryParameters.entrySet().parallelStream().map( entry -> {
            DtoQuery.Parameters.Entry queryEntry = new DtoQuery.Parameters.Entry();

            queryEntry.setKey(entry.getKey());
            queryEntry.setValue(entry.getValue());

            return queryEntry;
        }).collect(Collectors.toList());

        DtoQuery.Parameters parameters = new DtoQuery.Parameters();
        parameters.getEntry().addAll(entries);

        dtoQuery.setParameters(parameters);

        return bullhornApi.getQueryResults(entityName.value(), dtoQuery);
    }

    @Override
    public List<T> query(String queryString, Map<String, Object> queryParameters, Integer limit, Integer start) {
        throw new UnsupportedOperationException();
    }

	@Override
	public void setEntityManager(EntityManager entityManager)  {
		System.out.println("BullhornDao.setEntityManager not implemented");

	}

	public Class<T> getType() {
		return type;
	}

	public ApiEntityName getEntityName() {
		return entityName;
	}

	public BullhornAPI getBullhornApi() {
		return bullhornApi;
	}

	public void setBullhornApi(BullhornAPI bullhornApi) {
		this.bullhornApi = bullhornApi;
	}

	/**
	 * The entity id helper is used to get the id of the generic entity T. Each type will need its own implementation of the
	 * EntityIdHelper to handle how to return the id.
	 * 
	 * @return
	 */
	public EntityIdHelper<T, Integer> getEntityIdHelper() {
		return entityIdHelper;
	}

	private ApiEntityName getEntityTypeName(Class<T> type) {
		String dtoClassName = type.getSimpleName();
		String entityNameString = dtoClassName.replace("Dto", "");
		return ApiEntityName.fromValue(entityNameString);

	}

    @Override
    public void batchMerge(List<T> listToMerge) {
        System.out.println("BullhornDao.batchMerge not implemented");
        
    }



}
