package com.douglaswhitehead.model.digitaldata.component;

/**
 * <p>ComponentInfo interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>This object describes the component.</p>
 * 
 * <pre>
 * {@code
 * digitalData.component[n].<b>componentInfo</b> = {
 * 		<b>componentID:</b> "rog300v",
 * 		componentName: "How to Use Rogaine",
 * 		description: "Hair Treatment Video"
 * 	};
 * }
 * </pre>
 * 
 * <p><b>Reserved:</b> <tt>componentID</tt> (String)</p>
 * 
 * <p></p>
 * 
 * @author Douglas.Whitehead
 *
 */
public interface ComponentInfo {

	/**
	 * Returns the ComponentID object.
	 * 
	 * @return String
	 */
	public String getComponentID();
	
	/**
	 * ComponentInfo.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the ComponentID object.
		 * 
		 * @param String componentID
		 * @return Builder
		 */
		public Builder componentID(String componentID);
		
		/**
		 * Builds and returns the ComponentInfo object.
		 * 
		 * @return ComponentInfo
		 */
		public ComponentInfo build();
	}
}
