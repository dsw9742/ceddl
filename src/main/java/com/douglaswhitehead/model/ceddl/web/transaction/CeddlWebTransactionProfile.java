package com.contentualize.model.ceddl.web.transaction;

import com.contentualize.model.ceddl.web.CeddlWebProfileAddress;

public interface CeddlWebTransactionProfile {
	
	public CeddlWebTransactionProfileInfo getProfileInfo();
	public CeddlWebProfileAddress getAddress();
	public CeddlWebProfileAddress getShippingAddress();
	
	public static interface Builder {
		
		public Builder getProfileInfo();
		public Builder getAddress();
		public Builder getShippingAddress();
		
		public CeddlWebTransactionProfile build();
		
	}

}
