package com.douglaswhitehead.model.digitaldata.security;

import java.util.Map;

public interface Security {
	
	public Map<String, Object> getMap();
	
	public void secure(String key, Object value);

}