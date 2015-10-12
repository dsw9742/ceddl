package com.douglaswhitehead.model.digitaldata.privacy;

/**
 * Implementation of the AccessCategory interface.
 * 
 * @author douglas.whitehead
 *
 */
public class AccessCategoryImpl implements AccessCategory {
	
	/**
	 * Variable for <tt>categoryName</tt> object.
	 */
	private final String categoryName;
	
	/**
	 * Variable for <tt>domains</tt> array.
	 */
	private final String[] domains;
	
	/**
	 * AccessCategoryImpl constructor.
	 * 
	 * @param String categoryName
	 * @param String[] domains
	 */
	private AccessCategoryImpl(
		final String categoryName,
		final String[] domains
	) {
		this.categoryName = categoryName;
		this.domains = domains;
	}
	
	/**
	 * Returns the CategoryName object.
	 * 
	 * @return String
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Returns the Domains array.
	 * 
	 * @return String[]
	 */
	public String[] getDomains() {
		return domains;
	}
	
	/**
	 * Implementation of the AccessCategory.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder implements AccessCategory.Builder {
		
		/**
		 * Variable for <tt>categoryName</tt> object.
		 */
		private String categoryName;
		
		/**
		 * Variable for <tt>domains</tt> array.
		 */
		private String[] domains;
		
		/**
		 * Builds the CategoryName object.
		 * 
		 * @param String categoryName
		 * @return Builder
		 */
		public Builder categoryName(final String categoryName) {
			this.categoryName = categoryName;
			return builder();
		}
		
		/**
		 * Builds the Domains array.
		 * 
		 * @param String[] domains
		 * @return Builder
		 */
		public Builder domains(final String[] domains) {
			this.domains = domains;
			return builder();
		}
		
		/**
		 * Builds and returns the AccessCategoryImpl object.
		 * 
		 * @return AccessCategoryImpl
		 */
		public AccessCategoryImpl build() {
			return new AccessCategoryImpl(
				categoryName,
				domains
			);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		private Builder builder() {
			return this;
		}
	}

}
