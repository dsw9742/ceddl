package com.douglaswhitehead.model.digitaldata.user;

/**
 * An extensible object for providing social information for the user profile.
 */
public class SocialImpl implements Social {
	private final String twitter;
	private final Object twitterInfo;
	private final String facebook;
	private final Object facebookInfo;
	
	private SocialImpl(
		final String newTwitter,
		final Object newTwitterInfo,
		final String newFacebook,
		final Object newFacebookInfo
	) {
		this.twitter = newTwitter;
		this.twitterInfo = newTwitterInfo;
		this.facebook = newFacebook;
		this.facebookInfo = newFacebookInfo;
	};

	public String getTwitter() {
		return this.twitter;
	}
	
	public Object getTwitterInfo() {
		return this.twitterInfo;
	}
	
	public String getFacebook() {
		return this.facebook;
	}
	
	public Object getFacebookInfo() {
		return this.facebookInfo;
	}
	
	public static class Builder {
		private String nestedTwitter;
		private Object nestedTwitterInfo;
		private String nestedFacebook;
		private Object nestedFacebookInfo;
		
		public Builder twitter(final String newTwitter) {
			this.nestedTwitter = newTwitter;
			return this;
		}
		
		public Builder twitterInfo(final Object newTwitterInfo) {
			this.nestedTwitterInfo = newTwitterInfo;
			return this;
		}
		
		public Builder facebook(final String newFacebook) {
			this.nestedFacebook = newFacebook;
			return this;
		}
		
		public Builder facebookInfo(final Object newFacebookInfo) {
			this.nestedFacebookInfo = newFacebookInfo;
			return this;
		}
		
		public SocialImpl build() {
			return new SocialImpl(
				nestedTwitter,
				nestedTwitterInfo,
				nestedFacebook,
				nestedFacebookInfo
			);
		}
	}
}
