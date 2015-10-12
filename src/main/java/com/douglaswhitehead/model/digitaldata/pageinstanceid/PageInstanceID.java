package com.douglaswhitehead.model.digitaldata.pageinstanceid;

import java.util.Map;

/**
 * <p>PageInstanceID interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.2 Page Identifier Object</p>
 * 
 * <p>
 * The Page Identifier is among the most widely used web analytics data properties, and is among
 * the top level <tt>digitalData</tt> objects. A Page Identifier, where included, MUST have the
 * following Object Name & Type.
 * </p>
 * 
 * <p>A unique identifier for a page or other piece of content for which data is being collected.</p>
 * 
 * <p>
 * This value SHOULD distinguish among environments, such as whether this page is in
 * development, staging, or production. (Contrast with <tt>digitalData.page.pageID</tt> below, which
 * may be unique only within a particular environment.)
 * </p>
 * 
 * @author douglas.whitehead
 *
 */
public interface PageInstanceID {
	
	/**
	 * Returns the internal map of PageInstanceID properties.
	 * 
	 * @return Map<String, Object> 
	 */
	public Map<String, Object> getMap();
	
	/**
	 * PageInstanceID.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the PageInstanceID object.
		 * 
		 * @param String pageInstanceID
		 * @return Builder
		 */
		public Builder pageInstanceID(String pageInstanceID);
		
		/**
		 * Builds and returns the PageInstanceID object.
		 * 
		 * @return PageInstanceID
		 */
		public PageInstanceID build();
		
	}

}
