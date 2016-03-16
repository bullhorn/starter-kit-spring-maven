package com.client.core.security.tools;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;

public abstract class Encryption {
	
	public static byte[] base64Decode(String encrypedAndEncoded) {
		return Base64.decodeBase64(encrypedAndEncoded);
	}

	public static String base64Encode(byte[] value) {
		return StringUtils.newStringUtf8(Base64.encodeBase64(value));
	}
	
}
