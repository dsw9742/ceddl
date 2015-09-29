package com.douglaswhitehead.model.ceddl.web.transaction;

public interface CeddlWebTransactionProfileInfo {
	
	public String getProfileID();
	public String getUserName();
	public String getEmail();
	
	public static interface Builder {
		
		public Builder profileID();
		public Builder userName();
		public Builder email();
		
		public CeddlWebTransactionProfileInfo build();
		
	}
}
