package com.contentualize.model.ceddl.web.page;

/**
 * This object provides extensibility to the Page object. All names are optional and should fit the 
 * individual implementation needs in both naming and values passed.
 */
public class CeddlWebPageAttributesImpl implements CeddlWebPageAttributes {

	private CeddlWebPageAttributesImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public CeddlWebPageAttributesImpl build() {
			return new CeddlWebPageAttributesImpl(
				
			);
		}
		
	}
	
}