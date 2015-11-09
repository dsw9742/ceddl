package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Minimal implementation of the Segment interface.
 * 
 * @author douglas whitehead
 * 
 */
public class SegmentImpl extends BaseImpl implements Segment {

	/**
	 * PriceImpl constructor.
	 * 
	 * @param Security security
	 */
	private SegmentImpl(
		final Security security
	) {
		this.security = security;
	}
	
	/**
	 * Implementation of the Segment.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Segment.Builder {
		
		/**
		 * Builds and returns the SegmentImpl object.
		 * 
		 * @return SegmentImpl
		 */
		@Override
		public SegmentImpl build() {
			return new SegmentImpl(
				security
			);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
		
	}
}