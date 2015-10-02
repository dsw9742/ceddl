package com.douglaswhitehead.model.digitaldata.event;

import java.util.Date;

/**
 * This object describes the event.
 */
public class EventInfoImpl implements EventInfo {
	
	private final String eventName;
	private final String eventAction;
	private final int eventPoints;
	private final String type;
	private final Date timestamp;
	private final String cause;
	private final String effect;
	
	private EventInfoImpl(
		final String newEventName,
		final String newEventAction,
		final int newEventPoints,
		final String newType,
		final Date newTimestamp,
		final String newCause,
		final String newEffect
	) {
		this.eventName = newEventName;
		this.eventAction = newEventAction;
		this.eventPoints = newEventPoints;
		this.type = newType;
		this.timestamp = newTimestamp;
		this.cause = newCause;
		this.effect = newEffect;
	}

	public String getEventName() {
		return eventName;
	}

	public String getEventAction() {
		return eventAction;
	}

	public int getEventPoints() {
		return eventPoints;
	}

	public String getType() {
		return type;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getCause() {
		return cause;
	}

	public String getEffect() {
		return effect;
	}
	
	public static class Builder {
		private String nestedEventName;
		private String nestedEventAction;
		private int nestedEventPoints;
		private String nestedType;
		private Date nestedTimestamp;
		private String nestedCause;
		private String nestedEffect;
		
		public Builder eventName(final String newEventName) {
			this.nestedEventName = newEventName;
			return this;
		}
		
		public Builder eventAction(final String newEventAction) {
			this.nestedEventAction = newEventAction;
			return this;
		}
		
		public Builder eventPoints(final int newEventPoints) {
			this.nestedEventPoints = newEventPoints;
			return this;
		}
		
		public Builder type(final String newType) {
			this.nestedType = newType;
			return this;
		}
		
		public Builder timestamp(final Date newTimestamp) {
			this.nestedTimestamp = newTimestamp;
			return this;
		}
		
		public Builder cause(final String newCause) {
			this.nestedCause = newCause;
			return this;
		}
		
		public Builder effect(final String newEffect) {
			this.nestedEffect = newEffect;
			return this;
		}
		
		public EventInfoImpl build() {
			return new EventInfoImpl(
				nestedEventName,
				nestedEventAction,
				nestedEventPoints,
				nestedType,
				nestedTimestamp,
				nestedCause,
				nestedEffect
			);
		}
	}

}