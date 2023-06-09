package com.client.core.base.tools.copy;

import com.bullhornsdk.data.util.copy.JodaDateTimeSerializer;
import com.esotericsoftware.kryo.Kryo;
import org.joda.time.DateTime;

public class KryoObjectCopyHelper {

	public static <T> T copy(T entity) {
		Kryo kryo = new Kryo();

		kryo.register( DateTime.class, new JodaDateTimeSerializer() );

		return kryo.copy(entity);
	}

	public static <T> T copyShallow(T entity) {
		Kryo kryo = new Kryo();

		kryo.register( DateTime.class, new JodaDateTimeSerializer() );

		return kryo.copyShallow(entity);
	}

}
