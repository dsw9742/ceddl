package com.douglaswhitehead.model.digitaldata.page;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

public interface Page {
	
	public PageInfo getPageInfo();
	public Category getCategory();
	public Attributes getAttributes();
	
	public static interface Builder {
		
		public Builder pageInfo();
		public Builder category();
		public Builder attributes();
		
		public Page build();
		
	}
}
