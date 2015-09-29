package com.contentualize.model.ceddl.web.page;

/**
 * Because of the wide range of methods for categorization, an object literal is provided for page
 * categories.
 *
 * The name primaryCategory is RECOMMENDED if you included only one set of categories
 * for pages, or for your primary set of categories. All other names are optional and should fit the
 * individual implementation needs in both naming and values passed.
 */
public class ContentualizeCeddlWebPageCategoryImpl implements CeddlWebPageCategory {
	private final String sectionCategory;
	private final String primaryCategory;
	private final String secondaryCategory;
	private final String tertiaryCategory;
	
	private ContentualizeCeddlWebPageCategoryImpl(
		final String newSectionCategory,
		final String newPrimaryCategory,
		final String newSecondaryCategory,
		final String newTertiaryCategory
		) {
		this.sectionCategory = newSectionCategory;
		this.primaryCategory = newPrimaryCategory;
		this.secondaryCategory = newSecondaryCategory;
		this.tertiaryCategory = newTertiaryCategory;
	}
	
	public String getSectionCategory() {
		return this.sectionCategory;
	}
	
	public String getPrimaryCategory() {
		return this.primaryCategory;
	}
	
	public String getSecondaryCategory() {
		return this.secondaryCategory;
	}
	
	public String getTertiaryCategory() {
		return this.tertiaryCategory;
	}
	
	public static class Builder {
		private String nestedSectionCategory;
		private String nestedPrimaryCategory;
		private String nestedSecondaryCategory;
		private String nestedTertiaryCategory;
		
		public Builder sectionCategory(final String newSectionCategory) {
			this.nestedSectionCategory = newSectionCategory;
			return this;
		}
		
		public Builder primaryCategory(final String newPrimaryCategory) {
			this.nestedPrimaryCategory = newPrimaryCategory;
			return this;
		}
		
		public Builder secondaryCategory(final String newSecondaryCategory) {
			this.nestedSecondaryCategory = newSecondaryCategory;
			return this;
		}
		
		public Builder tertiaryCategory(final String newTertiaryCategory) {
			this.nestedTertiaryCategory = newTertiaryCategory;
			return this;
		}
		
		public ContentualizeCeddlWebPageCategoryImpl build() {
			return new ContentualizeCeddlWebPageCategoryImpl(
				nestedSectionCategory,
				nestedPrimaryCategory,
				nestedSecondaryCategory,
				nestedTertiaryCategory
			);
		}
	}
}
