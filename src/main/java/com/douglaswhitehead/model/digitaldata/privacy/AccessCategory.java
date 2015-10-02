package com.douglaswhitehead.model.digitaldata.privacy;

public interface AccessCategory {
	public String getCategoryName();
	public String[] getDomains();
	
	public static interface Builder {
		public Builder categoryName();
		public Builder domains();
		
		public AccessCategory build();
	}
}
