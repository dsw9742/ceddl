package com.douglaswhitehead.model.digitaldata.user;

import com.douglaswhitehead.model.digitaldata.common.Address;
import com.douglaswhitehead.model.digitaldata.common.Attributes;

public interface Profile {
	
	public ProfileInfo getProfileInfo();
	public Address getAddress();
	public Social getSocial();
	public Attributes getAttributes();
	
	public static interface Builder {
		
		public Builder profileInfo();
		public Builder address();
		public Builder social();
		public Builder attributes();
		
		public Profile build();
		
	}

}
