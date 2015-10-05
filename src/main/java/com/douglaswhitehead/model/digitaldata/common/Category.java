package com.douglaswhitehead.model.digitaldata.common;

/**
 * <p>Category interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>
 * Because of the wide range of methods for categorization, an object literal is provided for object
 * categories.
 * </p>
 *
 * <p>
 * The name primaryCategory is RECOMMENDED if you included only one set of categories
 * for objects, or for your primary set of categories. All other names are optional and should fit the
 * individual implementation needs in both naming and values passed.
 * </p>
 * 
 * @author douglas.whitehead
 * 
 */
public interface Category {
	
	/**
	 * Returns the PrimaryCategory object.
	 * 
	 * @return String
	 */
	public String getPrimaryCategory();
	
	/**
	 * Category.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the PrimaryCategory object.
		 * 
		 * @return Builder
		 */
		public Builder primaryCategory(String primaryCategory);
		
		/**
		 * Builds the Category object.
		 * 
		 * @return Category
		 */
		public Category build();
		
	}

}
