package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Minimal implementation of the Social interface.
 * 
 * @author douglas whitehead
 *
 */
public class SocialImpl extends BaseImpl implements Social {

	/**
	 * SocialImpl constructor.
	 * 
	 * @param Security security
	 */
	private SocialImpl(
		final Security security
	) {
		this.security = security;
	};
	
	/**
	 * Implementation of the Social.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Social.Builder {
		
		/**
		 * Builds and returns the SocialImpl object.
		 * 
		 * @return SocialImpl
		 */
		public SocialImpl build() {
			return new SocialImpl(
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
