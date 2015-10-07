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

	private final static String CART_ID = "cartID";
	private final static String PRICE = "price";
	private final static String ATTRIBUTES = "attributes";
	private final static String ITEM = "item";
	
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
	
	public String getCartID() {
		return (String)map.get(CART_ID);
	}
	
	public Price getPrice() {
		return (Price)map.get(PRICE);
	}
	
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}
	
	public Item[] getItem() {
		return (Item[])map.get(ITEM);
	}
	
	public static class Builder extends BaseImpl.Builder<Builder> implements Cart.Builder {

		public Builder cartID(final String cartID) {
			this.map.put(CART_ID, cartID);
			this.previous = CART_ID;
			return builder();
		}
		
		public Builder price(final Price price) {
			this.map.put(PRICE, price);
			this.previous = PRICE;
			return builder();
		}

		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return builder();
		}
		
		public Builder item(final Item[] item) {
			this.map.put(ITEM, item);
			this.previous = ITEM;
			return builder();
		}
		
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
		protected Builder builder() {
			return this;
		}
	}
}
