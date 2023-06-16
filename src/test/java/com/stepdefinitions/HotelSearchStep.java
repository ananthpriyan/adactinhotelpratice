package com.stepdefinitions;

import com.baseclass.BaseClass;
import com.pagemaneger.PageManager;

import io.cucumber.java.en.*;

public class HotelSearchStep extends BaseClass {
	
	
	PageManager p2= new PageManager();
	
	
	@Then("User is on hotel search page")
	public void userIsOnHotelSearchPage() {

		//p2.getAdactinLoginPom();
		
	}
	@Then("User should perfom {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldPerfom(String loca, String hotel ,String roomtype,String Rnum,String datein,String dateout, String ad,String ch) {
	     p2.getAdactinSearchpage().hotelSearch(loca,hotel,roomtype,Rnum,datein,dateout,ad,ch);
		
	}
	@Then("User click on search button")
	public void userClickOnSearchButton() {
	
	}
	@Then("User should verify success message after search button\"Select hotel\"")
	public void userShouldVerifySuccessMessageAfterSearchButtonSelectHotel() {
	
	}

	

}
