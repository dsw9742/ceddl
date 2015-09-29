package com.contentualize.model.ceddl.web.user;

/**
 * This object provides extensibility to the profile. 
 * 
 * All other names are optional and should fit the individual implementation needs in both naming 
 * and values passed.
 */
public class CeddlWebUserProfileAttributesImpl implements CeddlWebUserProfileAttributes {

	private CeddlWebUserProfileAttributesImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public CeddlWebUserProfileAttributesImpl build() {
			return new CeddlWebUserProfileAttributesImpl(
				
			);
		}
		
	}
	
}