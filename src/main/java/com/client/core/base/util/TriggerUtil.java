package com.client.core.base.util;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.client.core.AppContext;
import com.client.core.base.service.meta.BullhornEntityMetaService;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.google.common.collect.Lists;
import groovy.lang.MissingPropertyException;
import org.apache.log4j.Logger;

/**
 * Created by johnsully83 on 25/08/2016.
 */
public class TriggerUtil {

	private static final Logger log = Logger.getLogger(TriggerUtil.class);

	public static boolean isError(String key) {
		key = key.toLowerCase();

		if (key.startsWith("error") || key.startsWith("block") || key.startsWith("validation")) {
			return true;
		}

		return false;
	}

	public static boolean isReturnValue(String key) {
		if (key.toLowerCase().startsWith("returnvalue:")) {
			return true;
		}

		return false;
	}

	public static <E extends BullhornEntity> E populateEntity(Integer entityID, Class<E> type, Map<String, Object> values, Supplier<E> constructor) {
		E entity = Optional.of(entityID).filter(id -> {
			return id != null && id > 0;
		}).map( id -> {
			Set<String> fields = getBullhornEntityMetaService().getFieldNames(type);

			return getBullhornData().findEntity(type, id, fields);
		}).orElseGet(constructor);

		EntityChanger entityChanger = getEntityChanger();

		values.entrySet().forEach( entry -> {
			try {
				entityChanger.setField(entity, entry.getKey(), entry.getValue());
			} catch(MissingPropertyException e) {
				log.error(e.getMessage());
			}
		});

		return entity;
	}

	private static BullhornData BULLHORN_DATA;

	private synchronized static BullhornData getBullhornData() {
		if(TriggerUtil.BULLHORN_DATA == null) {
			TriggerUtil.BULLHORN_DATA = AppContext.getApplicationContext().getBean(BullhornData.class);
		}

		return BULLHORN_DATA;
	}

	private static EntityChanger ENTITY_CHANGER;

	private synchronized static EntityChanger getEntityChanger() {
		if(TriggerUtil.ENTITY_CHANGER == null) {
			TriggerUtil.ENTITY_CHANGER = AppContext.getApplicationContext().getBean(EntityChanger.class);
		}

		return ENTITY_CHANGER;
	}

	private static BullhornEntityMetaService BULLHORN_ENTITY_META_SERVICE;

	private synchronized static BullhornEntityMetaService getBullhornEntityMetaService() {
		if(TriggerUtil.BULLHORN_ENTITY_META_SERVICE == null) {
			TriggerUtil.BULLHORN_ENTITY_META_SERVICE = AppContext.getApplicationContext().getBean(BullhornEntityMetaService.class);
		}

		return BULLHORN_ENTITY_META_SERVICE;
	}

	public static <E extends BullhornEntity> OneToMany<E> convertIdListToEntityOneToMany(List<Map<String, Integer>> entityIds, Supplier<E> constructor){
		List<E> bullhornEntities = Lists.newArrayList();

		entityIds.stream().forEach(entityId ->{
			E entity = constructor.get();
			entity.setId(entityId.get("id"));
			bullhornEntities.add(entity);
		});

		OneToMany<E> oneToMany = new OneToMany<>();
		oneToMany.setData(bullhornEntities);
		oneToMany.setTotal(bullhornEntities.size());
		return oneToMany;
	}

	public static <E extends BullhornEntity> OneToMany<E> convertReplaceAllToEntityOneToMany(Map<String, List<Integer>> replaceAllIds, Supplier<E> constructor) {
		List<Integer> entityIds = replaceAllIds.get("replaceAll");

		List<E> bullhornEntities = Lists.newArrayList();

		entityIds.stream().forEach(entityId ->{
			E entity = constructor.get();
			entity.setId(entityId);
			bullhornEntities.add(entity);
		});

		OneToMany<E> oneToMany = new OneToMany<>();
		oneToMany.setData(bullhornEntities);
		oneToMany.setTotal(bullhornEntities.size());
		return oneToMany;
	}
}
