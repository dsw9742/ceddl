package com.douglaswhitehead.model.digitaldata.user;

/**
 * This object provides population segmentation information for the user, such as premium versus
 * basic membership, or any other forms of segmentation that are desirable. Any additional
 * dimensions related to the user can be provided. All names are optional and should fit the
 * individual implementation needs in both naming and values passed.
 */
public class SegmentImpl implements Segment {

	private SegmentImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public SegmentImpl build() {
			return new SegmentImpl(
				
			);
		}
		
	}
}