package com.client.core.base.tools;

import org.joda.time.DateTime;
import org.joda.time.Minutes;

public abstract class TimedCache<T> {

	private final int minutesBetweenRetrievals;

	private DateTime lastTimeRetrieved;
	private T item;

	protected TimedCache(int minutesBetweenRetrievals) {
		this.minutesBetweenRetrievals = minutesBetweenRetrievals;
	}

	public synchronized T get() {
		if(item == null || needsNewRetrieval()) {
			this.item = retrieve();
			this.lastTimeRetrieved = new DateTime();
		}

		return item;
	}

	private boolean needsNewRetrieval() {
		return this.lastTimeRetrieved == null
			|| Minutes.minutesBetween(lastTimeRetrieved, new DateTime()).getMinutes() >= minutesBetweenRetrievals;
	}

	protected abstract T retrieve();

}
