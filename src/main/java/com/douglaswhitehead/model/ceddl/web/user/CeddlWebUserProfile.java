package com.douglaswhitehead.model.ceddl.web.user;

import com.douglaswhitehead.model.ceddl.web.CeddlWebProfileAddress;

public interface CeddlWebUserProfile {
	
	public CeddlWebUserProfileInfo getProfileInfo();
	public CeddlWebProfileAddress getAddress();
	public CeddlWebUserProfileSocial getSocial();
	public CeddlWebUserProfileAttributes getAttributes();
	
	public static interface Builder {
		
		public Builder profileInfo();
		public Builder address();
		public Builder social();
		public Builder attributes();
		
		public CeddlWebUserProfile build();
		
	}

}
