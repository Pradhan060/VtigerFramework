package com_Object_Bank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingNewOrganizationPageWebElement {
	@FindBy(name="accountname")
	private WebElement OrganizationName;
	@FindBy(xpath="(//input[@value='  Save  '])[1]")
	private WebElement TopSaveBtn;
	@FindBy(xpath="(//input[@value='  Save  '])[2]")
	private WebElement BottomSaveBtn;
	@FindBy(xpath="//input[@value='Cancel  ']")
	private WebElement TopCancelBtn;
	@FindBy(xpath="//input[@value='  Cancel  ']")
	private WebElement BottomCancelBtn;
	@FindBy(xpath="//input[@name='account_name']/../img[1]")
	private WebElement MemberOfPlusSign;
	@FindBy(name="rating")
	private WebElement Rating;
	@FindBy(name="website")
	private WebElement Website;
	@FindBy(id="phone")
	private WebElement Phone;
	@FindBy(id="tickersymbol")
	private WebElement TickerSymbol;
	@FindBy(id="fax")
	private WebElement Fax;
	@FindBy(id="otherphone")
	private WebElement OtherPhone;
	@FindBy(name="account_name")
	private WebElement MemberOf;
	@FindBy(xpath="//input[@title='Clear']")
	private WebElement MemberOfClear;
	@FindBy(id="employees")
	private WebElement Employees;
	@FindBy(id="email1")
	private WebElement Email;
	@FindBy(id="email2")
	private WebElement OtherEmail;
	@FindBy(id="ownership")
	private WebElement Ownership;
	@FindBy(name="industry")
	private WebElement Industry;
	@FindBy(name="accounttype")
	private WebElement Type;
	@FindBy(id="siccode")
	private WebElement SICCode;
	@FindBy(name="emailoptout")
	private WebElement EmailOptOut;
	@FindBy(name="annual_revenue")
	private WebElement AnnualRevenue;
	@FindBy(name="notify_owner")
	private WebElement NotifyOwner;
	@FindBy(xpath="//input[@value='U']")
	private WebElement AssignedToUserRadioBtn;
	@FindBy(xpath="//input[@value='T']")
	private WebElement AssignedToGroupRadioBtn;
	@FindBy(name="assigned_group_id")
	private WebElement AssignedToGroupLstBox;
	@FindBy(name="assigned_user_id")
	private WebElement AssignedToUserLstBox;
	@FindBy(xpath="//b[text()='Copy Shipping address']/preceding-sibling::input")
	private WebElement CopyShippingaddress;
	@FindBy(xpath="//b[text()='CopyBillingaddress']/preceding-sibling::input")
	private WebElement CopyBillingaddress;
	@FindBy(name="bill_street")
	private WebElement BillingAddress;
	@FindBy(name="ship_street")
	private WebElement ShippingAddress;
	@FindBy(id="bill_pobox")
	private WebElement BillingPOBox;
	@FindBy(id="ship_pobox")
	private WebElement ShippingPOBox;
	@FindBy(id="bill_city")
	private WebElement BillingCity;
	@FindBy(id="ship_city")
	private WebElement ShippingCity;
	@FindBy(id="bill_state")
	private WebElement BillingState;
	@FindBy(id="ship_state")
	private WebElement ShippingState;
	@FindBy(id="bill_code")
	private WebElement BillingPostalCode;
	@FindBy(id="ship_code")
	private WebElement ShippingPostalCode;
	@FindBy(id="bill_country")
	private WebElement BillingCountry;
	@FindBy(id="ship_country")
	private WebElement ShippingCountry;
	@FindBy(name="description")
	private WebElement Description;
	
	
	
	public WebElement getDescription() 
	{
		return Description;
	}
	public WebElement getShippingCountry() 
	{
		return ShippingCountry;
	}
	public WebElement getBillingCountry() 
	{
		return BillingCountry;
	}
	public WebElement getShippingPostalCode() 
	{
		return ShippingPostalCode;
	}
	public WebElement getBillingPostalCode() 
	{
		return BillingPostalCode;
	}
	public WebElement getShippingState() 
	{
		return ShippingState;
	}
	public WebElement getBillingState() 
	{
		return BillingState;
	}
	public WebElement getShippingCity() 
	{
		return ShippingCity;
	}
	public WebElement getBillingCity() 
	{
		return BillingCity;
	}
	public WebElement getShippingPOBox() 
	{
		return ShippingPOBox;
	}
	public WebElement getBillingPOBox() 
	{
		return BillingPOBox;
	}
	public WebElement getShippingAddress() 
	{
		return ShippingAddress;
	}
	public WebElement getBillingAddress() 
	{
		return BillingAddress;
	}
	public WebElement getCopyBillingaddress() 
	{
		return CopyBillingaddress;
	}
	public WebElement getCopyShippingaddress() 
	{
		return CopyShippingaddress;
	}
	public WebElement getAssignedToUserLstBox() 
	{
		return AssignedToUserLstBox;
	}
	public WebElement getAssignedToGroupLstBox() 
	{
		return AssignedToGroupLstBox;
	}
	public WebElement getAssignedToGroupRadioBtn() 
	{
		return AssignedToGroupRadioBtn;
	}
	public WebElement getAssignedToUserRadioBtn() 
	{
		return AssignedToUserRadioBtn;
	}
	public WebElement getNotifyOwner() 
	{
		return NotifyOwner;
	}
	public WebElement getAnnualRevenue() 
	{
		return AnnualRevenue;
	}
	public WebElement getEmailOptOut() 
	{
		return EmailOptOut;
	}
	public WebElement getSICCode() 
	{
		return SICCode;
	}
	public WebElement getType() 
	{
		return Type;
	}
	public WebElement getIndustry() 
	{
		return Industry;
	}
	public WebElement getOwnership() 
	{
		return Ownership;
	}
	public WebElement getOtherEmail() 
	{
		return OtherEmail;
	}
	public WebElement getEmail() 
	{
		return Email;
	}
	public WebElement getEmployees() 
	{
		return Employees;
	}
	public WebElement getMemberOfClear() 
	{
		return MemberOfClear;
	}
	public WebElement getMemberOf() 
	{
		return MemberOf;
	}
	public WebElement getOtherPhone() 
	{
		return OtherPhone;
	}
	public WebElement getFax() 
	{
		return Fax;
	}
	public WebElement getTickerSymbol() 
	{
		return TickerSymbol;
	}
	public WebElement getPhone() 
	{
		return Phone;
	}
	public WebElement getWebsite() 
	{
		return Website;
	}
	public WebElement getOrganizationName() 
	{
		return OrganizationName;
	}
	public WebElement getTopSaveBtn()
	{
		return TopSaveBtn;
	}
	public WebElement getBottomSaveBtn()
	{
		return BottomSaveBtn;
	}
	public WebElement getTopCancelBtn()
	{
		return TopCancelBtn;
	}
	public WebElement getBottomCancelBtn()
	{
		return BottomCancelBtn;
	}
	public WebElement getMemberOfPlusSign()
	{
		return MemberOfPlusSign;
	}
	public WebElement getRating()
	{
		return Rating;
	}
	
}
