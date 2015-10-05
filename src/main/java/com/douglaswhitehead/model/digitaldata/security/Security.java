package com.douglaswhitehead.model.digitaldata.security;

import java.util.Map;

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
 */
public interface Security {
	
	/**
	 * Returns Map holding Security-related information. 
	 * 
	 * @return Map<String, Object> object
	 */
	public Map<String, Object> getMap();
	
	/**
	 * Creates Security object for key.
	 * 
	 * @param key The data layer key to which to attach the accessCategories
	 * @param accessCategories An array of accessCategories
	 */
	public void secure(String key, String[] accessCategories);

}