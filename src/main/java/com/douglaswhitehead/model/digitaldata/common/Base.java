package com.douglaswhitehead.model.digitaldata.common;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Base {
	protected Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	public abstract static class Builder {
		protected Map<String, Object> map = new LinkedHashMap<String, Object>();
		protected String previous;
		
		/*NOTE: Disabled until this functionality is working according to section 6.11 Security Object of the W3C spec. Frankly,
		 *      not sure this section of the spec is even implementable.
		protected void addSecurity(String[] categories) {
			LinkedHashMap<String, String[]> sub = new LinkedHashMap<String, String[]>();
			sub.put("security", categories);
			
			Map<Object, LinkedHashMap<String, String[]>> security = new LinkedHashMap<Object, LinkedHashMap<String, String[]>>();
			security.put(map.get(previous), sub);
			map.put(previous, security);
		}*/

	}
}
