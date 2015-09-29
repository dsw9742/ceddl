package com.douglaswhitehead.model.ceddl.web.product;

/**
 * This object provides extensibility to the Product object. Any additional dimensions related to the 
 * product can be provided. All names are optional and should fit the individual implementation
 * needs in both naming and values passed.
 */
public class CeddlWebProductAttributesImpl implements CeddlWebProductAttributes {

	private CeddlWebProductAttributesImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public CeddlWebProductAttributesImpl build() {
			return new CeddlWebProductAttributesImpl(
				
			);
		}
		
	}
	
}