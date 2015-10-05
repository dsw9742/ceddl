package com.douglaswhitehead.model.digitaldata.common;

/**
 * <p>Attributes interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>
 * This object provides extensibility to any object as a whole. Any additional dimensions related to
 * the object. All names are optional and should fit the individual implementation needs in both naming 
 * and values passed.
 * </p>
 * 
 * @author douglas.whitehead
 * 
 */
public interface Attributes {

	/**
	 * Attributes.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds and returns the Attributes object.
		 * 
		 * @return Attributes
		 */
		public Attributes build();
		
	}
	
}
