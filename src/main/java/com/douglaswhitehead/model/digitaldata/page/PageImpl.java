package com.douglaswhitehead.model.digitaldata.page;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * 6.3 Page Object 
 *
 * The Page object carries significant details about the page, and the most commonly used data 
 * elements are captured by the specification below. The Page object and its children, where 
 * included, MUST have the following Object Names & Types.
 */
public class PageImpl implements Page {
	
	private final PageInfo pageInfo;
	private final Category category;
	private final Attributes attributes;
	
	private PageImpl(
		final PageInfo newPageInfo,
		final Category newCategory,
		final Attributes newAttributes
		) {
		this.pageInfo = newPageInfo;
		this.category = newCategory;
		this.attributes = newAttributes;
	};
	
	public PageInfo getPageInfo() {
		return this.pageInfo;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public Attributes getAttributes() {
		return this.attributes;
	}

	public static class Builder {
		private PageInfo nestedPageInfo;
		private Category nestedCategory;
		private Attributes nestedAttributes;
		
		public Builder pageInfo(final PageInfo newPageInfo) {
			this.nestedPageInfo = newPageInfo;
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
		
		public PageImpl build() {
			return new PageImpl(
				nestedPageInfo,
				nestedCategory,
				nestedAttributes
			);
		}
	}
	
}
