package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Item;
import com.douglaswhitehead.model.digitaldata.user.Profile;

/**
 * 6.6 Transaction Object
 * 
 * The Transaction object is similar to the Cart object, but represents a completed order. The
 * Transaction object contains analogous sub-objects to the Cart object as well as additional subobjects
 * specific to completed orders.
 */
public class TransactionImpl implements Transaction {

	private final String transactionID;
	private final Profile profile;
	private final Total total;
	private final Attributes attributes;
	private final Item[] item;
	
	private TransactionImpl(
		final String newTransactionID,
		final Profile newProfile,
		final Total newTotal,
		final Attributes newAttributes,
		final Item[] newItem
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
	
	public Profile getProfile() {
		return profile;
	}
	
	public Total getTotal() {
		return total;
	}
	
	public Attributes getAttributes() {
		return attributes;
	}
	
	public Item[] getItem() {
		return item;
	}
	
	public static class Builder {
		private String nestedTransactionID;
		private Profile nestedProfile;
		private Total nestedTotal;
		private Attributes nestedAttributes;
		private Item[] nestedItem;
		
		public Builder transactionID(final String newTransactionID) {
			this.nestedTransactionID = newTransactionID;
			return this;
		}
		
		public Builder profile(final Profile newProfile) {
			this.nestedProfile = newProfile;
			return this;
		}
		
		public Builder total(final Total newTotal) {
			this.nestedTotal = newTotal;
			return this;
		}
		
		public Builder attributes(final Attributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public Builder item(final Item[] newItem) {
			this.nestedItem = newItem;
			return this;
		}
		
		public TransactionImpl build() {
			return new TransactionImpl(
				nestedTransactionID,
				nestedProfile,
				nestedTotal,
				nestedAttributes,
				nestedItem
			);
		}
	}
	
}
