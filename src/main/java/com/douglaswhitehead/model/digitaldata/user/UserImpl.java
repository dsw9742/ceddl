package com.douglaswhitehead.model.digitaldata.user;

/**
 * 6.9 User Object
 * 
 * The User object captures the profile of a user who is interacting with the website.
 * 
 * The User object and its children, where included, MUST have the following Object Names & 
 * Types.
 */
public class UserImpl implements User {

	private final Segment segment;
	private final Profile[] profile;
	
	private UserImpl(
		final Segment newSegment,
		final Profile[] newProfile
	) {
		this.segment = newSegment;
		this.profile = newProfile;
	}
	
	public Segment getSegment() {
		return this.segment;
	}
	
	public Profile[] getProfile() {
		return this.profile;
	}
	
	public static class Builder {
		private Segment nestedSegment;
		private Profile[] nestedProfile;
		
		public Builder segment(final Segment newSegment) {
			this.nestedSegment = newSegment;
			return this;
		}
		
		public Builder profile(final Profile[] newProfile) {
			this.nestedProfile = newProfile;
			return this;
		}
		
		public UserImpl build() {
			return new UserImpl(
				nestedSegment,
				nestedProfile
			);
		}
	}
}