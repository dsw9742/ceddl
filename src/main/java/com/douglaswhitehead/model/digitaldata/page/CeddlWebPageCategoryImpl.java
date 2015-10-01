package com.douglaswhitehead.model.digitaldata.page;

/**
 * Because of the wide range of methods for categorization, an object literal is provided for page
 * categories.
 *
 * The name primaryCategory is RECOMMENDED if you included only one set of categories
 * for pages, or for your primary set of categories. All other names are optional and should fit the
 * individual implementation needs in both naming and values passed.
 */
public class CeddlWebPageCategoryImpl implements CeddlWebPageCategory {
	private final String primaryCategory;
	
	private CeddlWebPageCategoryImpl(
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
		
		public CeddlWebPageCategoryImpl build() {
			return new CeddlWebPageCategoryImpl(
				nestedPrimaryCategory
			);
		}
	}
}
