package com.douglaswhitehead.model.digitaldata.component;

/**
 * This object describes the component.
 */
public class ComponentInfoImpl implements ComponentInfo {
	private final String componentID;
	
	private ComponentInfoImpl(
		final String newComponentID
	) {
		this.componentID = newComponentID;
	}

	public String getComponentID() {
		return componentID;
	}
	
	public static class Builder {
		private String nestedComponentID;
		
		public Builder nestedComponentID(final String newComponentID) {
			this.nestedComponentID = newComponentID;
			return this;
		}
		
		public ComponentInfoImpl build() {
			return new ComponentInfoImpl(
				nestedComponentID
			);
		}
	}

}
