package com.douglaswhitehead.model.digitaldata.component;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

public interface Component {

	public ComponentInfo getComponentInfo();
	public Category getCategory();
	public Attributes getAttributes();
	
	public static interface Builder {
		public Builder componentInfo();
		public Builder category();
		public Builder attributes();
		
		public Component build();
	}
}
