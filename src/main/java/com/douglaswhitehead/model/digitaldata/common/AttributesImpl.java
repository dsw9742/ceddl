package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Minimal implementation of the Attributes interface. 
 * 
 * @author douglas.whitehead
 *
 */
public class AttributesImpl extends BaseImpl implements Attributes {

	/**
	 * AttributesImpl constructor.
	 * 
	 * @param security
	 */
	private AttributesImpl(
		final Security security
	) {
		this.security = security;
	}
	
	/**
	 * Implementation of Attributes.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Attributes.Builder {
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
		
		/**
		 * Builds and returns the AttributesImpl object.
		 * 
		 * @return AttributesImpl
		 */
		@Override
		public AttributesImpl build() {
			return new AttributesImpl(
				security
			);
		}
		
	}
	
}