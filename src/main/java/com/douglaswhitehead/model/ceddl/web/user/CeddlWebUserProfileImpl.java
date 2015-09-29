package com.contentualize.model.ceddl.web.user;

import com.contentualize.model.ceddl.web.CeddlWebProfileAddress;

/**
 * A profile for information about the user, typically associated with a registered user.
 */
public class CeddlWebUserProfileImpl implements CeddlWebUserProfile {

	private final CeddlWebUserProfileInfo profileInfo;
	private final CeddlWebProfileAddress address;
	private final CeddlWebUserProfileSocial social;
	private final CeddlWebUserProfileAttributes attributes;
	
	private CeddlWebUserProfileImpl(
		final CeddlWebUserProfileInfo newProfileInfo,
		final CeddlWebProfileAddress newAddress,
		final CeddlWebUserProfileSocial newSocial,
		final CeddlWebUserProfileAttributes newAttributes
	) {
		this.profileInfo = newProfileInfo;
		this.address = newAddress;
		this.social = newSocial;
		this.attributes = newAttributes;
	}
	
	public CeddlWebUserProfileInfo getProfileInfo() {
		return this.profileInfo;
	}
	
	public CeddlWebProfileAddress getAddress() {
		return this.address;
	}
	
	public CeddlWebUserProfileSocial getSocial() {
		return this.social;
	}
	
	public CeddlWebUserProfileAttributes getAttributes() {
		return this.attributes;
	}
	
	public static class Builder {
		private CeddlWebUserProfileInfo nestedProfileInfo;
		private CeddlWebProfileAddress nestedAddress;
		private CeddlWebUserProfileSocial nestedSocial;
		private CeddlWebUserProfileAttributes nestedAttributes;
		
		public Builder profileInfo(final CeddlWebUserProfileInfo newProfileInfo) {
			this.nestedProfileInfo = newProfileInfo;
			return this;
		}
		
		public Builder address(final CeddlWebProfileAddress newAddress) {
			this.nestedAddress = newAddress;
			return this;
		}
		
		public Builder social(final CeddlWebUserProfileSocial newSocial) {
			this.nestedSocial = newSocial;
			return this;
		}
		
		public Builder attributes(final CeddlWebUserProfileAttributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public CeddlWebUserProfileImpl build() {
			return new CeddlWebUserProfileImpl(
				nestedProfileInfo,
				nestedAddress,
				nestedSocial,
				nestedAttributes
			);
		}
	}
	
}
