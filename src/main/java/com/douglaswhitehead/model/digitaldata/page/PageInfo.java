package com.douglaswhitehead.model.digitaldata.page;

public interface PageInfo {
	public Object getPageId();
	public Object getPageName();
	public Object getDestinationURL();
	public Object getReferringURL();
	public Object getSysEnv();
	public Object getVariant();
	public Object getVersion();
	public Object getBreadcrumbs();
	public Object getAuthor();
	public Object getIssueDate();
	public Object getEffectiveDate();
	public Object getExpiryDate();
	public Object getLanguage();
	public Object getGeoRegion();
	public Object getIndustryCodes();
	public Object getPublisher();
	public Object getOnsiteSearchTerm();
	public Object getOnsiteSearchResults();
	
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
