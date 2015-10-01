package com.douglaswhitehead.model.digitaldata.user;

public interface User {

	public Segment getSegment();	
	public Profile[] getProfile();
	
	public static interface Builder {

		public Builder segment();
		public Builder profile();
		
		public UserImpl build();
		
	}
}
