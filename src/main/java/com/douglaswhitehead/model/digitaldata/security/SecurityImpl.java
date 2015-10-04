package com.douglaswhitehead.model.digitaldata.security;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

/**
 * 6.11 Security Object
 * 
 * The Security object is an optional sub-object of each object in the JSO, which can be used to 
 * enforce data access control over that object. If a Security object is defined for an object, the 
 * value should be a comma-separated list of categories defined as categoryName in the Privacy 
 * object. If a Security object is not defined for an object, no data access controls will be enforced. 
 */
public class SecurityImpl implements Security {

	private Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	public SecurityImpl() {
		
	}
	
	@JsonAnyGetter
	public Map<String, Object> getMap() {
		return map;
	}

	@Override
	public void secure(final String key, final Object value) {
		this.map.put(key, value);
	}

}