package com.douglaswhitehead.model.digitaldata.page;

import java.util.Date;

/**
 * Describes details about the page.
 */
public class CeddlWebPageInfoImpl implements CeddlWebPageInfo {
	
	private final String pageId;
	private final String pageName;
	private final String destinationURL;
	private final String referringURL;
	private final String sysEnv;
	private final String variant;
	private final String version;
	private final String[] breadcrumbs;
	private final String author;
	private final Date issueDate;
	private final Date effectiveDate;
	private final Date expiryDate;
	private final String language;
	private final String geoRegion;
	private final String industryCodes;
	private final String publisher;
	private final String onsiteSearchTerm;
	private final long onsiteSearchResults;
	
	private CeddlWebPageInfoImpl(
		final String newPageId,
		final String newPageName,
		final String newDestinationURL,
		final String newReferringURL,
		final String newSysEnv,
		final String newVariant,
		final String newVersion,
		final String[] newBreadcrumbs,
		final String newAuthor,
		final Date newIssueDate,
		final Date newEffectiveDate,
		final Date newExpiryDate,
		final String newLanguage,
		final String newGeoRegion,
		final String newIndustryCodes,
		final String newPublisher,
		final String newOnsiteSearchTerm,
		final long newOnsiteSearchResults
		) {
		this.pageId = newPageId;
		this.pageName = newPageName;
		this.destinationURL = newDestinationURL;
		this.referringURL = newReferringURL;
		this.sysEnv = newSysEnv;
		this.variant = newVariant;
		this.version = newVersion;
		this.breadcrumbs = newBreadcrumbs;
		this.author = newAuthor;
		this.issueDate = newIssueDate;
		this.effectiveDate = newEffectiveDate;
		this.expiryDate = newExpiryDate;
		this.language = newLanguage;
		this.geoRegion = newGeoRegion;
		this.industryCodes = newIndustryCodes;
		this.publisher = newPublisher;
		this.onsiteSearchTerm = newOnsiteSearchTerm;
		this.onsiteSearchResults = newOnsiteSearchResults;
	}
	
	public String getPageId() {
		return this.pageId;
	}
	
	public String getPageName() {
		return this.pageName;
	}
	
	public String getDestinationURL() {
		return this.destinationURL;
	}
	
	public String getReferringURL() {
		return this.referringURL;
	}
	
	public String getSysEnv() {
		return this.sysEnv;
	}
	
	public String getVariant() {
		return this.variant;
	}
	
	public String getVersion() {
		return this.version;
	}
	
	public String[] getBreadcrumbs() {
		return this.breadcrumbs;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public Date getIssueDate() {
		return this.issueDate;
	}
	
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}
	
	public Date getExpiryDate() {
		return this.expiryDate;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public String getGeoRegion() {
		return this.geoRegion;
	}
	
	public String getIndustryCodes() {
		return this.industryCodes;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public String getOnsiteSearchTerm() {
		return this.onsiteSearchTerm;
	}
	
	public long getOnsiteSearchResults() {
		return this.onsiteSearchResults;
	}
	
	public static class Builder {
		private String nestedPageId;
		private String nestedPageName;
		private String nestedDestinationURL;
		private String nestedReferringURL;
		private String nestedSysEnv;
		private String nestedVariant;
		private String nestedVersion;
		private String[] nestedBreadcrumbs;
		private String nestedAuthor;
		private Date nestedIssueDate;
		private Date nestedEffectiveDate;
		private Date nestedExpiryDate;
		private String nestedLanguage;
		private String nestedGeoRegion;
		private String nestedIndustryCodes;
		private String nestedPublisher;
		private String nestedOnsiteSearchTerm;
		private long nestedOnsiteSearchResults;
		
		public Builder pageId(final String newPageId) {
			this.nestedPageId = newPageId;
			return this;
		}
		
		public Builder pageName(final String newPageName) {
			this.nestedPageName = newPageName;
			return this;
		}
		
		public Builder destinationURL(final String newDestinationURL) {
			this.nestedDestinationURL = newDestinationURL;
			return this;
		}
		
		public Builder referringURL(final String newReferringURL) {
			this.nestedReferringURL = newReferringURL;
			return this;
		}
		
		public Builder sysEnv(final String newSysEnv) {
			this.nestedSysEnv = newSysEnv;
			return this;
		}
		
		public Builder variant(final String newVariant) {
			this.nestedVariant = newVariant;
			return this;
		}
		
		public Builder version(final String newVersion) {
			this.nestedVersion = newVersion;
			return this;
		}
		
		public Builder breadcrumbs(final String[] newBreadcrumbs) {
			this.nestedBreadcrumbs = newBreadcrumbs;
			return this;
		}
		
		public Builder author(final String newAuthor) {
			this.nestedAuthor = newAuthor;
			return this;
		}
		
		public Builder issueDate(final Date newIssueDate) {
			this.nestedIssueDate = newIssueDate;
			return this;
		}
		
		public Builder effectiveDate(final Date newEffectiveDate) {
			this.nestedEffectiveDate = newEffectiveDate;
			return this;
		}
		
		public Builder expiryDate(final Date newExpiryDate) {
			this.nestedExpiryDate = newExpiryDate;
			return this;
		}
		
		public Builder language(final String newLanguage) {
			this.nestedLanguage = newLanguage;
			return this;
		}
		
		public Builder geoRegion(final String newGeoRegion) {
			this.nestedGeoRegion = newGeoRegion;
			return this;
		}
		
		public Builder industryCodes(final String newIndustryCodes) {
			this.nestedIndustryCodes = newIndustryCodes;
			return this;
		}
		
		public Builder publisher(final String newPublisher) {
			this.nestedPublisher = newPublisher;
			return this;
		}
		
		public Builder onsiteSearchTerm(final String newOnsiteSearchTerm) {
			this.nestedOnsiteSearchTerm = newOnsiteSearchTerm;
			return this;
		}
		
		public Builder onsiteSearchResults(final int newOnsiteSearchResults) {
			this.nestedOnsiteSearchResults = newOnsiteSearchResults;
			return this;
		}
		
		public CeddlWebPageInfoImpl build() {
			return new CeddlWebPageInfoImpl(
				nestedPageId,
				nestedPageName,
				nestedDestinationURL,
				nestedReferringURL,
				nestedSysEnv,
				nestedVariant,
				nestedVersion,
				nestedBreadcrumbs,
				nestedAuthor,
				nestedIssueDate,
				nestedEffectiveDate,
				nestedExpiryDate,
				nestedLanguage,
				nestedGeoRegion,
				nestedIndustryCodes,
				nestedPublisher,
				nestedOnsiteSearchTerm,
				nestedOnsiteSearchResults
			);
		}
	}

}
