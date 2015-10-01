package com.douglaswhitehead.model.digitaldata.user;

public interface Social {

	public String getTwitter();
	public Object getTwitterInfo();
	public String getFacebook();
	public Object getFacebookInfo();
	
	public static interface Builder {
		
		public Builder twitter();
		public Builder twitterInfo();
		public Builder facebook();
		public Builder facebookInfo();
		
		public Social build();
		
	}
}
