package com.douglaswhitehead.model.ceddl.web.transaction;

import com.douglaswhitehead.model.ceddl.web.CeddlWebProfileAddress;

/**
 * A profile for information about the purchaser, typically associated with a registered user.
 */
public class CeddlWebTransactionProfileImpl implements CeddlWebTransactionProfile {

	private final CeddlWebTransactionProfileInfo profileInfo;
	private final CeddlWebProfileAddress address;
	private final CeddlWebProfileAddress shippingAddress;
	
	private CeddlWebTransactionProfileImpl(
		final CeddlWebTransactionProfileInfo newProfileInfo,
		final CeddlWebProfileAddress newAddress,
		final CeddlWebProfileAddress newShippingAddress
	) {
		this.profileInfo = newProfileInfo;
		this.address = newAddress;
		this.shippingAddress = newShippingAddress;
	}
	
	public CeddlWebTransactionProfileInfo getProfileInfo() {
		return profileInfo;
	}
	
	public CeddlWebProfileAddress getAddress() {
		return address;
	}
	
	public CeddlWebProfileAddress getShippingAddress() {
		return shippingAddress;
	}
	
	public static class Builder {
		private CeddlWebTransactionProfileInfo nestedProfileInfo;
		private CeddlWebProfileAddress nestedAddress;
		private CeddlWebProfileAddress nestedShippingAddress;
		
		public Builder profileInfo(final CeddlWebTransactionProfileInfo newProfileInfo) {
			this.nestedProfileInfo = newProfileInfo;
			return this;
		}
		
		public Builder address(final CeddlWebProfileAddress newAddress) {
			this.nestedAddress = newAddress;
			return this;
		}
		
		public Builder shippingAddress(final CeddlWebProfileAddress newShippingAddress) {
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
