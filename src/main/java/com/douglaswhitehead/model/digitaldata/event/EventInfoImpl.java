package com.douglaswhitehead.model.digitaldata.event;

import java.util.Date;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the EventInfo interface.
 * 
 * @author Douglas.Whitehead
 *
 */
public class EventInfoImpl extends BaseImpl implements EventInfo {
	
	/**
	 * String constant for <tt>eventName</tt>.
	 */
	private final static String EVENT_NAME = "eventName";
	
	/**
	 * String constant for <tt>eventAction</tt>.
	 */
	private final static String EVENT_ACTION = "eventAction";
	
	/**
	 * String constant for <tt>eventPoints</tt>.
	 */
	private final static String EVENT_POINTS = "eventPoints";
	
	/**
	 * String constant for <tt>type</tt>.
	 */
	private final static String TYPE = "type";
	
	/**
	 * String constant for <tt>timestamp</tt>.
	 */
	private final static String TIMESTAMP = "timestamp";
	
	/**
	 * String constant for <tt>cause</tt>.
	 */
	private final static String CAUSE = "cause";
	
	/**
	 * String constant for <tt>effect</tt>.
	 */
	private final static String EFFECT = "effect";
	
	/**
	 * EventInfoImpl constructor.
	 * 
	 * @param Security security
	 * @param String eventName
	 * @param String eventAction
	 * @param Integer eventPoints
	 * @param String type
	 * @param Date timestamp
	 * @param String cause
	 * @param String effect
	 */
	private EventInfoImpl(
		final Security security,
		final String eventName,
		final String eventAction,
		final Integer eventPoints,
		final String type,
		final Date timestamp,
		final String cause,
		final String effect
	) {
		this.security = security;
		this.map.put(EVENT_NAME, eventName);
		this.map.put(EVENT_ACTION, eventAction);
		this.map.put(EVENT_POINTS, eventPoints);
		this.map.put(TYPE, type);
		this.map.put(TIMESTAMP, timestamp);
		this.map.put(CAUSE, cause);
		this.map.put(EFFECT, effect);
	}

	/**
	 * Returns the EventName object.
	 * 
	 * @return String
	 */
	@Override
	public String getEventName() {
		return (String)map.get(EVENT_NAME);
	}

	/**
	 * Returns the EventAction object.
	 * 
	 * @return String
	 */
	@Override
	public String getEventAction() {
		return (String)map.get(EVENT_ACTION);
	}

	/**
	 * Returns the EventPoints object.
	 * 
	 * @return Integer
	 */
	@Override
	public Integer getEventPoints() {
		return (Integer)map.get(EVENT_POINTS);
	}

	/**
	 * Returns the Type object.
	 * 
	 * @return String
	 */
	@Override
	public String getType() {
		return (String)map.get(TYPE);
	}

	/**
	 * Returns the Timestamp object.
	 * 
	 * @return Date
	 */
	@Override
	public Date getTimestamp() {
		return (Date)map.get(TIMESTAMP);
	}

	/**
	 * Returns the Cause object.
	 * 
	 * @return String
	 */
	@Override
	public String getCause() {
		return (String)map.get(CAUSE);
	}

	/**
	 * Returns the Effect object.
	 * 
	 * @return String
	 */
	@Override
	public String getEffect() {
		return (String)map.get(EFFECT);
	}
	
	/**
	 * Implementation of the EventInfo.Builder interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements EventInfo.Builder {
		
		/**
		 * Builds the EventName object.
		 * 
		 * @param String eventName
		 * @return Builder
		 */
		@Override
		public Builder eventName(final String eventName) {
			this.map.put(EVENT_NAME, eventName);
			this.previous = EVENT_NAME;
			return builder();
		}
		
		/**
		 * Builds the EventAction object.
		 * 
		 * @param String eventAction
		 * @return Builder
		 */
		@Override
		public Builder eventAction(final String eventAction) {
			this.map.put(EVENT_ACTION, eventAction);
			this.previous = EVENT_ACTION;
			return builder();
		}
		
		/**
		 * Builds the EventPoints object.
		 * 
		 * @param Integer eventPoints
		 * @return Builder
		 */
		@Override
		public Builder eventPoints(final Integer eventPoints) {
			this.map.put(EVENT_POINTS, eventPoints);
			this.previous = EVENT_POINTS;
			return builder();
		}
		
		/**
		 * Builds the Type object.
		 * 
		 * @param String type
		 * @return Builder
		 */
		@Override
		public Builder type(final String type) {
			this.map.put(TYPE, type);
			this.previous = TYPE;
			return builder();
		}
		
		/**
		 * Builds the Timestamp object.
		 * 
		 * @param Date timestamp
		 * @return Builder
		 */
		@Override
		public Builder timestamp(final Date timestamp) {
			this.map.put(TIMESTAMP, timestamp);
			this.previous = TIMESTAMP;
			return builder();
		}
		
		/**
		 * Builds the Cause object.
		 * 
		 * @param String cause
		 * @return Builder
		 */
		@Override
		public Builder cause(final String cause) {
			this.map.put(CAUSE, cause);
			this.previous = CAUSE;
			return builder();
		}
		
		/**
		 * Builds the Effect object.
		 * 
		 * @param String effect
		 * @return Builder
		 */
		@Override
		public Builder effect(final String effect) {
			this.map.put(EFFECT, effect);
			this.previous = EFFECT;
			return builder();
		}
		
		/**
		 * Builds and returns the EventInfoImpl object.
		 * 
		 * @return EventInfoImpl
		 */
		@Override
		public EventInfoImpl build() {
			return new EventInfoImpl(
				security,
				(String)map.get(EVENT_NAME),
				(String)map.get(EVENT_ACTION),
				(Integer)map.get(EVENT_POINTS),
				(String)map.get(TYPE),
				(Date)map.get(TIMESTAMP),
				(String)map.get(CAUSE),
				(String)map.get(EFFECT)
			);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}

}