package com.contentualize.model.ceddl.web.product;

public interface CeddlWebProductCategory {

	public String getPrimaryCategory();
	
	public static interface Builder {
		
		public Builder primaryCategory();
		
		public CeddlWebProductCategory build();
		
	}
}
