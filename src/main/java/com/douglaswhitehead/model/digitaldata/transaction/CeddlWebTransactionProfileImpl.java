package com.douglaswhitehead.model.digitaldata.transaction;

import com.douglaswhitehead.model.digitaldata.common.Address;

/**
 * A profile for information about the purchaser, typically associated with a registered user.
 */
public class CeddlWebTransactionProfileImpl implements CeddlWebTransactionProfile {

	private final CeddlWebTransactionProfileInfo profileInfo;
	private final Address address;
	private final Address shippingAddress;
	
	private CeddlWebTransactionProfileImpl(
		final CeddlWebTransactionProfileInfo newProfileInfo,
		final Address newAddress,
		final Address newShippingAddress
	) {
		this.profileInfo = newProfileInfo;
		this.address = newAddress;
		this.shippingAddress = newShippingAddress;
	}
	
	public CeddlWebTransactionProfileInfo getProfileInfo() {
		return profileInfo;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public Address getShippingAddress() {
		return shippingAddress;
	}
	
	public static class Builder {
		private CeddlWebTransactionProfileInfo nestedProfileInfo;
		private Address nestedAddress;
		private Address nestedShippingAddress;
		
		public Builder profileInfo(final CeddlWebTransactionProfileInfo newProfileInfo) {
			this.nestedProfileInfo = newProfileInfo;
			return this;
		}
		
		public Builder address(final Address newAddress) {
			this.nestedAddress = newAddress;
			return this;
		}
		
		public Builder shippingAddress(final Address newShippingAddress) {
			this.nestedShippingAddress = newShippingAddress;
			return this;
		}
		
		public CeddlWebTransactionProfileImpl build() {
			return new CeddlWebTransactionProfileImpl(
				nestedProfileInfo,
				nestedAddress,
				nestedShippingAddress
			);
		}
	}
}
