package com.douglaswhitehead.model.ceddl.web.transaction;

/**
 * 6.6 Transaction Object
 * 
 * The Transaction object is similar to the Cart object, but represents a completed order. The
 * Transaction object contains analogous sub-objects to the Cart object as well as additional subobjects
 * specific to completed orders.
 */
public class CeddlWebTransactionImpl implements CeddlWebTransaction {

	private final String transactionID;
	private final CeddlWebTransactionProfile profile;
	private final CeddlWebTransactionTotal total;
	private final CeddlWebTransactionAttributes attributes;
	private final CeddlWebTransactionItem[] item;
	
	private CeddlWebTransactionImpl(
		final String newTransactionID,
		final CeddlWebTransactionProfile newProfile,
		final CeddlWebTransactionTotal newTotal,
		final CeddlWebTransactionAttributes newAttributes,
		final CeddlWebTransactionItem[] newItem
	) {
		this.transactionID = newTransactionID;
		this.profile = newProfile;
		this.total = newTotal;
		this.attributes = newAttributes;
		this.item = newItem;
	}
	
	public String getTransactionID() {
		return transactionID;
	}
	
	public CeddlWebTransactionProfile getProfile() {
		return profile;
	}
	
	public CeddlWebTransactionTotal getTotal() {
		return total;
	}
	
	public CeddlWebTransactionAttributes getAttributes() {
		return attributes;
	}
	
	public CeddlWebTransactionItem[] getItem() {
		return item;
	}
	
	public static class Builder {
		private String nestedTransactionID;
		private CeddlWebTransactionProfile nestedProfile;
		private CeddlWebTransactionTotal nestedTotal;
		private CeddlWebTransactionAttributes nestedAttributes;
		private CeddlWebTransactionItem[] nestedItem;
		
		public Builder transactionID(final String newTransactionID) {
			this.nestedTransactionID = newTransactionID;
			return this;
		}
		
		public Builder profile(final CeddlWebTransactionProfile newProfile) {
			this.nestedProfile = newProfile;
			return this;
		}
		
		public Builder total(final CeddlWebTransactionTotal newTotal) {
			this.nestedTotal = newTotal;
			return this;
		}
		
		public Builder attributes(final CeddlWebTransactionAttributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public Builder item(final CeddlWebTransactionItem[] newItem) {
			this.nestedItem = newItem;
			return this;
		}
		
		public CeddlWebTransactionImpl build() {
			return new CeddlWebTransactionImpl(
				nestedTransactionID,
				nestedProfile,
				nestedTotal,
				nestedAttributes,
				nestedItem
			);
		}
	}
	
}
