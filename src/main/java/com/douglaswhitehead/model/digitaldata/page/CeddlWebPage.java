package com.douglaswhitehead.model.digitaldata.page;

public interface CeddlWebPage {
	
	public CeddlWebPageInfo getPageInfo();
	public CeddlWebPageCategory getCategory();
	public CeddlWebPageAttributes getAttributes();
	
	public static interface Builder {
		
		public Builder pageInfo();
		public Builder category();
		public Builder attributes();
		
		public CeddlWebPage build();
		
	}
}
