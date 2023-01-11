package com.client.core.crypto;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.client.BaseTest;
import com.client.core.security.tools.Base64;
import com.client.core.security.tools.RC4;
import com.client.core.security.tools.TripleDES;
import com.google.common.base.Charsets;

public class TestCrypto extends BaseTest {

	private final Logger log = Logger.getLogger(getClass());

	private final String testValue = "testValue123+-{}//.,";
	private final byte[] rawTestValue = testValue.getBytes(Charsets.UTF_8);

	//16 bytes
	private final String rc4Key = "testPass123?!+-@";
	//24 bytes
	private final String tripleDESKey = "testPass123?!+-@:[]'t2XA";

	public TestCrypto() {
		super();
	}

	@Test
	public void testBase64() {
		try {
			String base64Encoded = Base64.base64Encode(rawTestValue);
			byte[] base64Decoded = Base64.base64Decode(base64Encoded);

			String testValueDecoded = new String(base64Decoded, Charsets.UTF_8);

			Assertions.assertEquals(base64Decoded.length, rawTestValue.length,"Raw byte data did not properly Base64 encode/decode; different lengths.");

			int index = 0;
			for(byte valueToTest : base64Decoded) {
				Assertions.assertEquals(valueToTest, rawTestValue[index++], "Raw byte data did not properly Base64 encoded/decode; individual byte didn't match");
			}

			Assertions.assertEquals(testValueDecoded, testValue, "Test string value did not properly Base64 encode/decode, or String was not created from bytes properly");
		} catch(Exception e) {
			log.error("Error occurred during JUnit Base64 test", e);
			Assertions.fail("Error occurred during Base64 test");
		}
	}

	@Test
	public void testRC4() {
		try {
			String encrypted = RC4.encryptAndEncode(testValue, rc4Key);

			String decrypted = RC4.decodeAndDecrypt(encrypted, rc4Key);

			Assertions.assertEquals("RC4 encryption/decryption failed; decrypted result did not match initial value to encrypt", decrypted, testValue);
		} catch(Exception e) {
			log.error("Error occurred during JUnit RC4 test", e);
			Assertions.fail("Error occurred during RC4 test");
		}
	}

	@Test
	public void testTripleDES() {
		try {
			String encrypted = TripleDES.encryptAndEncode(testValue, tripleDESKey);

			String decrypted = TripleDES.decodeAndDecrypt(encrypted, tripleDESKey);

			Assertions.assertEquals(decrypted, testValue, "TripleDES encryption/decryption failed; decrypted result did not match initial value to encrypt");
		} catch(Exception e) {
			log.error("Error occurred during JUnit TripleDES test", e);
			Assertions.fail("Error occurred during TripleDES test");
		}
	}

}
