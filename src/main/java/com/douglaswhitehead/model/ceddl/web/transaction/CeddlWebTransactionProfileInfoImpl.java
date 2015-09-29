package com.douglaswhitehead.model.ceddl.web.transaction;

/**
 * A profile for information about the purchaser, typically associated with a registered user.
 */
public class CeddlWebTransactionProfileInfoImpl implements CeddlWebTransactionProfileInfo {

	private final String profileID;
	private final String userName;
	private final String email;
	
	private CeddlWebTransactionProfileInfoImpl(
		final String newProfileID,
		final String newUserName,
		final String newEmail
	) {
		this.profileID = newProfileID;
		this.userName = newUserName;
		this.email = newEmail;
	}
	
	public String getProfileID() {
		return profileID;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public static class Builder {
		private String nestedProfileID;
		private String nestedUserName;
		private String nestedEmail;
		
		public Builder profileInfo(final String newProfileID) {
			this.nestedProfileID = newProfileID;
			return this;
		}
		
		public Builder userName(final String newUserName) {
			this.nestedUserName = newUserName;
			return this;
		}
		
		public Builder email(final String newEmail) {
			this.nestedEmail = newEmail;
			return this;
		}
		
		public CeddlWebTransactionProfileInfoImpl build() {
			return new CeddlWebTransactionProfileInfoImpl(
				nestedProfileID,
				nestedUserName,
				nestedEmail
			);
		}
	}
}
