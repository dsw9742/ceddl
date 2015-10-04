package com.douglaswhitehead.model.digitaldata.common;

import java.util.Map;

import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Because of the wide range of methods for categorization, an object literal is provided for object
 * categories.
 *
 * The name primaryCategory is RECOMMENDED if you included only one set of categories
 * for objects, or for your primary set of categories. All other names are optional and should fit the
 * individual implementation needs in both naming and values passed.
 */
public class CategoryImpl extends BaseImpl implements Category {
	private static final String PRIMARY_CATEGORY = "primaryCategory";
	
	private CategoryImpl(
		//final Map<String, Object> security,
		final Security security,
		final Object primaryCategory
		) {
		this.security = security;
		this.map.put(PRIMARY_CATEGORY, primaryCategory);
	}
	
	public Object getPrimaryCategory() {
		return map.get(PRIMARY_CATEGORY);
	}
	
	public static class Builder extends BaseImpl.Builder {
		
		public Builder security(final String[] accessCategories) {
			//this.security.put(previous, accessCategories);
			this.security.secure(previous, accessCategories);
			return this;
		}
		
		public Builder primaryCategory(final String primaryCategory) {
			this.map.put(PRIMARY_CATEGORY, primaryCategory);
			this.previous = PRIMARY_CATEGORY;
			return this;
		}
		
		public CategoryImpl build() {
			return new CategoryImpl(
				security,
				map.get(PRIMARY_CATEGORY)
			);
		}
		
	}
}
