package com.contentualize.model.ceddl.web.page;

import org.joda.time.Instant;

public interface CeddlWebPageInfo {

	public String getPageId();
	public String getPageName();
	public String getDestinationURL();
	public String getReferringURL();
	public String getSysEnv();
	public String getVariant();
	public String getVersion();
	public String[] getBreadcrumbs();
	public String getAuthor();
	public Instant getIssueDate();
	public Instant getEffectiveDate();
	public Instant getExpiryDate();
	public String getLanguage();
	public String getGeoRegion();
	public String getIndustryCodes();
	public String getPublisher();
	public String getOnsiteSearchTerm();
	public long getOnsiteSearchResults();
	
	public static interface Builder {
		
		public Builder pageId();
		public Builder pageName();
		public Builder destinationURL();
		public Builder referringURL();
		public Builder sysEnv();
		public Builder variant();
		public Builder version();
		public Builder breadcrumbs();
		public Builder author();
		public Builder issueDate();
		public Builder effectiveDate();
		public Builder expiryDate();
		public Builder language();
		public Builder geoRegion();
		public Builder industryCodes();
		public Builder publisher();
		public Builder onsiteSearchTerm();
		public Builder onsiteSearchResults();
		
		public CeddlWebPageInfo build();
		
	}
	
}
