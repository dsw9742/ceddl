package com.douglaswhitehead.model.digitaldata.common;

/**
 * This object provides extensibility to any object as a whole. Any additional dimensions related to
 * the object. All names are optional and should fit the individual implementation needs in both naming 
 * and values passed.
 */
public class AttributesImpl extends Base implements Attributes {

	private AttributesImpl(
		
	) {
		
	}
	
	public static class Builder extends Base.Builder {
		
		public AttributesImpl build() {
			return new AttributesImpl(
				
			);
		}
		
	}
	
}