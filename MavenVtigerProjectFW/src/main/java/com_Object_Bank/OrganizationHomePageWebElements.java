package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationHomePageWebElements {
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrganization;
	@FindBy(linkText="Go to Advanced Search")
	private WebElement GotoAdvancedSearch;
	@FindBy(linkText="Go to Basic Search")
	private WebElement GotoBasicSearch;
	@FindBy(name="search_text")
	private WebElement Searchfor;
	@FindBy(xpath="(//select[@id='bas_searchfield'])[1]")
	private WebElement In;
	@FindBy(name="submit")
	private WebElement SearchNow;
	@FindBy(id="viewname")
	private WebElement Filters;
	@FindBy(linkText="Create Filter")
	private WebElement CreateFilter;
	@FindBy(linkText="Edit")
	private WebElement EditFilter;
	@FindBy(linkText="Delete")
	private WebElement DeleteFilter;
	
	
	
	public WebElement getDeleteFilter()
	{
		return DeleteFilter;
	}
	public WebElement getEditFilter()
	{
		return EditFilter;
	}
	public WebElement getCreateFilter()
	{
		return CreateFilter;
	}
	public WebElement getFilters()
	{
		return Filters;
	}
	public WebElement getSearchNow()
	{
		return SearchNow;
	}
	public WebElement getIn()
	{
		return In;
	}
	public WebElement getSearchfor()
	{
		return Searchfor;
	}
	public WebElement getGotoBasicSearch()
	{
		return GotoBasicSearch;
	}
	public WebElement getGotoAdvancedSearch()
	{
		return GotoAdvancedSearch;
	}
	public WebElement getcreateOrganization()
	{
		return createOrganization;
	}
}
