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
	 * Internal LinkedHashMap to hold data layer Security-related information.
	 */
	private Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	public SecurityImpl() {
		
	}
	
	/**
	 * Returns SecurityImpl as contents of map.
	 * 
	 * @return Map<String, Object>
	 */
	@JsonAnyGetter
	public Map<String, Object> getMap() {
		return map;
	}

	/**
	 * Creates Security object for key.
	 * 
	 * @param String key
	 * @param Object value
	 */
	@Override
	public void secure(final String key, final Object value) {
		this.map.put(key, value);
	}

}