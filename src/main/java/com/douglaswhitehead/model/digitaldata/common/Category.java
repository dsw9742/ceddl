package com.douglaswhitehead.model.digitaldata.common;

public interface Category {
	
	public Object getPrimaryCategory();
	
	public static interface Builder {
		
		public Builder security();
		
		public Builder primaryCategory();
		
		public Category build();
		
	}

}
