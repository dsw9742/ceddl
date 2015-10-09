package com.douglaswhitehead.model.digitaldata.component;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.common.Category;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Component interface.
 * 
 * @author Douglas.Whitehead
 *
 */
public class ComponentImpl extends BaseImpl implements Component {
	
	/**
	 * String constant for <tt>componentInfo</tt>.
	 */
	private final static String COMPONENT_INFO = "componentInfo";
	
	/**
	 * String constant for <tt>category</tt>.
	 */
	private final static String CATEGORY = "category";
	
	/**
	 * String constant for <tt>attributes</tt>.
	 */
	private final static String ATTRIBUTES = "attributes";
	
	/**
	 * ComponentImpl constructor.
	 * 
	 * @param Security security
	 * @param ComponentInfo componentInfo
	 * @param Category category
	 * @param Attributes attributes
	 */
	private ComponentImpl(
		final Security security,
		final ComponentInfo componentInfo,
		final Category category,
		final Attributes attributes
	) {
		this.security = security;
		this.map.put(COMPONENT_INFO, componentInfo);
		this.map.put(CATEGORY, category);
		this.map.put(ATTRIBUTES, attributes);
	}

	/**
	 * Returns the ComponentInfo object.
	 * 
	 * @return ComponentInfo
	 */
	@Override
	public ComponentInfo getComponentInfo() {
		return (ComponentInfo)map.get(COMPONENT_INFO);
	}

	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	@Override
	public Category getCategory() {
		return (Category)map.get(CATEGORY);
	}

	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	@Override
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}
	
	/**
	 * Implementation of the Component.Builder interface.
	 * 
	 * @author Douglas.Whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Component.Builder {
		
		/**
		 * Builds the ComponentInfo object.
		 * 
		 * @param ComponentInfo componentInfo
		 * @return Builder
		 */
		@Override
		public Builder componentInfo(final ComponentInfo componentInfo) {
			this.map.put(COMPONENT_INFO, componentInfo);
			this.previous = COMPONENT_INFO;
			return builder();
		}
		
		/**
		 * Builds the Category object.
		 * 
		 * @param Category category
		 * @return Builder
		 */
		@Override
		public Builder category(final Category category) {
			this.map.put(CATEGORY, category);
			this.previous = CATEGORY;
			return builder();
		}
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		@Override
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return builder();
		}
		
		/**
		 * Builds and returns the ComponentImpl object.
		 * 
		 * @return ComponentImpl
		 */
		@Override
		public ComponentImpl build() {
			return new ComponentImpl(
				security,
				(ComponentInfo)map.get(COMPONENT_INFO),
				(Category)map.get(CATEGORY),
				(Attributes)map.get(ATTRIBUTES)
			);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}

}
