package com.douglaswhitehead.model.digitaldata.cart;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.common.Item;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Cart interface.
 * 
 * @author douglas whitehead
 *
 */
public class CartImpl extends BaseImpl implements Cart {

	/**
	 * String constant for <tt>cartID</tt>.
	 */
	private final static String CART_ID = "cartID";
	
	/**
	 * String constant for <tt>price</tt>.
	 */
	private final static String PRICE = "price";
	
	/**
	 * String constant for <tt>attributes</tt>.
	 */
	private final static String ATTRIBUTES = "attributes";
	
	/**
	 * String constant for <tt>item</tt>.
	 */
	private final static String ITEM = "item";
	
	/**
	 * CartImpl constructor.
	 * 
	 * @param Security security
	 * @param String cartID
	 * @param Price price
	 * @param Attributes attributes
	 * @param Item[] item
	 */
	private CartImpl(
		final Security security,
		final String cartID,
		final Price price,
		final Attributes attributes,
		final Item[] item
	) {
		this.security = security;
		this.map.put(CART_ID, cartID);
		this.map.put(PRICE, price);
		this.map.put(ATTRIBUTES, attributes);
		this.map.put(ITEM, item);
	}
	
	/**
	 * Returns the String object.
	 * 
	 * @return String
	 */
	@Override
	public String getCartID() {
		return (String)map.get(CART_ID);
	}
	
	/**
	 * Returns the Price object.
	 * 
	 * @return Price
	 */
	@Override
	public Price getPrice() {
		return (Price)map.get(PRICE);
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
	 * Implementation of the Cart.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Cart.Builder {

		/**
		 * Builds the CartID object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder cartID(final String cartID) {
			this.map.put(CART_ID, cartID);
			this.previous = CART_ID;
			return builder();
		}
		
		/**
		 * Builds the Price object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder price(final Price price) {
			this.map.put(PRICE, price);
			this.previous = PRICE;
			return builder();
		}

		/**
		 * Builds the Attributes object.
		 * 
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
		 * @return Builder
		 */
		@Override
		public Builder item(final Item[] item) {
			this.map.put(ITEM, item);
			this.previous = ITEM;
			return builder();
		}
		
		/**
		 * Builds and returns the CartImpl object.
		 * 
		 * @return CartImpl
		 */
		@Override
		public CartImpl build() {
			return new CartImpl(
				security,
				(String)map.get(CART_ID),
				(Price)map.get(PRICE),
				(Attributes)map.get(ATTRIBUTES),
				(Item[])map.get(ITEM)
			);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}
}
