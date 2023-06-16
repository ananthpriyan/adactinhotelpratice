package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class AdactinLoginPom extends BaseClass {
	 
	public AdactinLoginPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUser;
	@FindBy(id="password")
	private WebElement txtPass;
    @FindBy (name="login")
	private WebElement btnlogin;
   
	
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getbtnLogin() {
		return btnlogin;
	}
	
	public void login(String user,String pass) {

		sendKeys(getTxtUser(), user);
		sendKeys(getTxtPass(), pass);
		clickElement(getbtnLogin());
	}
	
	
}
