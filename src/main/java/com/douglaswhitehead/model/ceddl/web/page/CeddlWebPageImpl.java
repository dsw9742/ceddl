package com.douglaswhitehead.model.ceddl.web.page;

/**
 * 6.3 Page Object 
 *
 * The Page object carries significant details about the page, and the most commonly used data 
 * elements are captured by the specification below. The Page object and its children, where 
 * included, MUST have the following Object Names & Types.
 */
public class CeddlWebPageImpl implements CeddlWebPage {
	
	private final CeddlWebPageInfo pageInfo;
	private final CeddlWebPageCategory category;
	private final CeddlWebPageAttributes attributes;
	
	private CeddlWebPageImpl(
		final CeddlWebPageInfo newPageInfo,
		final CeddlWebPageCategory newCategory,
		final CeddlWebPageAttributes newAttributes
		) {
		this.pageInfo = newPageInfo;
		this.category = newCategory;
		this.attributes = newAttributes;
	};
	
	public CeddlWebPageInfo getPageInfo() {
		return this.pageInfo;
	}
	
	public CeddlWebPageCategory getCategory() {
		return this.category;
	}
	
	public CeddlWebPageAttributes getAttributes() {
		return this.attributes;
	}

	public static class Builder {
		private CeddlWebPageInfo nestedPageInfo;
		private CeddlWebPageCategory nestedCategory;
		private CeddlWebPageAttributes nestedAttributes;
		
		public Builder pageInfo(final CeddlWebPageInfo newPageInfo) {
			this.nestedPageInfo = newPageInfo;
			return this;
		}
		
		public Builder category(final CeddlWebPageCategory newCategory) {
			this.nestedCategory = newCategory;
			return this;
		}
		
		public Builder attributes(final CeddlWebPageAttributes newAttributes) {
			this.nestedAttributes = newAttributes;
			return this;
		}
		
		public CeddlWebPageImpl build() {
			return new CeddlWebPageImpl(
				nestedPageInfo,
				nestedCategory,
				nestedAttributes
			);
		}
	}
	
}
