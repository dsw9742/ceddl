package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.common.Address;

public interface CeddlWebTransactionProfile {
	
	public CeddlWebTransactionProfileInfo getProfileInfo();
	public Address getAddress();
	public Address getShippingAddress();
	
	public static interface Builder {
		
		public Builder getProfileInfo();
		public Builder getAddress();
		public Builder getShippingAddress();
		
		public CeddlWebTransactionProfile build();
		
	}

}
