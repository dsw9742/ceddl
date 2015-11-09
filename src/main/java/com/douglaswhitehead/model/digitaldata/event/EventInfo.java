package com.douglaswhitehead.model.digitaldata.event;

import java.util.Date;

/**
 * <p>EventInfo interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>This object describes the event.</p>
 * 
 * <pre>
 * {@code
 * 	digitalData.event[n].<b>eventInfo</b> = {
 * 		<b>eventName:</b> "Add News Portal",
 * 		<b>eventAction:</b> "addportal",
 * 		<b>eventPoints:</b> 200,
 * 		<b>type:</b> "contentModifier",
 * 		<b>timeStamp:</b> new Date(),
 * 		<b>effect:</b> "include portal 1234"
 * 	};
 * }
 * </pre>
 * 
 * <p>The <tt>eventInfo</tt> object MUST include <tt>eventName</tt>.</p>
 * 
 * <p>
 * <b>Reserved:</b> <tt>eventName</tt> (String), <tt>eventAction</tt> (String), <tt>eventPoints</tt> (Number), <tt>type</tt>
 * (String), <tt>timeStamp</tt> (String or Date Object), <tt>cause</tt> (String), <tt>effect</tt> (String)
 * </p>
 * 
 * <p>
 * All other names are optional and should fit the individual implementation needs in both naming
 * and values passed.
 * </p>
 * 
 * @author Douglas.Whitehead
 *
 */
public interface EventInfo {
	
	/**
	 * Returns the EventName object.
	 * 
	 * @return String
	 */
	public String getEventName();
	
	/**
	 * Returns the EventAction object.
	 * 
	 * @return String
	 */
	public String getEventAction();
	
	/**
	 * Returns the EventPoints object.
	 * 
	 * @return Integer
	 */
	public Integer getEventPoints();
	
	/**
	 * Returns the Type object.
	 * 
	 * @return String
	 */
	public String getType();
	
	/**
	 * Returns the Timestamp object.
	 * 
	 * @return Date
	 */
	public Date getTimestamp();
	
	/**
	 * Returns the Cause object.
	 * 
	 * @return String
	 */
	public String getCause();
	
	/**
	 * Returns the Effect object.
	 * 
	 * @return String
	 */
	public String getEffect();

	/**
	 * EventInfo.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the EventName object.
		 * 
		 * @param String eventName
		 * @return Builder
		 */
		public Builder eventName(String eventName);
		
		/**
		 * Builds the EventAction object.
		 * 
		 * @param String eventAction
		 * @return Builder
		 */
		public Builder eventAction(String eventAction);
		
		/**
		 * Builds the EventPoints object.
		 * 
		 * @param Integer eventPoints
		 * @return Builder
		 */
		public Builder eventPoints(Integer eventPoints);
		
		/**
		 * Builds the Type object.
		 * 
		 * @param String type
		 * @return Builder
		 */
		public Builder type(String type);
		
		/**
		 * Builds the Timestamp object.
		 * 
		 * @param Date timestamp
		 * @return Builder
		 */
		public Builder timestamp(Date timestamp);
		
		/**
		 * Builds the Cause object.
		 * 
		 * @param String cause
		 * @return Builder
		 */
		public Builder cause(String cause);
		
		/**
		 * Builds the Effect object.
		 * 
		 * @param String effect
		 * @return Builder
		 */
		public Builder effect(String effect);
		
		/**
		 * Builds and returns the EventInfo object.
		 * 
		 * @return EventInfo
		 */
		public EventInfo build();
	}
}
