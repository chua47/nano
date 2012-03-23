package com.tpt.nano.transform;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

import com.tpt.nano.custom.types.Duration;
import com.tpt.nano.custom.types.Time;

/**
 * Transformer for java primitive types and frequently used java types
 * 
 * @author bulldog
 *
 */
public class Transformer {
	
	// Transformable cache
	private static final Map<Class<?>, Transformable<?>> cache = new ConcurrentHashMap<Class<?>, Transformable<?>>();
	
	public static Object read(String value, Class<?> type) throws Exception {
		Transformable<?> transfrom = lookup(type);

		if (transfrom == null) {
			throw new IllegalArgumentException("Transform of " + type
					+ " not supported");
		}
		return transfrom.read(value);
	}

	@SuppressWarnings("unchecked")
	public static String write(Object value, Class<?> type) throws Exception {
		@SuppressWarnings("rawtypes")
		Transformable transfrom = lookup(type);

		if (transfrom == null) {
			throw new IllegalArgumentException("Transform of " + type
					+ " not supported");
		}
		return transfrom.write(value);
	}
	
	public static boolean isTransformable(Class<?> type) throws Exception {
		return lookup(type) != null;
	}
	
	/**
	 * Register custom transformable for a Java primitive type or a frequently used Java type. 
	 * 
	 * @param type a Java primitive type or a frequently used Java type.
	 * @param transform a class implementing @see com.tpt.nano.transform.Trnsformable interface.
	 */
	public static void register(Class<?> type, Transformable<?> transform) {
		cache.put(type, transform);
	}

	private static Transformable<?> lookup(Class<?> type) {
		Transformable<?> transform = cache.get(type);

		if (transform != null) {
			return transform;
		}

		transform = getTransform(type);
		if (transform != null) {
			cache.put(type, transform);
		}

		return transform;
	}
	
	private static Transformable<?> getTransform(Class<?> type) {
		Transformable<?> converter = null;

		if (type.isPrimitive()) {
			converter = getPrimitiveTransform(type);
		}

		if (type.isEnum()) {
			converter = new EnumTransform(type);
		}

		String name = type.getName();

		if (name.startsWith("java.lang")) {
			converter = getLanguageTransform(type);
		}
		if (name.startsWith("java.util")) {
			converter = getUtilTransform(type);
		}
		if (name.startsWith("java.math")) {
			converter = getMathTransform(type);
		}
		if (name.startsWith("java.net")) {
			converter = new UrlTransform();
		}
		if (name.startsWith("com.ebay.jxb.type")) {
			converter = getCustomTransform(type);
		}

		return converter;
	}
	
	// Get nano framework custom type Transformable
	private static Transformable<?> getCustomTransform(Class<?> type) {
		if (type == Duration.class) {
			return new DurationTransform();
		}
		if (type == Time.class) {
			return new TimeTransform();
		}
		return null;
	}
	
	// Get Java primitive type Transformable
	private static Transformable<?> getPrimitiveTransform(Class<?> type) {
		if (type == int.class) {
			return new IntegerTransform();
		}
		if (type == boolean.class) {
			return new BooleanTransform();
		}
		if (type == long.class) {
			return new LongTransform();
		}
		if (type == double.class) {
			return new DoubleTransform();
		}
		if (type == float.class) {
			return new FloatTransform();
		}
		if (type == short.class) {
			return new ShortTransform();
		}
		if (type == byte.class) {
			return new ByteTransform();
		}
		if (type == char.class) {
			return new CharacterTransform();
		}
		return null;
	}
	
	// Get Java primitive wrapping type Transformable
	private static Transformable<?> getLanguageTransform(Class<?> type) {
		if (type == Boolean.class) {
			return new BooleanTransform();
		}
		if (type == Integer.class) {
			return new IntegerTransform();
		}
		if (type == Long.class) {
			return new LongTransform();
		}
		if (type == Double.class) {
			return new DoubleTransform();
		}
		if (type == Float.class) {
			return new FloatTransform();
		}
		if (type == Short.class) {
			return new ShortTransform();
		}
		if (type == Byte.class) {
			return new ByteTransform();
		}
		if (type == Character.class) {
			return new CharacterTransform();
		}
		if (type == String.class) {
			return new StringTransform();
		}
		return null;
	}
	
	// Get java.math type Transformable
	private static Transformable<?> getMathTransform(Class<?> type) {
		if (type == BigDecimal.class) {
			return new BigDecimalTransform();
		}
		if (type == BigInteger.class) {
			return new BigIntegerTransform();
		}
		return null;
	}
	
	// Get java.util type Transformable
	private static Transformable<?> getUtilTransform(Class<?> type) {
		if (type == Date.class) {
			return new DateTransform();
		}
		if (type == Locale.class) {
			return new LocaleTransform();
		}
		if (type == Currency.class) {
			return new CurrencyTransform();
		}
		if (type == Calendar.class) {
			return new CalendarTransform();
		}
		if (type == TimeZone.class) {
			return new TimeZoneTransform();
		}
		return null;
	}

}
