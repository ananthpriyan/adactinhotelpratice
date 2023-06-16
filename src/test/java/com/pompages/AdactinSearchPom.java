package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class AdactinSearchPom extends BaseClass {
	
	
	public AdactinSearchPom() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement rootype;
	@FindBy(id="room_nos")
	private WebElement numberofrooms;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adults;
	@FindBy(id="child_room")
	private WebElement childs;
	
	@FindBy(id="Submit")
	private WebElement searchbtn;
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRootype() {
		return rootype;
	}
	public WebElement getNumberofrooms() {
		return numberofrooms;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChilds() {
		return childs;
	}
	
	
	public void hotelSearch(String loca,String hotel,String roomtype,String Rnum,String datein,String dateout, String ad,String ch) {
		
		selectByVisibleText(getLocation(), loca);
		selectByVisibleText(getHotel(), hotel);
		selectByVisibleText(getRootype(), roomtype);
		sendKeys(getNumberofrooms(), Rnum);
		clearTextBox(getCheckin());
		sendKeys(getCheckin(), datein);
		clearTextBox(getCheckout());
		sendKeys(getCheckout(),dateout);
		selectByVisibleText(getAdults(), ad);
		selectByVisibleText(getChilds(), ch);
		clickElement(getSearchbtn());

	}
	
	
	
	
	
	
	

}
