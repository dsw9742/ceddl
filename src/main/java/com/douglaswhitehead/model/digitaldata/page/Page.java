package com.douglaswhitehead.model.digitaldata.page;

public interface Page {
	public Object getPageInfo();
	public Object getCategory();
	public Object getAttributes();
	
	public static interface Builder {
		public Builder pageInfo();
		public Builder category();
		public Builder attributes();
		
		public Page build();
		
	}
}
