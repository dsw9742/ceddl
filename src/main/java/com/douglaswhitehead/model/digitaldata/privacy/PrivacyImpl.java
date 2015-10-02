package com.douglaswhitehead.model.digitaldata.privacy;

/**
 * 6.10 Privacy Object
 * 
 * The Privacy object holds the privacy policy settings that could be used to:
 *   1. Capture and enforce site visitor consent to use tracking technologies on the site.
 *   2. Together with Security objects described below, secure access to individual objects
 *      within the JSO by categories of tracking technologies.
 */
public class PrivacyImpl implements Privacy {
	private final static AccessCategory DEFAULT_ACCESS_CATEGORY = new AccessCategoryImpl.Builder()
																		.categoryName("Default")
																		.domains(new String[]{"*"})
																	.build();
	
	private final AccessCategory[] accessCategories;
	
	private PrivacyImpl(
		final AccessCategory[] newAccessCategories
	) {
		this.accessCategories = newAccessCategories;
	}
	
	public AccessCategory[] getAccessCategories() {
		return accessCategories;
	}
	
	public static class Builder {
		private AccessCategory[] nestedAccessCategories = new AccessCategory[]{DEFAULT_ACCESS_CATEGORY};
		
		public Builder accessCategories(
			final AccessCategory[] newAccessCategories
		) {
			this.nestedAccessCategories = safeguardDefaultAccessCategory(newAccessCategories);
			return this;
		}
		
		public PrivacyImpl build() {
			return new PrivacyImpl(
				nestedAccessCategories
			);
		}
		
		private AccessCategory[] safeguardDefaultAccessCategory(final AccessCategory[] newAccessCategories) {
			newAccessCategories[newAccessCategories.length+1] = DEFAULT_ACCESS_CATEGORY;
			return newAccessCategories;
		}
		
	}
	

}
