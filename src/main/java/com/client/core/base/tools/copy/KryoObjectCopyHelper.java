package com.client.core.base.tools.copy;

import com.esotericsoftware.kryo.Kryo;
import de.javakaffee.kryoserializers.jodatime.JodaDateTimeSerializer;
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
