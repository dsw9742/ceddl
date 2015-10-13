package com.douglaswhitehead.model.digitaldata;

import java.util.LinkedHashMap;
import java.util.Map;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.component.Component;
import com.douglaswhitehead.model.digitaldata.event.Event;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.privacy.Privacy;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.security.Security;
import com.douglaswhitehead.model.digitaldata.transaction.Transaction;
import com.douglaswhitehead.model.digitaldata.user.User;

/**
 * Implementation of the DigitalData interface.
 * 
 * @author douglas.whitehead
 *
 */
public class DigitalDataImpl extends BaseImpl implements DigitalData {

	/**
	 * String constant for <tt>pageInstanceID</tt>.
	 */
	private final static String PAGE_INSTANCE_ID = "pageInstanceID";
	
	/**
	 * String constant for <tt>page</tt>.
	 */
	private final static String PAGE = "page";
	
	/**
	 * String constant for <tt>product</tt>.
	 */
	private final static String PRODUCT = "product";
	
	/**
	 * String constant for <tt>cart</tt>.
	 */
	private final static String CART = "cart";
	
	/**
	 * String constant for <tt>transaction</tt>.
	 */
	private final static String TRANSACTION = "transaction";
	
	/**
	 * String constant for <tt>event</tt>.
	 */
	private final static String EVENT = "event";
	
	/**
	 * String constant for <tt>component</tt>.
	 */
	private final static String COMPONENT = "component";
	
	/**
	 * String constant for <tt>user</tt>.
	 */
	private final static String USER = "user";
	
	/**
	 * String constant for <tt>privacy</tt>.
	 */
	private final static String PRIVACY = "privacy";
	
	/**
	 * String constant for <tt>version</tt>.
	 */
	private final static String VERSION = "version";
	
	/**
	 * Internal LinkedHashMap to hold DigitalData properties.
	 */
	protected Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	/**
	 * DigitalDataImpl constructor.
	 * 
	 * @param Security security
	 * @param String pageInstanceID
	 * @param Page page
	 * @param Product[] product
	 * @param Cart cart
	 * @param Transaction transaction
	 * @param Event[] event
	 * @param Component[] component
	 * @param User[] user
	 * @param Privacy privacy
	 * @param String version
	 */
	private DigitalDataImpl(
		final Security security,
		final String pageInstanceID,
		final Page page,
		final Product[] product,
		final Cart cart,
		final Transaction transaction,
		final Event[] event,
		final Component[] component,
		final User[] user,
		final Privacy privacy,
		final String version
	) {
		this.security = security;
		this.map.put(PAGE_INSTANCE_ID, pageInstanceID);
		this.map.put(PAGE, page);
		this.map.put(PRODUCT, product);
		this.map.put(CART, cart);
		this.map.put(TRANSACTION, transaction);
		this.map.put(EVENT, event);
		this.map.put(COMPONENT, component);
		this.map.put(USER, user);
		this.map.put(PRIVACY, privacy);
		this.map.put(VERSION, version);
	}
	
	/**
	 * Returns the PageInstanceID object.
	 * 
	 * @return String
	 */
	@Override
	public String getPageInstanceID() {
		return (String)map.get(PAGE_INSTANCE_ID);
	}

	/**
	 * Returns the Page object.
	 * 
	 * @return Page
	 */
	@Override
	public Page getPage() {
		return (Page)map.get(PAGE);
	}

	/**
	 * Returns the Product[] array.
	 * 
	 * @return Product[]
	 */
	@Override
	public Product[] getProduct() {
		return (Product[])map.get(PRODUCT);
	}

	/**
	 * Returns the Cart object.
	 * 
	 * @return Cart
	 */
	@Override
	public Cart getCart() {
		return (Cart)map.get(CART);
	}

	/**
	 * Returns the Transaction.
	 * 
	 * @return Transaction
	 */
	@Override
	public Transaction getTransaction() {
		return (Transaction)map.get(TRANSACTION);
	}
	
	/**
	 * Returns the Event[] array.
	 * 
	 * @return Event[]
	 */
	@Override
	public Event[] getEvent() {
		return (Event[])map.get(EVENT);
	}
	
	/**
	 * Returns the Component[] array.
	 * 
	 * @return Component[]
	 */
	@Override
	public Component[] getComponent() {
		return (Component[])map.get(COMPONENT);
	}

