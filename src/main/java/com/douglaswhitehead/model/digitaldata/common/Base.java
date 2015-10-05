package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Base interface. Provides base security functionality.
 * 
 * @author douglas whitehead
 *
 */
public interface Base {
	
	/**
	 * Returns the Security object.
	 * 
	 * @return the Security object.
	 */
	public Security getSecurity();
	
	/**
	 * Base.Builder inner interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder<K> {
		
		/**
		 * Builds the Security object.
		 * 
		 * @param accessCategories
		 * @return K the Builder<K> generic
		 */
		public K security(String[] accessCategories);
		
	}

}
