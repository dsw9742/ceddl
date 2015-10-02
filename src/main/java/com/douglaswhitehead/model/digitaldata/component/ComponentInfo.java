package com.douglaswhitehead.model.digitaldata.component;

public interface ComponentInfo {

	public String getComponentID();
	
	public static interface Builder {
		public Builder componentID();
		
		public ComponentInfo build();
	}
}
