package com.client.core.security.tools;

import com.client.core.security.exception.CryptoException;
import com.google.common.base.Charsets;
import org.apache.commons.codec.DecoderException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

public class RC4 extends Encryption {

	private static final String ALGORITHM = "ARCFOUR";

	private static final Charset CHARSET = Charsets.UTF_8;

	public static String encryptAndEncode(String value, String hexKey) throws CryptoException {
		try {
			return base64Encode(encrypt(value, hexKey));
		} catch(Exception e) {
			throw new CryptoException("Error encrypting and base64 encoding value "+value+" with RC4 with passed in key", e);
		}
	}

	public static String decodeAndDecrypt(String value, String hexKey) throws CryptoException {
		try {
			return decrypt(base64Decode(value), hexKey);
		} catch (Exception e) {
			throw new CryptoException("Error base64 decoding and decrypting value "+value+" with RC4 with passed in key", e);
		}
	}

	public static byte[] encrypt(String input, String keyString) throws UnsupportedEncodingException, GeneralSecurityException, DecoderException {
		byte[] key = keyString.getBytes(CHARSET);

		return encrypt(input.getBytes(CHARSET), key);
	}

	public static String decrypt(byte[] input, String keyString) throws UnsupportedEncodingException, GeneralSecurityException, DecoderException {
		byte[] key = keyString.getBytes(CHARSET);

		return new String(decrypt(input, key), CHARSET);
	}

	private static byte[] encrypt(byte[] input, byte[] key) throws GeneralSecurityException {
		SecretKey keySpec = new SecretKeySpec(key, ALGORITHM);

		Cipher encrypter = Cipher.getInstance(ALGORITHM);
		encrypter.init(Cipher.ENCRYPT_MODE, keySpec);

		return encrypter.doFinal(input);
	}

	private static byte[] decrypt(byte[] input, byte[] key) throws GeneralSecurityException {
		SecretKey keySpec = new SecretKeySpec(key, ALGORITHM);

		Cipher decrypter = Cipher.getInstance(ALGORITHM);
		decrypter.init(Cipher.DECRYPT_MODE, keySpec);

		return decrypter.doFinal(input);
	}

}
