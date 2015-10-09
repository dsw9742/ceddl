package com.douglaswhitehead.model.digitaldata.event;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.common.Category;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Event interface.
 * 
 * @author Douglas.Whitehead
 * 
 */
public class EventImpl extends BaseImpl implements Event {
	
	/**
	 * String constant for <tt>eventInfo</tt>.
	 */
	private final static String EVENT_INFO = "eventInfo";
	
	/**
	 * String constant for <tt>category</tt>.
	 */
	private final static String CATEGORY = "category";
	
	/**
	 * String constant for <tt>attributes</tt>.
	 */
	private final static String ATTRIBUTES = "attributes";
	
	/**
	 * EventImpl constructor.
	 * 
	 * @param Security security
	 * @param EventInfo eventInfo
	 * @param Category category
	 * @param Attributes attributes
	 */
	private EventImpl(
		final Security security,
		final EventInfo eventInfo,
		final Category category,
		final Attributes attributes
	) {
		this.security = security;
		this.map.put(EVENT_INFO, eventInfo);
		this.map.put(CATEGORY, category);
		this.map.put(ATTRIBUTES, attributes);
	}
	
	/**
	 * Returns the EventInfo object.
	 * 
	 * @return EventInfo
	 */
	@Override
	public EventInfo getEventInfo() {
		return (EventInfo)map.get(EVENT_INFO);
	}

	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	@Override
	public Category getCategory() {
		return (Category)map.get(CATEGORY);
	}

	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	@Override
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}

	/**
	 * Implementation of the Event.Builder interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Event.Builder {
		
		/**
		 * Builds the EventInfo object.
		 * 
		 * @param EventInfo eventInfo
		 * @return Builder
		 */
		@Override
		public Builder eventInfo(final EventInfo eventInfo) {
			this.map.put(EVENT_INFO, eventInfo);
			this.previous = EVENT_INFO;
			return builder();
		}
		
		/**
		 * Builds the Category object.
		 * 
		 * @param Category category
		 * @return Builder
		 */
		@Override
		public Builder category(final Category category) {
			this.map.put(CATEGORY, category);
			this.previous = CATEGORY;
			return builder();
		}
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		@Override
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return builder();
		}
		
		/**
		 * Builds and returns the EventImpl object.
		 * 
		 * @return EventImpl
		 */
		@Override
		public EventImpl build() {
			return new EventImpl(
				security,
				(EventInfo)map.get(EVENT_INFO),
				(Category)map.get(CATEGORY),
				(Attributes)map.get(ATTRIBUTES)
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
