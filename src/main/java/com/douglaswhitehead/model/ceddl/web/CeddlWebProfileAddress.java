package com.douglaswhitehead.model.ceddl.web;

public interface CeddlWebProfileAddress {
	
	public String getLine1();
	public String getLine2();
	public String getCity();
	public String getStateProvince();
	public String getPostalCode();
	public String getCountry();
	
	public static interface Builder {
		
		public Builder line1();
		public Builder line2();
		public Builder city();
		public Builder stateProvince();
		public Builder postalCode();
		public Builder country();
		
		public CeddlWebProfileAddress build();
		
	}
}
