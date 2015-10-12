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
	 * <p>Returns the CategoryName object.</p>
	 * 
	 * <p>From the W3C CEDDL specification:</p>
	 * 
	 * <p>Definition of category names to be associated with <tt>security</tt> objects with the matching name.</p>
	 * 
	 * <p>
	 * A <tt>categoryName</tt> of Default MUST be included for privacy enforcement. All other categories
     * are custom. Common categories include Analytics, Recommendations, and Personalization.
     * </p>
	 * 
	 * @return String
	 */
	public String getCategoryName();
	
	/**
	 * <p>Returns the Domains array.</p>
	 * 
	 * <p>From the W3C CEDDL specification:</p>
	 * 
	 * <p>
	 * Particular vendors associated with the particular category. This SHOULD be an array listing
	 * domains for vendors associated with the category.
	 * </p>
	 * 
	 * <p>
	 * The Default category SHOULD contain all technologies which must be treated the same as first
     * party for privacy purposes (e.g., a tag management technology).
     * </p>
	 * 
	 * @return String
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
