package com.douglaswhitehead.model.digitaldata.security;

import java.util.Map;

/**
 * Security interface.
 * 
 * 6.11 Security Object
 * 
 * The Security object is an optional sub-object of each object in the JSO, which can be used to 
 * enforce data access control over that object. If a Security object is defined for an object, the 
 * value should be a comma-separated list of categories defined as categoryName in the Privacy 
 * object. If a Security object is not defined for an object, no data access controls will be enforced. 
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
	 * @param String key
	 * @param Object value
	 */
	public void secure(String key, Object value);

}