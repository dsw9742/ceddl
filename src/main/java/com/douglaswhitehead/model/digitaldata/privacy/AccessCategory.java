package com.douglaswhitehead.model.digitaldata.privacy;

/**
 * <p>AccessCategory interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>A list of privacy categories.</p>
 * 
 * @author douglas.whitehead
 * 
 */
public interface AccessCategory {
	
	/**
	 * Returns the CategoryName object.
	 * 
	 * @return String
	 */
	public String getCategoryName();
	
	/**
	 * Returns the Domains array.
	 * 
	 * @return String[]
	 */
	public String[] getDomains();
	
	/**
	 * AccessCategory.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the CategoryName object.
		 * 
		 * @param String categoryName
		 * @return Builder
		 */
		public Builder categoryName(String categoryName);
		
		/**
		 * Builds the Domains array.
		 * 
		 * @param String[] domains
		 * @return Builder
		 */
		public Builder domains(String[] domains);
		
		/**
		 * Builds and returns the AccessCategory object.
		 * 
		 * @return AccessCategory
		 */
		public AccessCategory build();
	}
}
