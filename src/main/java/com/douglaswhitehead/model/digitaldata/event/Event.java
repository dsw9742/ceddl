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

	public EventInfo getEventInfo();
	public Category getCategory();
	public Attributes getAttributes();
	
	public static interface Builder {
		public Builder eventInfo();
		public Builder category();
		public Builder attributes();
		
		public Event build();
	}
}
