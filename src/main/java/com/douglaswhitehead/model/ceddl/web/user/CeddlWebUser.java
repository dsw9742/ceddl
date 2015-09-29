package com.douglaswhitehead.model.ceddl.web.user;

public interface CeddlWebUser {

	public CeddlWebUserSegment getSegment();	
	public CeddlWebUserProfile[] getProfile();
	
	public static interface Builder {

		public Builder segment();
		public Builder profile();
		
		public CeddlWebUserImpl build();
		
	}
}
