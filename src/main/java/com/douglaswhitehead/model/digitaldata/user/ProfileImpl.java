package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.Address;
import com.douglaswhitehead.model.digitaldata.common.Attributes;

/**
 * A profile for information about the user, typically associated with a registered user.
 */
public class ProfileImpl implements Profile {

	private final ProfileInfo profileInfo;
	private final Address address;
	private final Social social;
	private final Attributes attributes;
	
	private ProfileImpl(
		final ProfileInfo newProfileInfo,
		final Address newAddress,
		final Social newSocial,
		final Attributes newAttributes
	) {
		this.profileInfo = newProfileInfo;
		this.address = newAddress;
		this.social = newSocial;
		this.attributes = newAttributes;
	}
	
	public ProfileInfo getProfileInfo() {
		return this.profileInfo;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public Social getSocial() {
		return this.social;
	}
	
	public Attributes getAttributes() {
		return this.attributes;
	}
	
	public static class Builder {
		private ProfileInfo nestedProfileInfo;
		private Address nestedAddress;
		private Social nestedSocial;
		private Attributes nestedAttributes;
		
		public Builder profileInfo(final ProfileInfo newProfileInfo) {
			this.nestedProfileInfo = newProfileInfo;
			return this;
		}
		
		public Builder address(final Address newAddress) {
			this.nestedAddress = newAddress;
			return this;
		}
		
		public Builder social(final Social newSocial) {
			this.nestedSocial = newSocial;
			return this;
		}
		
		public Builder attributes(final Attributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public ProfileImpl build() {
			return new ProfileImpl(
				nestedProfileInfo,
				nestedAddress,
				nestedSocial,
				nestedAttributes
			);
		}
	}
	
}
