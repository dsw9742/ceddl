package com.douglaswhitehead.model.digitaldata.user;

/**
 * <p>Social interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>An extensible object for providing social information for the user profile.</p>
 * 
 * @author douglas whitehead
 *
 */
public interface Social {
	
	/**
	 * Social.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds and returns the Social object.
		 * 
		 * @return Social
		 */
		public Social build();
		
	}
}
