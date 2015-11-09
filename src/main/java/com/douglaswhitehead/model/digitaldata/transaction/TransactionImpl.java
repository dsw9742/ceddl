package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.common.Item;
import com.douglaswhitehead.model.digitaldata.security.Security;
import com.douglaswhitehead.model.digitaldata.user.Profile;

/**
 * Implementation of the Transaction interface. 
 * 
 * @author Douglas.Whitehead
 *
 */
public class TransactionImpl extends BaseImpl implements Transaction {

	/**
	 * String constant for <tt>transactionID</tt>.
	 */
	private final static String TRANSACTION_ID = "transactionID";
	
	/**
	 * String constant for <tt>profile</tt>.
	 */
	private final static String PROFILE = "profile";
	
	/**
	 * String constant for <tt>total</tt>.
	 */
	private final static String TOTAL = "total";
	
	/**
	 * String constant for <tt>attributes</tt>.
	 */
	private final static String ATTRIBUTES = "attributes";
	
	/**
	 * String constant for <tt>item</tt>.
	 */
	private final static String ITEM = "item";
	
	/**
	 * TransactionImpl constructor.
	 * 
	 * @param Security security
	 * @param String transactionID
	 * @param Profile profile
	 * @param Total total
	 * @param Attributes attributes
	 * @param Item[] item
	 */
	private TransactionImpl(
		final Security security,
		final String transactionID,
		final Profile profile,
		final Total total,
		final Attributes attributes,
		final Item[] item
	) {
		this.security = security;
		this.map.put(TRANSACTION_ID, transactionID);
		this.map.put(PROFILE, profile);
		this.map.put(TOTAL, total);
		this.map.put(ATTRIBUTES, attributes);
		this.map.put(ITEM, item);
	}
	
	/**
	 * Returns the TransactionID object.
	 * 
	 * @return String
	 */
	@Override
	public String getTransactionID() {
		return (String)map.get(TRANSACTION_ID);
	}
	
	/**
	 * Returns the Profile object.
	 * 
	 * @return Profile
	 */
	@Override
	public Profile getProfile() {
		return (Profile)map.get(PROFILE);
	}
	
	/**
	 * Returns the Total object.
	 * 
	 * @return Total
	 */
	@Override
	public Total getTotal() {
		return (Total)map.get(TOTAL);
	}
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	@Override
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}
	
	/**
	 * Returns the Item array.
	 * 
	 * @return Item[]
	 */
	@Override
	public Item[] getItem() {
		return (Item[])map.get(ITEM);
	}
	
	/**
	 * Implementation of the Transaction.Builder interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Transaction.Builder {
		
		/**
		 * Builds the TransactionID object.
		 * 
		 * @param String transactionID
		 * @return Builder
		 */
		@Override
		public Builder transactionID(final String transactionID) {
			this.map.put(TRANSACTION_ID, transactionID);
			this.previous = TRANSACTION_ID;
			return builder();
		}
		
		/**
		 * Builds the Profile object.
		 * 
		 * @param Profile profile
		 * @return Builder
		 */
		@Override
		public Builder profile(final Profile profile) {
			this.map.put(PROFILE, profile);
			this.previous = PROFILE;
			return builder();
		}
		
		/**
		 * Builds the Total object.
		 * 
		 * @param Total total
		 * @return Builder
		 */
		@Override
		public Builder total(final Total total) {
			this.map.put(TOTAL, total);
			this.previous = TOTAL;
			return builder();
		}
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		@Override
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return builder();
		}
		
		/**
		 * Builds the Item array.
		 * 
		 * @param Item[] item
		 * @return Builder
		 */
		@Override
		public Builder item(final Item[] item) {
			this.map.put(ITEM, item);
			this.previous = ITEM;
			return builder();
		}
		
		/**
		 * Builds and returns the TransactionImpl object.
		 * 
		 * @return TransactionImpl
		 */
		@Override
		public TransactionImpl build() {
			return new TransactionImpl(
				security,
				(String)map.get(TRANSACTION_ID),
				(Profile)map.get(PROFILE),
				(Total)map.get(TOTAL),
				(Attributes)map.get(ATTRIBUTES),
				(Item[])map.get(ITEM)
			);
		}
		
		/**
		 * Returns the Builder
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}
	
}
