package com.douglaswhitehead.model.ceddl.web.user;

public interface CeddlWebUserProfileSocial {

	public String getTwitter();
	public Object getTwitterInfo();
	public String getFacebook();
	public Object getFacebookInfo();
	
	public static interface Builder {
		
		public Builder twitter();
		public Builder twitterInfo();
		public Builder facebook();
		public Builder facebookInfo();
		
		public CeddlWebUserProfileSocial build();
		
	}
}
