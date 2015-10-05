package com.douglaswhitehead.model.digitaldata.common;

/**
 * <p>Address interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>An extensible object for providing address information for the user.</p>
 * 
 * @author douglas.whitehead
 *
 */
public interface Address {
	
	/**
	 * Returns the Line1 object.
	 * 
	 * @return String 
	 */
	public String getLine1();
	
	/**
	 * Returns the Line2 object.
	 * 
	 * @return String 
	 */
	public String getLine2();
	
	/**
	 * Returns the City object.
	 * 
	 * @return String 
	 */
	public String getCity();
	
	/**
	 * Returns the StateProvince object.
	 * 
	 * @return String 
	 */
	public String getStateProvince();
	
	/**
	 * Returns the PostalCode object.
	 * 
	 * @return String 
	 */
	public String getPostalCode();
	
	/**
	 * Returns the Country object.
	 * 
	 * @return String 
	 */
	public String getCountry();
	
	/**
	 * Address.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the Line1 object.
		 * 
		 * @return Builder
		 */
		public Builder line1(String line1);
		
		/**
		 * Builds the Line2 object.
		 * 
		 * @return Builder
		 */
		public Builder line2(String line2);
		
		/**
		 * Builds the City object.
		 * 
		 * @return Builder
		 */
		public Builder city(String city);
		
		/**
		 * Builds the StateProvince object.
		 * 
		 * @return Builder
		 */
		public Builder stateProvince(String stateProvince);
		
		/**
		 * Builds the PostalCode object.
		 * 
		 * @return Builder
		 */
		public Builder postalCode(String postalCode);
		
		/**
		 * Builds the Country object.
		 * 
		 * @return Builder
		 */
		public Builder country(String country);
		
		/**
		 * Builds and returns the Address object.
		 * 
		 * @return Address
		 */
		public Address build();
		
	}
}
