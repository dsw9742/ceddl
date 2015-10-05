package com.douglaswhitehead.model.digitaldata.common;

import java.util.LinkedHashMap;
import java.util.Map;

import com.douglaswhitehead.model.digitaldata.security.Security;
import com.douglaswhitehead.model.digitaldata.security.SecurityImpl;

/**
 * Implementation of Base interface. Provides base internal objects as well as base security functionality.
 * 
 * @author douglas whitehead
 *
 */
public abstract class BaseImpl implements Base {
	
	/**
	 * Internal LinkedHashMap to hold data layer information.
	 */
	protected Map<String, Object> map = new LinkedHashMap<String, Object>();
	
	/**
	 * Internal Security object to hold security-related information.
	 */
	protected Security security;
	
	/**
	 * Returns the Security object.
	 * 
	 * @return Security object
	 */
	@Override
	public Security getSecurity() {
		return security;
	}
	
	/**
	 * Implementation of Base.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public abstract static class Builder<K> implements Base.Builder<K> {
		
		/**
		 * Builder internal LinkedHashMap to hold data layer information.
		 */
		protected Map<String, Object> map = new LinkedHashMap<String, Object>();
		
		/**
		 * Builder internal Security object to hold security-related information.
		 */
		protected Security security;
		
		/**
		 * Builder previous variable to hold name of most recent object map key. This variable is intended to be 
		 * used in the security() method of each BaseImpl.Builder extending class. 
		 */
		protected String previous;
		
		/**
		 * Returns the Builder<K> object.
		 * 
		 * @return K the Builder generic
		 */
		protected abstract K builder();
		
		/**
		 * Builds the Security object. This method is only intended to be called by the BaseImpl.Builder class.
		 * 
		 * @param String[] accessCategories
		 * @return K the Builder generic
		 */
		@Override
		public K security(final String[] accessCategories) {
			if (security == null) {
				security = new SecurityImpl();
			}
			this.security.secure(previous, accessCategories);
			return builder();
		}
		
		/**
		 * Validates {@code previous } variable.
		 * 
		 * @throws IllegalStateException if no valid data layer field precedes the call to BaseImpl.Builder 
		 * extending class security() method. 
		 */
		protected void validateSecurity() {
			if (previous == null) {
				throw new IllegalStateException("No field found to secure - Call security() directly after setting a field to secure it.");
			}
		}
	}
}
