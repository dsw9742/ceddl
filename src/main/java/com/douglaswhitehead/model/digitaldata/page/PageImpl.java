package com.douglaswhitehead.model.digitaldata.page;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.Base;
import com.douglaswhitehead.model.digitaldata.common.Category;

/**
 * 6.3 Page Object 
 *
 * The Page object carries significant details about the page, and the most commonly used data 
 * elements are captured by the specification below. The Page object and its children, where 
 * included, MUST have the following Object Names & Types.
 */
public class PageImpl extends Base implements Page {
	
	private static final String PAGE_INFO = "pageInfo";
	private static final String CATEGORY = "category";
	private static final String ATTRIBUTES = "attributes";
	
	private PageImpl(
		final Object pageInfo,
		final Object category,
		final Object attributes
		) {
		this.map.put(PAGE_INFO, pageInfo);
		this.map.put(CATEGORY, category);
		this.map.put(ATTRIBUTES, attributes);
	};
	
	public Object getPageInfo() {
		return map.get(PAGE_INFO);
	}
	
	public Object getCategory() {
		return map.get(CATEGORY);
	}
	
	public Object getAttributes() {
		return map.get(ATTRIBUTES);
	}

	public static class Builder extends Base.Builder {
		
		public Builder pageInfo(final PageInfo pageInfo) {
			this.map.put(PAGE_INFO, pageInfo);
			this.previous = PAGE_INFO;
			return this;
		}
		
		public Builder category(final Category category) {
			this.map.put(CATEGORY, category);
			this.previous = CATEGORY;
			return this;
		}
		
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return this;
		}
		
		public PageImpl build() {
			return new PageImpl(
				map.get(PAGE_INFO),
				map.get(CATEGORY),
				map.get(ATTRIBUTES)
			);
		}
	}
	
}
