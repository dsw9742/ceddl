package com.douglaswhitehead.model.digitaldata.event;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * 6.7 Event Object
 * 
 * The Event object collects information about an interaction event by the user. An event might be
 * a button click, the addition of a portal widget, playing a video, adding a product to the shopping
 * cart, etc. Any action on the page could be captured by an Event object.
 */
public class EventImpl implements Event {

	private final EventInfo eventInfo;
	private final Category category;
	private final Attributes attributes;
	
	public EventImpl(
		final EventInfo newEventInfo,
		final Category newCategory,
		final Attributes newAttributes
	) {
		this.eventInfo = newEventInfo;
		this.category = newCategory;
		this.attributes = newAttributes;
	}
	
	public EventInfo getEventInfo() {
		return eventInfo;
	}

	public Category getCategory() {
		return category;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public static class Builder {
		private EventInfo nestedEventInfo;
		private Category nestedCategory;
		private Attributes nestedAttributes;
		
		public Builder eventInfo(final EventInfo newEventInfo) {
			this.nestedEventInfo = newEventInfo;
			return this;
		}
		
		public Builder category(final Category newCategory) {
			this.nestedCategory = newCategory;
			return this;
		}
		
		public Builder attributes(final Attributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public EventImpl build() {
			return new EventImpl(
				nestedEventInfo,
				nestedCategory,
				nestedAttributes
			);
		}
	}
}
