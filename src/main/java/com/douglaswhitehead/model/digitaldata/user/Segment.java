package com.douglaswhitehead.model.digitaldata.user;

/**
 * <p>Segment interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>
 * This object provides population segmentation information for the user, such as premium versus 
 * basic membership, or any other forms of segmentation that are desirable. Any additional 
 * dimensions related to the user can be provided. All names are optional and should fit the 
 * individual implementation needs in both naming and values passed.
 * </p> 
 * 
 * @author douglas whitehead
 *
 */
public interface Segment {

	/**
	 * Segment.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds and returns the Segment object.
		 * 
		 * @return Segment
		 */
		public Segment build();
		
	}
	
}
