package com.douglaswhitehead.model.digitaldata.event;

import java.util.Date;

public interface EventInfo {
	
	public String getEventName();
	public String getEventAction();
	public int getEventPoints();
	public String getType();
	public Date getTimestamp();
	public String getCause();
	public String getEffect();

	public static interface Builder {
		public Builder eventName();
		public Builder eventAction();
		public Builder eventPoints();
		public Builder type();
		public Builder timestamp();
		public Builder cause();
		public Builder effect();
		
		public EventInfo build();
	}
}
