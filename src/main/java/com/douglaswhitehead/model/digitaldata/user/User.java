package com.douglaswhitehead.model.digitaldata.user;

/**
 * <p>User interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.9 User Object</p>
 * 
 * <p>The User object captures the profile of a user who is interacting with the website.</p>
 * 
 * <p>
 * The User object and its children, where included, MUST have the following Object Names & 
 * Types.
 * </p>
 */
public interface User {

	/**
	 * Returns the Segment object.
	 * 
	 * @return Segment
	 */
	public Segment getSegment();
	
	/**
	 * Returns the Profile array.
	 * 
	 * @return Profile[]
	 */
	public Profile[] getProfile();
	
	/**
	 * User.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {

		/**
		 * Builds the Segment object.
		 * 
		 * @param Segment segment
		 * @return Builder
		 */
		public Builder segment(Segment segment);
		
		/**
		 * Builds the Profile[] array.
		 * 
		 * @param Profile[] profile
		 * @return Builder
		 */
		public Builder profile(Profile[] profile);
		
		/**
		 * Builds and returns the User object.
		 * 
		 * @return User
		 */
		public User build();
		
	}
}
