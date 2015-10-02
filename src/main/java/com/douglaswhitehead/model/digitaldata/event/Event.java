package com.douglaswhitehead.model.digitaldata.event;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

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
