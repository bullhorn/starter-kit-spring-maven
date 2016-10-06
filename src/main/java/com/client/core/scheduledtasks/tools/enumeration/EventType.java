package com.client.core.scheduledtasks.tools.enumeration;

/**
 * The type of event that occurred.
 */
public enum EventType {
    /**
     * An insert event
     */
	INSERT("INSERT"),
	INSERTED("INSERTED"),
    /**
     * An update event
     */
    UPDATE("UPDATE"),
	UPDATED("UPDATED"),
    /**
     * A delete event
     */
    DELETE("DELETE"),
	DELETED("DELETED");

	private final String value;

	EventType(String value) {
		this.value = value;
	}

    /**
     * Returns the {@link String} representation of the EventType
     *
     * @return the String value of this EventType
     */
	public String value() {
		return value;
	}

    /**
     * Loops through all EventTypes and returns the one that matches the value passed in.
     *
     * @param type the String representation of the EventType
     * @return the EventType if one matches, null otherwise
     */
	public static EventType getType(String type) {
		for (EventType eventType : EventType.values()) {
			if (eventType.value().equalsIgnoreCase(type)) {
				return eventType;
			}
		}

		return null;
	}
}
