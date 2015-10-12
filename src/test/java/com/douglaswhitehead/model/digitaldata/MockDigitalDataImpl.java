package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.DigitalData;
import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.cart.CartImpl;
import com.douglaswhitehead.model.digitaldata.component.Component;
import com.douglaswhitehead.model.digitaldata.component.ComponentImpl;
import com.douglaswhitehead.model.digitaldata.event.Event;
import com.douglaswhitehead.model.digitaldata.event.EventImpl;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.page.PageImpl;
import com.douglaswhitehead.model.digitaldata.pageinstanceid.PageInstanceID;
import com.douglaswhitehead.model.digitaldata.pageinstanceid.PageInstanceIDImpl;
import com.douglaswhitehead.model.digitaldata.privacy.Privacy;
import com.douglaswhitehead.model.digitaldata.privacy.PrivacyImpl;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.product.ProductImpl;
import com.douglaswhitehead.model.digitaldata.transaction.Transaction;
import com.douglaswhitehead.model.digitaldata.transaction.TransactionImpl;
import com.douglaswhitehead.model.digitaldata.user.User;
import com.douglaswhitehead.model.digitaldata.user.UserImpl;
import com.douglaswhitehead.model.digitaldata.version.Version;
import com.douglaswhitehead.model.digitaldata.version.VersionImpl;

/**
 * Mock implementation of DigitalData interface for testing purposes.
 */
public class MockDigitalDataImpl implements DigitalData {
	
	public MockDigitalDataImpl() {}

	public PageInstanceID getPageInstanceID() {
		return new PageInstanceIDImpl.Builder().pageInstanceID("mock-ceddl").build();
	}

	public Page getPage() {
		return new PageImpl.Builder().build();
	}
	
	public Product[] getProduct() {
		Product[] products = new Product[1];
		products[0] = new ProductImpl.Builder().build();
		return products;
	}
	
	public Cart getCart() {
		return new CartImpl.Builder().build();
	}
	
	public Transaction getTransaction() {
		return new TransactionImpl.Builder().build();
	}
	
	public Event[] getEvent() {
		Event[] events = new Event[1];
		events[0] = new EventImpl.Builder().build();
		return events;
	}
	
	public Component[] getComponent() {
		Component[] components = new Component[1];
		components[0] = new ComponentImpl.Builder().build();
		return components;
	}

	public User[] getUser() {
		User[] users = new User[1];
		users[0] = new UserImpl.Builder().build();
		return users;
	}
	
	public Privacy getPrivacy() {
		return new PrivacyImpl.Builder().build();
	}

	public Version getVersion() {
		return new VersionImpl.Builder().version("1.0").build();
	}

}
