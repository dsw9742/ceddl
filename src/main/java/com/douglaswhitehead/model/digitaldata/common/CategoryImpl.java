package com.douglaswhitehead.model.digitaldata.common;

/**
 * Because of the wide range of methods for categorization, an object literal is provided for object
 * categories.
 *
 * The name primaryCategory is RECOMMENDED if you included only one set of categories
 * for objects, or for your primary set of categories. All other names are optional and should fit the
 * individual implementation needs in both naming and values passed.
 */
public class CategoryImpl implements Category {
	private final String primaryCategory;
	
	private CategoryImpl(
		final String newPrimaryCategory
		) {
		this.primaryCategory = newPrimaryCategory;
	}
	
	public String getPrimaryCategory() {
		return this.primaryCategory;
	}
	
	public static class Builder {
		private String nestedPrimaryCategory;
		
		public Builder primaryCategory(final String newPrimaryCategory) {
			this.nestedPrimaryCategory = newPrimaryCategory;
			return this;
		}
		
		public CategoryImpl build() {
			return new CategoryImpl(
				nestedPrimaryCategory
			);
		}
	}
}
