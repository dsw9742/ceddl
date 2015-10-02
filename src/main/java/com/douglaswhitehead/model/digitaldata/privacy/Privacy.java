package com.douglaswhitehead.model.digitaldata.privacy;

public interface Privacy {

	public AccessCategory[] getAccessCategories();
	
	public static interface Builder {
		public AccessCategory[] accessCategories();
		
		public Privacy build();
	}
}
