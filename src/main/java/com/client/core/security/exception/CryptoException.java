package com.client.core.security.exception;

/**
 * Exception to detail the fact that some form of error has occurred during the encryption
 * or decription of data.
 */
public class CryptoException extends RuntimeException {
	private static final long serialVersionUID = 14661438139919519L;

	public CryptoException() {
		super();
	}

	public CryptoException(String message, Throwable cause) {
		super(message, cause);
	}

	public CryptoException(String message) {
		super(message);
	}

	public CryptoException(Throwable cause) {
		super(cause);
	}

}
