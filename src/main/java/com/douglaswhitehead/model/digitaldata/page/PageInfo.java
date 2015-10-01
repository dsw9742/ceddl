package com.douglaswhitehead.model.digitaldata.page;

import java.util.Date;

public interface PageInfo {

	public String getPageId();
	public String getPageName();
	public String getDestinationURL();
	public String getReferringURL();
	public String getSysEnv();
	public String getVariant();
	public String getVersion();
	public String[] getBreadcrumbs();
	public String getAuthor();
	public Date getIssueDate();
	public Date getEffectiveDate();
	public Date getExpiryDate();
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
		
		public PageInfo build();
		
	}
	
}
