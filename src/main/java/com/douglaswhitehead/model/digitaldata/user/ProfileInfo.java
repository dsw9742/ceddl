package com.douglaswhitehead.model.digitaldata.user;

public interface ProfileInfo {

	public String getProfileID();
	public String getUserName();
	public String getEmail();
	public String getLanguage();
	public String getReturningStatus();
	public String getType();
	
	public static interface Builder {
		
		public Builder profileID();
		public Builder userName();
		public Builder email();
		public Builder language();
		public Builder returningStatus();
		public Builder type();
		
		public ProfileInfo build();
		
	}
}
