package com.douglaswhitehead.model.digitaldata.privacy;

/**
 * <p>Privacy interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.10 Privacy Object</p>
 * 
 * <p>The Privacy object holds the privacy policy settings that could be used to:</p>
 * 
 * <ol>
 *   <li>Capture and enforce site visitor consent to use tracking technologies on the site.</li>
 *   <li>Together with Security objects described below, secure access to individual objects
 *      within the JSO by categories of tracking technologies.</li>
 * </ol>
 * 
 * <p>
 * The Privacy object and its children, where included, MUST have the following Object Names &
 * Types.
 * </p>
 */
public interface Privacy {

	/**
	 * Returns the AccessCategories array.
	 * 
	 * @return AccessCategory[]
	 */
	public AccessCategory[] getAccessCategories();
	
	/**
	 * Privacy.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the AccessCategories array.
		 * 
		 * @return Builder
		 */
		public Builder accessCategories(AccessCategory[] accessCategories);
		
		/**
		 * Builds and returns the Privacy object.
		 * 
		 * @return
		 */
		public Privacy build();
	}
}
