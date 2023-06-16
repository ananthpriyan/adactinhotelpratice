package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class AdBookConfirmpagePom extends BaseClass {
	
	public AdBookConfirmpagePom() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditcardnum;
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	@FindBy(id="cc_exp_month")
	private WebElement creditexpmonth;
	@FindBy(id="cc_exp_year")
	private WebElement creditexpyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	
	
	
	
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcardnum() {
		return creditcardnum;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getCreditexpmonth() {
		return creditexpmonth;
	}
	public WebElement getCreditexpyear() {
		return creditexpyear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	
	
	
	public void confirmationPage(String fname,String lname,String add,String ccnum,String cctype,String ccexpmonth,String ccexpyear,String cvv) {
		
		sendKeys(getFirstname(), fname);
		sendKeys(getLastname(), lname);
		sendKeys(getAddress(), add);
		sendKeys(getCreditcardnum(), ccnum);
		selectByVisibleText(getCreditcardtype(), cctype);
		selectByVisibleText(getCreditexpmonth(), ccexpmonth);
		selectByVisibleText(getCreditexpyear(), ccexpyear);
		sendKeys(getCvvnum(), cvv);

	}
	
	
	
	

}
