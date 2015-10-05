package com.douglaswhitehead.model.digitaldata.page;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * <p>Page interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.3 Page Object</p> 
 *
 * <p>
 * The Page object carries significant details about the page, and the most commonly used data 
 * elements are captured by the specification below. The Page object and its children, where 
 * included, MUST have the following Object Names & Types.
 * </p>
 * 
 * <p>Describes the page.</p>
 * 
 * @author douglas.whitehead
 *
 */
public interface Page {
	
	/**
	 * Returns the PageInfo object.
	 * 
	 * @return PageInfo
	 */
	public PageInfo getPageInfo();
	
	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	public Category getCategory();
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes();
	
	/**
	 * Page.Builder inner interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the PageInfo object.
		 * 
		 * @return Builder
		 */
		public Builder pageInfo(PageInfo pageInfo);
		
		/**
		 * Builds the Category object.
		 * 
		 * @return Builder
		 */
		public Builder category(Category category);
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @return Builder
		 */
		public Builder attributes(Attributes attributes);
		
		/**
		 * Builds and returns the Page object.
		 * 
		 * @return Page
		 */
		public Page build();
		
	}
}
