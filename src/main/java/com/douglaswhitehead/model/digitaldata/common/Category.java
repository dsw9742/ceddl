package com.douglaswhitehead.model.digitaldata.common;

public interface Category {
	
	public String getPrimaryCategory();
	
	public static interface Builder {
		
		public Builder primaryCategory();
		
		public Category build();
		
	}

}
