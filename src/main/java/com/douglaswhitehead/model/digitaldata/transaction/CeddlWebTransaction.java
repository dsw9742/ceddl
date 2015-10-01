package com.douglaswhitehead.model.digitaldata.transaction;

public interface CeddlWebTransaction {

	public String getTransactionID();
	public CeddlWebTransactionProfile getProfile();
	public CeddlWebTransactionTotal getTotal();
	public CeddlWebTransactionAttributes getAttributes();
	public CeddlWebTransactionItem[] getItem();
	
	public static interface Builder {
		
		public Builder transactionID();
		public Builder profile();
		public Builder total();
		public Builder attributes();
		public Builder item();
		
		public CeddlWebTransaction build();
		
	}
}
