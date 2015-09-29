package com.douglaswhitehead.model.ceddl.web.cart;

/**
 * This object provides extensibility to the cart as a whole. Any additional dimensions related to
 * the cart can be provided. All names are optional and should fit the individual implementation
 * needs in both naming and values passed.
 */
public class CeddlWebCartAttributesImpl implements CeddlWebCartAttributes {

	private CeddlWebCartAttributesImpl(
		
	) {
		
	}
	
	public static class Builder {
		
		public CeddlWebCartAttributesImpl build() {
			return new CeddlWebCartAttributesImpl(
				
			);
		}
		
	}
	
}