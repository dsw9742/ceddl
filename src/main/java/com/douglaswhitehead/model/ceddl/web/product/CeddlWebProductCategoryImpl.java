package com.contentualize.model.ceddl.web.product;

/**
 * Because of the wide range of methods for categorization, an object literal is provided for 
 * product categories.
 *
 * The name primaryCategory is RECOMMENDED if you included only one set of categories
 * for products, or for your primary set of categories. All other names are optional and should fit
 * the individual implementation needs in both naming and values passed.
 */
public class CeddlWebProductCategoryImpl implements CeddlWebProductCategory {
	private final String primaryCategory;
	
	private CeddlWebProductCategoryImpl(
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
		
		public CeddlWebProductCategoryImpl build() {
			return new CeddlWebProductCategoryImpl(
				nestedPrimaryCategory
			);
		}
	}
}
