package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the User interface.
 * 
 * @author Douglas.Whitehead
 *
 */
public class UserImpl extends BaseImpl implements User {

	/**
	 * String constant for <tt>segment</tt>.
	 */
	private final static String SEGMENT = "segment";
	
	/**
	 * String constant for <tt>profile</tt>.
	 */
	private final static String PROFILE = "profile";
	
	/**
	 * UserImpl constructor.
	 * 
	 * @param Security security
	 * @param Segment segment
	 * @param Profile profile
	 */
	private UserImpl(
		final Security security,
		final Segment segment,
		final Profile[] profile
	) {
		this.security = security;
		this.map.put(SEGMENT, segment);
		this.map.put(PROFILE, profile);
	}
	
	/**
	 * Returns the Segment object.
	 * 
	 * @return Segment
	 */
	@Override
	public Segment getSegment() {
		return (Segment)map.get(SEGMENT);
	}
	
	/**
	 * Returns the Profile array.
	 * 
	 * @return Profile[]
	 */
	@Override
	public Profile[] getProfile() {
		return (Profile[])map.get(PROFILE);
	}
	
	/**
	 * Implementation of the User.Builder interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements User.Builder {
		
		/**
		 * Builds the Segment object.
		 * 
		 * @param Segment segment
		 * @return Builder
		 */
		@Override
		public Builder segment(final Segment segment) {
			this.map.put(SEGMENT, segment);
			this.previous = SEGMENT;
			return builder();
		}
		
		/**
		 * Builds the Profile[] array.
		 * 
		 * @param Profile[] profile
		 * @return Builder
		 */
		@Override
		public Builder profile(final Profile[] profile) {
			this.map.put(PROFILE, profile);
			this.previous = PROFILE;
			return builder();
		}
		
		/**
		 * Builds and returns the UserImpl object.
		 * 
		 * @return UserImpl
		 */
		@Override
		public UserImpl build() {
			return new UserImpl(
				security,
				(Segment)map.get(SEGMENT),
				(Profile[])map.get(PROFILE)
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
