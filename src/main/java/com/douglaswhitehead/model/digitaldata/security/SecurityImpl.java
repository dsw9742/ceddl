package com.douglaswhitehead.model.digitaldata.security;

import java.util.LinkedHashMap;

/**
 * Implementation of Security interface.
 * 
 * @author douglas whitehead
 *
 */
public class SecurityImpl extends LinkedHashMap<String, Object> implements Security {

	/**
	 * long constant for <tt>serialVersionUID</tt>.
	 */
	private static final long serialVersionUID = 8342306488575406731L;
	
	/**
	 * SecurityImpl constructor. This method is only intended to be called by the BaseImpl.Builder class.
	 */
	public SecurityImpl() {
		
	}

	/**
	 * Creates Security object for key. This method is only intended to be called by the BaseImpl.Builder class.
	 * 
	 * @param String key The data layer key to which to attach the accessCategories
	 * @param String[] accessCategories An array of accessCategories
	 */
	@Override
	public void secure(final String key, final String[] value) {
		this.put(key, value);
	}

}