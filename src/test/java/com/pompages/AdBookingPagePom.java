package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class AdBookingPagePom extends BaseClass {
	
	
	public AdBookingPagePom() {
		
		PageFactory.initElements(driver, this);

	}
	
	
	
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radiobtn;
	@FindBy(css="input[type=submit]")
	private WebElement continuebtn;
	
	
	
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
	
	public void bookingPage() {
		
		clickElement(getRadiobtn());
		clickElement(getContinuebtn());

	}
	
	
	
	
	
	
	
	
	

}
