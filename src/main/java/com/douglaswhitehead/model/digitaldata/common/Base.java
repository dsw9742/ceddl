package com.douglaswhitehead.model.digitaldata.common;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Base {
	protected Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	public static class Builder {
		protected Map<String, Object> map = new LinkedHashMap<String, Object>();
		protected String previous;
		
		protected void addSecurity(String[] categories) {
			LinkedHashMap<String, String[]> sub = new LinkedHashMap<String, String[]>();
			sub.put("security", categories);
			
			Map<Object, LinkedHashMap<String, String[]>> security = new LinkedHashMap<Object, LinkedHashMap<String, String[]>>();
			security.put(map.get(previous), sub);
			map.put(previous, security);
		}
	}
}
