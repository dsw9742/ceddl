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
	 * Return the Security object.
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
	public static interface Builder {
		
	}

}
