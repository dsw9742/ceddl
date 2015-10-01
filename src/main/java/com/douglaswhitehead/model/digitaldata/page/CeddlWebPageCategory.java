package com.douglaswhitehead.model.digitaldata.page;

public interface CeddlWebPageCategory {
	
	public String getPrimaryCategory();
	
	public static interface Builder {
		
		public Builder primaryCategory();
		
		public CeddlWebPageCategory build();
		
	}

}
