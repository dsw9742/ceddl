package com.douglaswhitehead.model.digitaldata.page;

import com.douglaswhitehead.model.digitaldata.common.Attributes;
import com.douglaswhitehead.model.digitaldata.common.BaseImpl;
import com.douglaswhitehead.model.digitaldata.common.Category;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Page interface.
 * 
 * @author douglas.whitehead
 * 
 */
public class PageImpl extends BaseImpl implements Page {
	
	/**
	 * String constant for <tt>pageInfo</tt>
	 */
	private static final String PAGE_INFO = "pageInfo";
	
	/**
	 * String constant for <tt>category</tt>
	 */
	private static final String CATEGORY = "category";
	
	/**
	 * String constant for <tt>attributes</tt>
	 */
	private static final String ATTRIBUTES = "attributes";
	
	/**
	 * PageImpl constructor.
	 * 
	 * @param Security security
	 * @param PageInfo pageInfo
	 * @param Category category
	 * @param Attributes attributes
	 */
	private PageImpl(
		final Security security,
		final PageInfo pageInfo,
		final Category category,
		final Attributes attributes
		) {
		this.security = security;
		this.map.put(PAGE_INFO, pageInfo);
		this.map.put(CATEGORY, category);
		this.map.put(ATTRIBUTES, attributes);
	};
	
	/**
	 * Returns the PageInfo object.
	 * 
	 * @return PageInfo
	 */
	public PageInfo getPageInfo() {
		return (PageInfo)map.get(PAGE_INFO);
	}
	
	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	public Category getCategory() {
		return (Category)map.get(CATEGORY);
	}
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}

	/**
	 * Implementation of the Page.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Page.Builder {
		
		/**
		 * Builds the PageInfo object.
		 * 
		 * @return Builder
		 */
		public Builder pageInfo(final PageInfo pageInfo) {
			this.map.put(PAGE_INFO, pageInfo);
			this.previous = PAGE_INFO;
			return self();
		}
		
		/**
		 * Builds the Category object.
		 * 
		 * @return Builder
		 */
		public Builder category(final Category category) {
			this.map.put(CATEGORY, category);
			this.previous = CATEGORY;
			return self();
		}
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @return Builder
		 */
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return self();
		}
		
		/**
		 * Builds and returns the PageImpl object.
		 * 
		 * @return PageImpl
		 */
		public PageImpl build() {
			return new PageImpl(
				security,
				(PageInfo)map.get(PAGE_INFO),
				(Category)map.get(CATEGORY),
				(Attributes)map.get(ATTRIBUTES)
			);
		}

		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder self() {
			return this;
		}
	}
	
}
