package com.douglaswhitehead.model.digitaldata.component;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * <p>Component interface.</p>
 * 
 * <p>From the W3C CEDDL specification:</p>
 * 
 * <p>6.8 Component Object</p>
 * 
 * <p>
 * The Component object is intended to capture information about a content component included
 * as part of a page, such as a video. Interactions with the component - such as playing the video
 * - would be an Event, captured by the 6.7 Event Object.
 * </p>
 * 
 * <p>
 * The Component object and its children, where included, MUST have the following Object
 * Names & Types.
 * </p>
 * 
 * @author Douglas.Whitehead
 * 
 */
public interface Component {

	/**
	 * Returns the ComponentInfo object.
	 * 
	 * @return ComponentInfo
	 */
	public ComponentInfo getComponentInfo();
	
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
	 * Component.Builder inner interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static interface Builder {
		
		/**
		 * Builds the ComponentInfo object.
		 * 
		 * @param ComponentInfo componentInfo
		 * @return Builder
		 */
		public Builder componentInfo(ComponentInfo componentInfo);
		
		/**
		 * Builds the Category object.
		 * 
		 * @param Category category
		 * @return Builder
		 */
		public Builder category(Category category);
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		public Builder attributes(Attributes attributes);
		
		/**
		 * Builds and returns the Component object.
		 * 
		 * @return Component
		 */
		public Component build();
	}
}
