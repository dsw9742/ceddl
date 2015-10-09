package com.douglaswhitehead.model.digitaldata.event;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * <p>Event interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.7 Event Object</p>
 * 
 * <p>
 * The Event object collects information about an interaction event by the user. An event might be
 * a button click, the addition of a portal widget, playing a video, adding a product to the shopping
 * cart, etc. Any action on the page could be captured by an Event object.
 * </p>
 * 
 * <p>
 * The Event object and its children, where included, MUST have the following Object Names &
 * Types.
 * </p>
 * 
 * @author Douglas.Whitehead
 *
 */
public interface Event {

	/**
	 * Returns the EventInfo object.
	 * 
	 * @return EventInfo
	 */
	public EventInfo getEventInfo();
	
	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	public Category getCategory();
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes();
	
	/**
	 * Event.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the EventInfo object.
		 * 
		 * @param EventInfo eventInfo
		 * @return Builder
		 */
		public Builder eventInfo(EventInfo eventInfo);
		
		/**
		 * Builds the Category object.
		 * 
		 * @param Category category
		 * @return Builder
		 */
		public Builder category(Category category);
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		public Builder attributes(Attributes attributes);
		
		/**
		 * Builds and returns the Event object.
		 * 
		 * @return Event
		 */
		public Event build();
	}
}
