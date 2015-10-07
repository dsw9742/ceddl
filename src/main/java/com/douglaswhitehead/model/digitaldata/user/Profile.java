package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.Address;
import com.douglaswhitehead.model.digitaldata.common.Attributes;

/**
 * <p>Profile interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>
 * A profile for information about the user, typically associated with a registered user. (Although
 * typically a user might have only a single profile, this object is an array and can capture multiple
 * profiles per user.)
 * </p>
 * 
 * @author Douglas.Whitehead
 *
 */
public interface Profile {
	
	/**
	 * Returns the ProfileInfo object.
	 * 
	 * @return ProfileInfo
	 */
	public ProfileInfo getProfileInfo();
	
	/**
	 * Returns the Address object.
	 * 
	 * @return Address
	 */
	public Address getAddress();
	
	/**
	 * Returns the Social object.
	 * 
	 * @return Social
	 */
	public Social getSocial();
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes();
	
	/**
	 * Profile.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the ProfileInfo object.
		 * 
		 * @param ProfileInfo profileInfo
		 * @return Builder
		 */
		public Builder profileInfo(ProfileInfo profileInfo);
		
		/**
		 * Builds the Address object.
		 * 
		 * @param Address address
		 * @return Builder
		 */
		public Builder address(Address address);
		
		/**
		 * Builds the Social object.
		 * 
		 * @param Social social
		 * @return Builder
		 */
		public Builder social(Social social);
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		public Builder attributes(Attributes attributes);
		
		/**
		 * Builds and returns the Profile object.
		 * 
		 * @return Profile
		 */
		public Profile build();
		
	}

}