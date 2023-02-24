package com.client.core.base.util;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.client.core.base.tools.entitychanger.EntityChanger;
import com.google.common.collect.Lists;
import groovy.lang.MissingPropertyException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;

@Log4j2
public class TriggerUtil {

	@Autowired
	private static BullhornData BULLHORN_DATA;

	@Autowired
	private static EntityChanger ENTITY_CHANGER;

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

	public static <E extends BullhornEntity> E populateEntity(Integer entityID, Class<E> type, Map<String, Object> values, Supplier<E> constructor,
															  Set<String> fields) {
		E entity = Optional.of(entityID)
				.filter(id -> id != null && id > 0)
				.map(id -> BULLHORN_DATA.findEntity(type, id, fields))
				.orElseGet(constructor);

		values.entrySet().forEach( entry -> {
			try {
				ENTITY_CHANGER.setField(entity, entry.getKey(), entry.getValue());
			} catch(MissingPropertyException e) {
				log.error(e.getMessage());
			}
		});

		return entity;
	}

	public static <E extends BullhornEntity> OneToMany<E> convertIdListToEntityOneToMany(List<Map<String, Integer>> entityIds, Supplier<E> constructor){
		List<E> bullhornEntities = Lists.newArrayList();

		entityIds.stream().forEach(entityId -> {
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

		entityIds.stream().forEach(entityId -> {
			E entity = constructor.get();
			entity.setId(entityId);
			bullhornEntities.add(entity);
		});

		OneToMany<E> oneToMany = new OneToMany<>();
		oneToMany.setData(bullhornEntities);
		oneToMany.setTotal(bullhornEntities.size());
		return oneToMany;
	}

	public static <E extends BullhornEntity> void setSpecialField(E entity, Map<String,Object> valuesChanged, String sourceField, String targetField){
		ENTITY_CHANGER.setField(entity, targetField, ENTITY_CHANGER.retrieveField(valuesChanged, sourceField));
	}

}
