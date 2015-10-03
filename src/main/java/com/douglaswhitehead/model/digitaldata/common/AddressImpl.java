package com.douglaswhitehead.model.digitaldata.common;

/**
 * An extensible object for providing address information for the user.
 */
public class AddressImpl extends Base implements Address {

	private static final String LINE_1 = "line1";
	private static final String LINE_2 = "line2";
	private static final String CITY = "city";
	private static final String STATE_PROVINCE = "stateProvince";
	private static final String POSTAL_CODE = "postalCode";
	private static final String COUNTRY = "country";
	
	private AddressImpl(
		final Object line1,
		final Object line2,
		final Object city,
		final Object stateProvince,
		final Object postalCode,
		final Object country
	) {
		this.map.put(LINE_1, line1);
		this.map.put(LINE_2, line2);
		this.map.put(CITY, city);
		this.map.put(STATE_PROVINCE, stateProvince);
		this.map.put(POSTAL_CODE, postalCode);
		this.map.put(COUNTRY, country);
	}
	
	public Object getLine1() {
		return map.get(LINE_1);
	}
	
	public Object getLine2() {
		return map.get(LINE_2);
	}
	
	public Object getCity() {
		return map.get(CITY);
	}
	
	public Object getStateProvince() {
		return map.get(STATE_PROVINCE);
	}
	
	public Object getPostalCode() {
		return map.get(POSTAL_CODE);
	}
	
	public Object getCountry() {
		return map.get(COUNTRY);
	}
	
	public static class Builder extends Base.Builder {
		
		public Builder line1(final String line1) {
			this.map.put(LINE_1, line1);
			this.previous = LINE_1;
			return this;
		}
		
		public Builder line2(final String line2) {
			this.map.put(LINE_2, line2);
			this.previous = LINE_2;
			return this;
		}
		
		public Builder city(final String city) {
			this.map.put(CITY, city);
			this.previous = CITY;
			return this;
		}
		
		public Builder stateProvince(final String stateProvince) {
			this.map.put(STATE_PROVINCE, stateProvince);
			this.previous = STATE_PROVINCE;
			return this;
		}
		
		public Builder postalCode(final String postalCode) {
			this.map.put(POSTAL_CODE, postalCode);
			this.previous = POSTAL_CODE;
			return this;
		}
		
		public Builder country(final String country) {
			this.map.put(COUNTRY, country);
			this.previous = COUNTRY;
			return this;
		}
		
		public AddressImpl build() {
			return new AddressImpl(
				map.get(LINE_1),
				map.get(LINE_2),
				map.get(CITY),
				map.get(STATE_PROVINCE),
				map.get(POSTAL_CODE),
				map.get(COUNTRY)
			);
		}
	}
}