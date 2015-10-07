package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.Address;
import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Profile interface.
 * 
 * @author Douglas.Whitehead
 *
 */
public class ProfileImpl extends BaseImpl implements Profile {

	/**
	 * String constant for <tt>profileInfo</tt>.
	 */
	private final static String PROFILE_INFO = "profileInfo";
	
	/**
	 * String constant for <tt>address</tt>.
	 */
	private final static String ADDRESS = "address";
	
	/**
	 * String constant for <tt>social</tt>.
	 */
	private final static String SOCIAL = "social";
	
	/**
	 * String constant for <tt>attributes</tt>.
	 */
	private final static String ATTRIBUTES = "attributes";
	
	private ProfileImpl(
		final Security security,
		final ProfileInfo profileInfo,
		final Address address,
		final Social social,
		final Attributes attributes
	) {
		this.security = security;
		this.map.put(PROFILE_INFO, profileInfo);
		this.map.put(ADDRESS, address);
		this.map.put(SOCIAL, social);
		this.map.put(ATTRIBUTES, attributes);
	}
	
	/**
	 * Returns the ProfileInfo object.
	 * 
	 * @return ProfileInfo
	 */
	@Override
	public ProfileInfo getProfileInfo() {
		return (ProfileInfo)map.get(PROFILE_INFO);
	}
	
	/**
	 * Returns the Address object.
	 * 
	 * @return Address
	 */
	@Override
	public Address getAddress() {
		return (Address)map.get(ADDRESS);
	}
	
	/**
	 * Returns the Social object.
	 * 
	 * @return Social
	 */
	@Override
	public Social getSocial() {
		return (Social)map.get(SOCIAL);
	}
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	@Override
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}
	
	/**
	 * Implementation of the Profile.Builder interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Profile.Builder {

		/**
		 * Builds the ProfileInfo object.
		 * 
		 * @param ProfileInfo profileInfo
		 * @return Builder
		 */
		@Override
		public Builder profileInfo(final ProfileInfo profileInfo) {
			this.map.put(PROFILE_INFO, profileInfo);
			this.previous = PROFILE_INFO;
			return builder();
		}
		
		/**
		 * Builds the Address object.
		 * 
		 * @param Address address
		 * @return Builder
		 */
		@Override
		public Builder address(final Address address) {
			this.map.put(ADDRESS, address);
			this.previous = ADDRESS;
			return builder();
		}
		
		/**
		 * Builds the Social object.
		 * 
		 * @param Social social
		 * @return Builder
		 */
		@Override
		public Builder social(final Social social) {
			this.map.put(SOCIAL, social);
			this.previous = SOCIAL;
			return builder();
		}
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		@Override
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return builder();
		}
		
		/**
		 * Builds and returns the ProfileImpl object.
		 * 
		 * @return ProfileImpl
		 */
		@Override
		public ProfileImpl build() {
			return new ProfileImpl(
				security,
				(ProfileInfo)map.get(PROFILE_INFO),
				(Address)map.get(ADDRESS),
				(Social)map.get(SOCIAL),
				(Attributes)map.get(ATTRIBUTES)
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
