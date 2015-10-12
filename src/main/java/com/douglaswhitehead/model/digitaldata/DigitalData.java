package com.douglaswhitehead.model.digitaldata;

import com.douglaswhitehead.model.digitaldata.cart.Cart;
import com.douglaswhitehead.model.digitaldata.component.Component;
import com.douglaswhitehead.model.digitaldata.event.Event;
import com.douglaswhitehead.model.digitaldata.page.Page;
import com.douglaswhitehead.model.digitaldata.pageinstanceid.PageInstanceID;
import com.douglaswhitehead.model.digitaldata.privacy.Privacy;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.transaction.Transaction;
import com.douglaswhitehead.model.digitaldata.user.User;
import com.douglaswhitehead.model.digitaldata.version.Version;

/**
 * <p>DigitalData interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6. The Customer Experience Digital Data Object</p>
 * 
 * <p>This section carries the core specification.</p>
 * 
 * <p>
 * Use of this specification can be adapted to specific cases, since the objects in the specification
 * can be included or omitted as necessary or desired. None of the objects in this specification are
 * required, but where objects are included they MUST conform to the Object Names and Types
 * listed here.
 * </p>
 * 
 * <p>6.1 The Root JavaScript Object</p>
 * 
 * <p>
 * The root JavaScript Object (JSO) MUST be <tt>digitalData</tt>, and all data properties within this
 * specification MUST fall within the hierarchy of the <tt>digitalData</tt> object.
 * </p>
 * 
 * <p>The following sub-objects are defined as children of the <tt>digitalData</tt> object.</p>
 * 
 * <p>
 * <ul>
 * <li><tt>digitalData.pageInstanceID</tt></li>
 * <li><tt>digitalData.page</tt></li>
 * <li><tt>digitalData.product[n]</tt></li>
 * <li><tt>digitalData.cart</tt></li>
 * <li><tt>digitalData.transaction</tt></li>
 * <li><tt>digitalData.event[n]</tt></li>
 * <li><tt>digitalData.component[n]</tt></li>
 * <li><tt>digitalData.user[n]</tt></li>
 * <li><tt>digitalData.privacy</tt></li>
 * <li><tt>digitalData.version</tt></li>
 * </ul>
 * </p>
 * 
 * <p>The following subsections detail each of these sub-objects.</p>
 */
public interface DigitalData {
	
	/**
	 * Returns the PageInstanceID object.
	 * 
	 * @return PageInstanceID
	 */
	public PageInstanceID getPageInstanceID();
	
	/**
	 * Returns the Page object.
	 * 
	 * @return Page
	 */
	public Page getPage();
	
	/**
	 * Returns the Product array.
	 * 
	 * @return Product[]
	 */
	public Product[] getProduct();
	
	/**
	 * Returns the Cart object.
	 * 
	 * @return Cart
	 */
	public Cart getCart();
	
	/**
	 * Returns the Transaction object.
	 * 
	 * @return Transaction
	 */
	public Transaction getTransaction();
	
	/**
	 * Returns the Event[] array.
	 * 
	 * @return Event[]
	 */
	public Event[] getEvent();
	
	/**
	 * Returns the Component array.
	 * 
	 * @return Component[]
	 */
	public Component[] getComponent();
	
	/**
	 * Returns the User array.
	 * 
	 * @return User[]
	 */
	public User[] getUser();
	
	/**
	 * Returns the Privacy object.
	 * 
	 * @return Privacy
	 */
	public Privacy getPrivacy();
	
	/**
	 * Returns the Version object.
	 * 
	 * @return Version
	 */
	public Version getVersion();
	
	/**
	 * DigitalData.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the PageInstanceID object.
		 * 
		 * @param String pageInstanceID
		 * @return Builder
		 */
		public Builder pageInstanceID(PageInstanceID pageInstanceID);
		
		/**
		 * Builds the Page object.
		 * 
		 * @param Page page
		 * @return Builder
		 */
		public Builder page(Page page);
		
		/**
		 * Builds the Product array.
		 * 
		 * @param Product[] product
		 * @return Builder
		 */
		public Builder product(Product[] product);
		
		/**
		 * Builds the Cart object.
		 * 
		 * @param Cart cart
		 * @return Builder
		 */
		public Builder cart(Cart cart);
		
		/**
		 * Builds the Transaction object.
		 * 
		 * @param Transaction transaction
		 * @return Builder
		 */
		public Builder transaction(Transaction transaction);
		
		/**
		 * Builds the Event array.
		 * 
		 * @param Event[] event
		 * @return Builder
		 */
		public Builder event(Event[] event);
		
		/**
		 * Builds the Component array.
		 * 
		 * @param Component[] component
		 * @return Builder
		 */
		public Builder component(Component[] component);
		
		/**
		 * Builds the User array.
		 * 
		 * @param User[] user
		 * @return Builder
		 */
		public Builder user(User[] user);
		
		/**
		 * Builds the Privacy object.
		 * 
		 * @param Privacy privacy
		 * @return Builder
		 */
		public Builder privacy(Privacy privacy);
		
		/**
		 * Builds the Version object.
		 * 
		 * @param String version
		 * @return Builder
		 */
		public Builder version(Version version);
		
		/**
		 * Builds and returns the DigitalData object.
		 * 
		 * @return Builder
		 */
		public DigitalData build();
		
	}
	
}