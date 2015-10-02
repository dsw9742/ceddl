package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.transaction.Transaction;
import com.douglaswhitehead.model.digitaldata.user.User;

/**
 * The root JavaScript Object (JSO) MUST be digitalData, and all data properties within this
 * specification MUST fall within the hierarchy of the digitalData object.
 */
public class DigitalDataImpl implements DigitalData {

	private final String pageInstanceID;
	private final Page page;
	private final Product[] product;
	private final Cart cart;
	private final Transaction transaction;
	private final User[] user;
	private final String version;
	
	public DigitalDataImpl(
		final String newPageInstanceID,
		final Page newPage,
		final Product[] newProduct,
		final Cart newCart,
		final Transaction newTransaction,
		final User[] newUser,
		final String newVersion
	) {
		this.pageInstanceID = newPageInstanceID;
		this.page = newPage;
		this.product = newProduct;
		this.cart = newCart;
		this.transaction = newTransaction;
		this.user = newUser;
		this.version = newVersion;
	}
	
	public String getPageInstanceID() {
		return pageInstanceID;
	}

	public Page getPage() {
		return page;
	}

	public Product[] getProduct() {
		return product;
	}

	public Cart getCart() {
		return cart;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public User[] getUser() {
		return user;
	}

	public String getVersion() {
		return version;
	}

	public static class Builder {
		private String nestedPageInstanceID;
		private Page nestedPage;
		private Product[] nestedProduct;
		private Cart nestedCart;
		private Transaction nestedTransaction;
		private User[] nestedUser;
		private String nestedVersion;
		
		public Builder pageInstanceID(final String newPageInstanceID) {
			this.nestedPageInstanceID = newPageInstanceID;
			return this;
		}
		
		public Builder page(final Page newPage) {
			this.nestedPage = newPage;
			return this;
		}
		
		public Builder product(final Product[] newProduct) {
			this.nestedProduct = newProduct;
			return this;
		}
		
		public Builder cart(final Cart newCart) {
			this.nestedCart = newCart;
			return this;
		}
		
		public Builder transaction(final Transaction newTransaction) {
			this.nestedTransaction = newTransaction;
			return this;
		}
		
		public Builder user(final User[] newUser) {
			this.nestedUser = newUser;
			return this;
		}
		
		public Builder version(final String newVersion) {
			this.nestedVersion = newVersion;
			return this;
		}
		
		public DigitalDataImpl build() {
			return new DigitalDataImpl(
				nestedPageInstanceID,
				nestedPage,
				nestedProduct,
				nestedCart,
				nestedTransaction,
				nestedUser,
				nestedVersion
			);
		}
	}

}
