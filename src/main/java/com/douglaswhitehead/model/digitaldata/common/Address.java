package com.douglaswhitehead.model.digitaldata.common;

public interface Address {
	
	public Object getLine1();
	public Object getLine2();
	public Object getCity();
	public Object getStateProvince();
	public Object getPostalCode();
	public Object getCountry();
	
	public static interface Builder {
		
		public Builder line1();
		public Builder line2();
		public Builder city();
		public Builder stateProvince();
		public Builder postalCode();
		public Builder country();
		
		public Address build();
		
	}
}
