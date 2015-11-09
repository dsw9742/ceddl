package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Minimal implementation of the Category interface.
 * 
 * @author douglas whitehead
 *
 */
public class CategoryImpl extends BaseImpl implements Category {
	
	/**
	 * String constant for <tt>primaryCategory</tt>.
	 */
	private static final String PRIMARY_CATEGORY = "primaryCategory";
	
	/**
	 * CategoryImpl constructor.
	 * 
	 * @param Security security
	 * @param String primaryCategory
	 */
	private CategoryImpl(
		final Security security,
		final String primaryCategory
		) {
		this.security = security;
		this.map.put(PRIMARY_CATEGORY, primaryCategory);
	}
	
	/**
	 * Returns the PrimaryCategory object.
	 * 
	 * @return String
	 */
	@Override
	public String getPrimaryCategory() {
		return (String)map.get(PRIMARY_CATEGORY);
	}
	
	/**
	 * Implementation of Category.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Category.Builder {
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
		
		/**
		 * Builds the PrimaryCategory object.
		 * 
		 * @param String primaryCategory
		 * @return Builder
		 */
		@Override
		public Builder primaryCategory(final String primaryCategory) {
			this.map.put(PRIMARY_CATEGORY, primaryCategory);
			this.previous = PRIMARY_CATEGORY;
			return builder();
		}
		
		/**
		 * Builds and returns the CategoryImpl object.
		 * 
		 * @return CategoryImpl
		 */
		@Override
		public CategoryImpl build() {
			return new CategoryImpl(
				security,
				(String)map.get(PRIMARY_CATEGORY)
			);
		}
		
	}
}
