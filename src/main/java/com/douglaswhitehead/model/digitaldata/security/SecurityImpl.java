package com.douglaswhitehead.model.digitaldata.security;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

/**
 * Implementation of Security interface.
 * 
 * @author douglas whitehead
 *
 */
public class SecurityImpl implements Security {

	/**
	 * Internal LinkedHashMap to hold data layer security-related information.
	 */
	protected Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	/**
	 * SecurityImpl constructor. This method is only intended to be called by the BaseImpl.Builder class.
	 */
	public SecurityImpl() {
		
	}
	
	/**
	 * Returns SecurityImpl as contents of map.
	 * 
	 * @return Map<String, Object> the Map of security-related information
	 */
	@JsonAnyGetter
	@Override
	public Map<String, Object> getMap() {
		return map;
	}

	/**
	 * Creates Security object for key. This method is only intended to be called by the BaseImpl.Builder class.
	 * 
	 * @param String key The data layer key to which to attach the accessCategories
	 * @param String[] accessCategories An array of accessCategories
	 */
	@Override
	public void secure(final String key, final String[] value) {
		this.map.put(key, value);
	}

}