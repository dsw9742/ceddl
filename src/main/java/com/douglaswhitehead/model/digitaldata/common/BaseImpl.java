package com.douglaswhitehead.model.digitaldata.common;

import java.util.LinkedHashMap;
import java.util.Map;

import com.douglaswhitehead.model.digitaldata.security.Security;
import com.douglaswhitehead.model.digitaldata.security.SecurityImpl;

public abstract class BaseImpl implements Base {
	protected Map<String, Object> map = new LinkedHashMap<String, Object>();
	protected Security security = new SecurityImpl();
	
	public Security getSecurity() {
		return security;
	}
	
	public abstract static class Builder {
		protected Map<String, Object> map = new LinkedHashMap<String, Object>();
		protected Security security = new SecurityImpl();
		protected String previous;
		
		protected void validateSecurity() {
			if (previous == null) {
				throw new IllegalStateException("No field found to secure - Call security() directly after setting a field to secure it.");
			}
		}
	}
}
