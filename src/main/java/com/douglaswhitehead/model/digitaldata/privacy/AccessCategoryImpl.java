package com.douglaswhitehead.model.digitaldata.privacy;

/**
 * A list of privacy categories.
 */
public class AccessCategoryImpl implements AccessCategory {

	private final String categoryName;
	private final String[] domains;
	
	private AccessCategoryImpl(
		final String newCategoryName,
		final String[] newDomains
	) {
		this.categoryName = newCategoryName;
		this.domains = newDomains;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public String[] getDomains() {
		return domains;
	}
	
	public static class Builder {
		private String nestedCategoryName;
		private String[] nestedDomains;
		
		public Builder categoryName(final String newCategoryName) {
			this.nestedCategoryName = newCategoryName;
			return this;
		}
		
		public Builder domains(final String[] newDomains) {
			this.nestedDomains = newDomains;
			return this;
		}
		
		public AccessCategoryImpl build() {
			return new AccessCategoryImpl(
				nestedCategoryName,
				nestedDomains
			);
		}
	}

}
