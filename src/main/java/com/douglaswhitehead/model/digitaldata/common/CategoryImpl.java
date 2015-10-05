package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Category interface.
 * 
 * @author douglas whitehead
 *
 */
public class CategoryImpl extends BaseImpl implements Category {
	
	/**
	 * String constant for {@code primaryCategory }
	 */
	private static final String PRIMARY_CATEGORY = "primaryCategory";
	
	/**
	 * CategoryImpl constructor.
	 * 
	 * @param Security security
	 * @param Object primaryCategory
	 */
	private CategoryImpl(
		final Security security,
		final Object primaryCategory
		) {
		this.security = security;
		this.map.put(PRIMARY_CATEGORY, primaryCategory);
	}
	
	/**
	 * Returns the PrimaryCategory object.
	 * 
	 * @return Object
	 */
	public Object getPrimaryCategory() {
		return map.get(PRIMARY_CATEGORY);
	}
	
	/**
	 * Implementation of Category.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder implements Category.Builder {
		
		/**
		 * Builds the Security object.
		 * 
		 * @param String[] accessCategories
		 * @return Builder
		 */
		public Builder security(final String[] accessCategories) {
			this.security.secure(previous, accessCategories);
			return this;
		}
		
		/**
		 * Builds the PrimaryCategory object.
		 * 
		 * @param String primaryCategory
		 * @return Builder
		 */
		public Builder primaryCategory(final String primaryCategory) {
			this.map.put(PRIMARY_CATEGORY, primaryCategory);
			this.previous = PRIMARY_CATEGORY;
			return this;
		}
		
		/**
		 * Builds the Category object.
		 * 
		 * @return Category
		 */
		public CategoryImpl build() {
			return new CategoryImpl(
				security,
				map.get(PRIMARY_CATEGORY)
			);
		}
		
	}
}
