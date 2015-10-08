package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Item;
import com.douglaswhitehead.model.digitaldata.user.Profile;

/**
 * <p>Transaction interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>
 * The Transaction object is similar to the Cart object, but represents a completed order. The
 * Transaction object contains analogous sub-objects to the Cart object as well as additional subobjects
 * specific to completed orders.
 * </p>
 * 
 * <p>
 * The Transaction object and its children, where included, MUST have the following Object
 * Names & Types.
 * </p>
 * 
 * @author Douglas.Whitehead
 *
 */
public interface Transaction {

	/**
	 * Returns the TransactionID object.
	 * 
	 * @return String
	 */
	public String getTransactionID();
	
	/**
	 * Returns the Profile object.
	 * 
	 * @return Profile
	 */
	public Profile getProfile();
	
	/**
	 * Returns the Total object.
	 * 
	 * @return Total
	 */
	public Total getTotal();
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes();
	
	/**
	 * Returns the Item array.
	 * 
	 * @return Item[]
	 */
	public Item[] getItem();
	
	/**
	 * Transaction.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the TransactionID object.
		 * 
		 * @param String transactionID
		 * @return Builder
		 */
		public Builder transactionID(String transactionID);
		
		/**
		 * Builds the Profile object.
		 * 
		 * @param Profile profile
		 * @return Builder
		 */
		public Builder profile(Profile profile);
		
		/**
		 * Builds the Total object.
		 * 
		 * @param Total total
		 * @return Builder
		 */
		public Builder total(Total total);
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		public Builder attributes(Attributes attributes);
		
		/**
		 * Builds the Item array.
		 * 
		 * @param Item[] item
		 * @return Builder
		 */
		public Builder item(Item[] item);
		
		/**
		 * Builds and returns the Transaction object.
		 * 
		 * @return Transaction
		 */
		public Transaction build();
		
	}
}
