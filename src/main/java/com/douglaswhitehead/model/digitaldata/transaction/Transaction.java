package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Item;
import com.douglaswhitehead.model.digitaldata.user.Profile;

public interface Transaction {

	public String getTransactionID();
	public Profile getProfile();
	public Total getTotal();
	public Attributes getAttributes();
	public Item[] getItem();
	
	public static interface Builder {
		
		public Builder transactionID();
		public Builder profile();
		public Builder total();
		public Builder attributes();
		public Builder item();
		
		public Transaction build();
		
	}
}
