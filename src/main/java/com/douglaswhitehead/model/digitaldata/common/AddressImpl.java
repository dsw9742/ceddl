package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Basic implementation of the Attributes interface.
 */
public class AddressImpl extends BaseImpl implements Address {

	/**
	 * String constant for {@code line1 }
	 */
	private static final String LINE_1 = "line1";
	
	/**
	 * String constant for {@code line2 }
	 */
	private static final String LINE_2 = "line2";
	
	/**
	 * String constant for {@code city }
	 */
	private static final String CITY = "city";
	
	/**
	 * String constant for {@code stateProvince }
	 */
	private static final String STATE_PROVINCE = "stateProvince";
	
	/**
	 * String constant for {@code postalCode }
	 */
	private static final String POSTAL_CODE = "postalCode";
	
	/**
	 * String constant for {@code country }
	 */
	private static final String COUNTRY = "country";
	
	/**
	 * AddressImpl constructor.
	 * 
	 * @param Security security
	 * @param String line1
	 * @param String line2
	 * @param String city
	 * @param String stateProvince
	 * @param String postalCode
	 * @param String country
	 */
	private AddressImpl(
		final Security security,
		final String line1,
		final String line2,
		final String city,
		final String stateProvince,
		final String postalCode,
		final String country
	) {
		this.security = security;
		this.map.put(LINE_1, line1);
		this.map.put(LINE_2, line2);
		this.map.put(CITY, city);
		this.map.put(STATE_PROVINCE, stateProvince);
		this.map.put(POSTAL_CODE, postalCode);
		this.map.put(COUNTRY, country);
	}
	
	/**
	 * Returns the Line1 object.
	 * 
	 * @return String
	 */
	@Override
	public String getLine1() {
		return (String)map.get(LINE_1);
	}
	
	/**
	 * Returns the Line2 object.
	 * 
	 * @return String
	 */
	@Override
	public String getLine2() {
		return (String)map.get(LINE_2);
	}
	
	/**
	 * Returns the City object.
	 * 
	 * @return String
	 */
	@Override
	public String getCity() {
		return (String)map.get(CITY);
	}
	
	/**
	 * Returns the StateProvince object.
	 * 
	 * @return String
	 */
	@Override
	public String getStateProvince() {
		return (String)map.get(STATE_PROVINCE);
	}
	
	/**
	 * Returns the PostalCode object.
	 * 
	 * @return String
	 */
	@Override
	public String getPostalCode() {
		return (String)map.get(POSTAL_CODE);
	}
	
	/**
	 * Returns the Country object.
	 * 
	 * @return String
	 */
	@Override
	public String getCountry() {
		return (String)map.get(COUNTRY);
	}
	
	/**
	 * Implementation of Address.Builder interface.
	 * 
	 * @author douglas.whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Address.Builder {
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder self() {
			return this;
		}
		
		/**
		 * Builds the Line1 object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder line1(final String line1) {
			this.map.put(LINE_1, line1);
			this.previous = LINE_1;
			return this;
		}
		
		/**
		 * Builds the Line2 object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder line2(final String line2) {
			this.map.put(LINE_2, line2);
			this.previous = LINE_2;
			return this;
		}
		
		/**
		 * Builds the City object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder city(final String city) {
			this.map.put(CITY, city);
			this.previous = CITY;
			return this;
		}
		
		/**
		 * Builds the StateProvince object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder stateProvince(final String stateProvince) {
			this.map.put(STATE_PROVINCE, stateProvince);
			this.previous = STATE_PROVINCE;
			return this;
		}
		
		/**
		 * Builds the PostalCode object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder postalCode(final String postalCode) {
			this.map.put(POSTAL_CODE, postalCode);
			this.previous = POSTAL_CODE;
			return this;
		}
		
		/**
		 * Builds the Country object.
		 * 
		 * @return Builder
		 */
		@Override
		public Builder country(final String country) {
			this.map.put(COUNTRY, country);
			this.previous = COUNTRY;
			return this;
		}
		
		/**
		 * Builds the AddressImpl object.
		 * 
		 * @return AddressImpl
		 */
		@Override
		public AddressImpl build() {
			return new AddressImpl(
				security,
				(String)map.get(LINE_1),
				(String)map.get(LINE_2),
				(String)map.get(CITY),
				(String)map.get(STATE_PROVINCE),
				(String)map.get(POSTAL_CODE),
				(String)map.get(COUNTRY)
			);
		}

	}
}