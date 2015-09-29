package com.contentualize.model.ceddl.web.user;

/**
 * 6.9 User Object
 * 
 * The User object captures the profile of a user who is interacting with the website.
 * 
 * The User object and its children, where included, MUST have the following Object Names & 
 * Types.
 */
public class CeddlWebUserImpl implements CeddlWebUser {

	private final CeddlWebUserSegment segment;
	private final CeddlWebUserProfile[] profile;
	
	private CeddlWebUserImpl(
		final CeddlWebUserSegment newSegment,
		final CeddlWebUserProfile[] newProfile
	) {
		this.segment = newSegment;
		this.profile = newProfile;
	}
	
	public CeddlWebUserSegment getSegment() {
		return this.segment;
	}
	
	public CeddlWebUserProfile[] getProfile() {
		return this.profile;
	}
	
	public static class Builder {
		private CeddlWebUserSegment nestedSegment;
		private CeddlWebUserProfile[] nestedProfile;
		
		public Builder segment(final CeddlWebUserSegment newSegment) {
			this.nestedSegment = newSegment;
			return this;
		}
		
		public Builder profile(final CeddlWebUserProfile[] newProfile) {
			this.nestedProfile = newProfile;
			return this;
		}
		
		public CeddlWebUserImpl build() {
			return new CeddlWebUserImpl(
				nestedSegment,
				nestedProfile
			);
		}
	}
}
