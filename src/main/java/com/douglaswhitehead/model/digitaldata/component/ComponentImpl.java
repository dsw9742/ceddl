package com.douglaswhitehead.model.digitaldata.component;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * 6.8 Component Object
 * 
 * The Component object is intended to capture information about a content component included
 * as part of a page, such as a video. Interactions with the component — such as playing the video
 * — would be an Event, captured by the 6.7 Event Object.
 */
public class ComponentImpl implements Component {
	private ComponentInfo componentInfo;
	private Category category;
	private Attributes attributes;
	
	private ComponentImpl(
		final ComponentInfo newComponentInfo,
		final Category newCategory,
		final Attributes newAttributes
	) {
		this.componentInfo = newComponentInfo;
		this.category = newCategory;
		this.attributes = newAttributes;
	}

	public ComponentInfo getComponentInfo() {
		return componentInfo;
	}

	public Category getCategory() {
		return category;
	}

	public Attributes getAttributes() {
		return attributes;
	}
	
	public static class Builder {
		private ComponentInfo nestedComponentInfo;
		private Category nestedCategory;
		private Attributes nestedAttributes;
		
		public Builder componentInfo(final ComponentInfo newComponentInfo) {
			this.nestedComponentInfo = newComponentInfo;
			return this;
		}
		
		public Builder category(final Category newCategory) {
			this.nestedCategory = newCategory;
			return this;
		}
		
		public Builder attributes(final Attributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public ComponentImpl build() {
			return new ComponentImpl(
				nestedComponentInfo,
				nestedCategory,
				nestedAttributes
			);
		}
	}

}
