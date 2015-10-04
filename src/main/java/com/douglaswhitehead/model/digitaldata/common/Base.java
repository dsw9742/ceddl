package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Base class interface. Provides base security functionality.
 * 
 * @author douglas whitehead
 *
 */
public interface Base {
	
	/**
	 * Return the Security object.
	 * 
	 * @return Security object.
	 */
	public Security getSecurity();
	
	/**
	 * Builder inner interface for Base interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static interface Builder {
		
	}

}
