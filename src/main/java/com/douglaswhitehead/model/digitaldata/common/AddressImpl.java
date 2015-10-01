package com.douglaswhitehead.model.digitaldata.common;

/**
 * An extensible object for providing address information for the user.
 */
public class AddressImpl implements Address {

	private final String line1;
	private final String line2;
	private final String city;
	private final String stateProvince;
	private final String postalCode;
	private final String country;
	
	private AddressImpl(
		final String newLine1,
		final String newLine2,
		final String newCity,
		final String newStateProvince,
		final String newPostalCode,
		final String newCountry
	) {
		this.line1 = newLine1;
		this.line2 = newLine2;
		this.city = newCity;
		this.stateProvince = newStateProvince;
		this.postalCode = newPostalCode;
		this.country = newCountry;
	}
	
	public String getLine1() {
		return this.line1;
	}
	
	public String getLine2() {
		return this.line2;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getStateProvince() {
		return this.stateProvince;
	}
	
	public String getPostalCode() {
		return this.postalCode;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public static class Builder {
		private String nestedLine1;
		private String nestedLine2;
		private String nestedCity;
		private String nestedStateProvince;
		private String nestedPostalCode;
		private String nestedCountry;
		
		public Builder line1(final String newLine1) {
			this.nestedLine1 = newLine1;
			return this;
		}
		
		public Builder line2(final String newLine2) {
			this.nestedLine2 = newLine2;
			return this;
		}
		
		public Builder city(final String newCity) {
			this.nestedCity = newCity;
			return this;
		}
		
		public Builder stateProvince(final String newStateProvince) {
			this.nestedStateProvince = newStateProvince;
			return this;
		}
		
		public Builder postalCode(final String newPostalCode) {
			this.nestedPostalCode = newPostalCode;
			return this;
		}
		
		public Builder country(final String newCountry) {
			this.nestedCountry = newCountry;
			return this;
		}
		
		public AddressImpl build() {
			return new AddressImpl(
				nestedLine1,
				nestedLine2,
				nestedCity,
				nestedStateProvince,
				nestedPostalCode,
				nestedCountry
			);
		}
	}
}