	/**
	 * Returns the User[] array.
	 * 
	 * @return User[]
	 */
	@Override
	public User[] getUser() {
		return (User[])map.get(USER);
	}
	
	/**
	 * Returns the Privacy object.
	 * 
	 * @return Privacy
	 */
	@Override
	public Privacy getPrivacy() {
		return (Privacy)map.get(PRIVACY);
	}

	/**
	 * Returns the Version object.
	 * 
	 * @return String
	 */
	@Override
	public String getVersion() {
		return (String)map.get(VERSION);
	}

	/**
	 * Implementation of the DigitalData.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements DigitalData.Builder {
		
		/**
		 * Internal LinkedHashMap to hold DigitalData.Builder properties.
		 */
		protected Map<String, Object> map = new LinkedHashMap<String, Object>();
		
		/**
		 * Builds the PageInstanceID object.
		 * 
		 * @param String pageInstanceID
		 * @return Builder
		 */
		@Override
		public Builder pageInstanceID(final String pageInstanceID) {
			this.map.put(PAGE_INSTANCE_ID, pageInstanceID);
			this.previous = PAGE_INSTANCE_ID;
			return builder();
		}
		
		/**
		 * Builds the Page object.
		 * 
		 * @param Page page
		 * @return Builder
		 */
		@Override
		public Builder page(final Page page) {
			this.map.put(PAGE, page);
			this.previous = PAGE;
			return builder();
		}
		
		/**
		 * Builds the Product array.
		 * 
		 * @param Product[] product
		 * @return Builder
		 */
		@Override
		public Builder product(final Product[] product) {
			this.map.put(PRODUCT, product);
			this.previous = PRODUCT;
			return builder();
		}
		
		/**
		 * Builds the Cart object.
		 * 
		 * @param Cart cart
		 * @return Builder
		 */
		@Override
		public Builder cart(final Cart cart) {
			this.map.put(CART, cart);
			this.previous = CART;
			return builder();
		}
		
		/**
		 * Builds the Transaction object.
		 * 
		 * @param Transaction transaction
		 * @return Builder
		 */
		@Override
		public Builder transaction(final Transaction transaction) {
			this.map.put(TRANSACTION, transaction);
			this.previous = TRANSACTION;
			return builder();
		}
		
		/**
		 * Builds the Event array.
		 * 
		 * @param Event[] event
		 * @return Builder
		 */
		@Override
		public Builder event(final Event[] event) {
			this.map.put(EVENT, event);
			this.previous = EVENT;
			return builder();
		}
		
		/**
		 * Builds the Component array.
		 * 
		 * @param Component[] component
		 * @return Builder
		 */
		@Override
		public Builder component(final Component[] component) {
			this.map.put(COMPONENT, component);
			this.previous = COMPONENT;
			return builder();
		}
		
		/**
		 * Builds the User[] array.
		 * 
		 * @param User[] user
		 * @return Builder
		 */
		@Override
		public Builder user(final User[] user) {
			this.map.put(USER, user);
			this.previous = USER;
			return builder();
		}
		
		/**
		 * Builds the Privacy object.
		 * 
		 * @param Privacy privacy
		 * @return Builder
		 */
		@Override
		public Builder privacy(final Privacy privacy) {
			this.map.put(PRIVACY, privacy);
			this.previous = PRIVACY;
			return builder();
		}
		
		/**
		 * Builds the Version object.
		 * 
		 * @param String version
		 * @return Builder
		 */
		@Override
		public Builder version(final String version) {
			this.map.put(VERSION, version);
			this.previous = VERSION;
			return builder();
		}
		
		/**
		 * Builds and returns the DigitalDataImpl object.
		 * 
		 * @return DigitalDataImpl
		 */
		@Override
		public DigitalDataImpl build() {
			return new DigitalDataImpl(
				security,
				(String)map.get(PAGE_INSTANCE_ID),
				(Page)map.get(PAGE),
				(Product[])map.get(PRODUCT),
				(Cart)map.get(CART),
				(Transaction)map.get(TRANSACTION),
				(Event[])map.get(EVENT),
				(Component[])map.get(COMPONENT),
				(User[])map.get(USER),
				(Privacy)map.get(PRIVACY),
				(String)map.get(VERSION)
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