package com.douglaswhitehead.model.digitaldata.security;

/**
 * <p>Security interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.11 Security Object</p>
 * 
 * <p>
 * The Security object is an optional sub-object of each object in the JSO, which can be used to 
 * enforce data access control over that object. If a Security object is defined for an object, the 
 * value should be a comma-separated list of categories defined as categoryName in the Privacy 
 * object. If a Security object is not defined for an object, no data access controls will be enforced.
 * </p>
 * 
 * <p>
 * The Default category is required for security enforcement. The Default category has access to
 * all children of the digitalData element and does not need to be explicitly listed in Security
 * objects.
 * </p>
 * 
 * <p>
 * For instance, the security object associated with <tt>cartID</tt> would be written as:
 * <ul>
 * <li><b>Object being secured:</b>      <tt>digitalData.cart.<b>cartID</b></tt></p></li>
 * <li><b>Security object:</b>           <tt>digitalData.cart.<b>cartID.security:</b> "Analytics"</tt></li>
 * </ul>
 * </p>
 * 
 * <p>
 * For object literals, the same structure used in the the object literal is repeated in the Security
 * object with values for the security levels. For instance:
 * </p>
 * 
 * <p>
 * <b>Object being secured:</b>
 * 
 * <pre>
 * {@code
 *  digitalData.transaction.profile.<b>shippingAddress</b> = {
 *		line1: "673 Mystreet",
 *		line2: "Apt 1",
 *		city: "Austin",
 *		stateProvince: "TX",
 *		postalCode: "78610",
 *		country: "USA",
 *		shippingMethod: "UPS",
 *		specialInstruction: "Beware of Dog"
 *	};
 * }
 * </pre>
 * </p>
 * 
 * <p>
 * <b>Security object:</b>
 * 
 * <pre>
 * {@code
 *  digitalData.transaction.profile.<b>shippingAddress.security</b> = {
 * 		line1: "Personalization",
 * 		line2: "Personalization",
 * 		city: ["Analytics","Personalization"],
 * 		stateProvince: "Analytics",
 * 		postalCode: "Analytics"
 * 	};
 * }
 * </pre>
 * </p>
 * 
 * <p>
 * Because <tt>shippingMethod</tt> and <tt>specialInstruction</tt> do not have a security object defined,
 * there is no access control on those elements.
 * </p>
 * 
 * <p>
 * Security sub-object that captures the specific setting for its parent object. The value of security
 * properties MUST be a string or array with values drawn from the values of
 * <tt>digitalData.privacy.accessCategories[n].categoryName</tt>.
 * </p>
 * 
 * <p>
 * An empty string for a Security object indicates that only the Default category is allowed to
 * access the data. No Security object denotes that no data security protection is necessary for a
 * piece of data.
 * </p>
 * 
 * <p><b>Security object with empty string:</b> <tt>digitalData.cart.cartID.<b>security</b> = "";</tt></p>
 * 
 * <p>
 * Only the Default category can access the <tt>cartID</tt> property. Synonymous with
 * <tt>digitalData.cart.cartID.security = "Default"; </tt>.
 * </p>
 * 
 * <p><b>Security object not specified:</b> <tt>digitalData.cart.cartID.<b>security</b> = null;</tt></p>
 * 
 * <p>Any category can access the cartID property (i.e., no data access controls are enforced).</p>
 * 
 * @author douglas.whitehead
 * 
 */
public interface Security {
	
	/**
	 * Creates Security object for key.
	 * 
	 * @param key The data layer key to which to attach the accessCategories
	 * @param accessCategories An array of accessCategories
	 */
	public void secure(String key, String[] accessCategories);

}