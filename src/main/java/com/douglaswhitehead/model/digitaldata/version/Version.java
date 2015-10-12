package com.douglaswhitehead.model.digitaldata.version;

import java.util.Map;

/**
 * <p>Version interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.12 Version Object</p>
 * 
 * <p>The version of this specification used by the <tt>digitalData</tt> object.</p>
 * 
 * <p>
 * The version number corresponding to the W3C Community Specification for Customer
 * Experience Digital Data followed by the JSO. For <tt>digitalData</tt> objects conforming to this
 * specification document, the value SHOULD be <tt>digitalData.version = "1.0"</tt>.
 * </p>
 * 
 * @author douglas.whitehead
 *
 */
public interface Version {
	
	/**
	 * Returns the internal map of Version properties.
	 * 
	 * @return Map<String, Object> 
	 */
	public Map<String, Object> getMap();
	
	/**
	 * Version.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the Version object.
		 * 
		 * @param String version
		 * @return Builder
		 */
		public Builder version(String version);
		
		/**
		 * Builds and returns the Version object.
		 * 
		 * @return Version
		 */
		public Version build();
		
	}

}
