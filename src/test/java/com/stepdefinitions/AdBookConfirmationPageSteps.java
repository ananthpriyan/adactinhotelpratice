package com.stepdefinitions;

import com.pagemaneger.PageManager;

import io.cucumber.java.en.*;

public class AdBookConfirmationPageSteps  {
	
	PageManager p4=new PageManager();
	
	@When("User is on Booking confirmation page")
	public void userIsOnBookingConfirmationPage() {
	//	p4.getAdactinLoginPom();
		//p4.getAdactinSearchpage();
		//p4.getAdbookingpage();
	
	}
	@Then("User perform {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userPerform(String fname, String lname, String add, String ccnum, String cctype, String ccexpmonth, String ccexpyear, String cvv) {
	
	  p4.getAdbookconfirm().confirmationPage(fname, lname, add, ccnum, cctype, ccexpmonth, ccexpyear, cvv);
	
	}
	@Then("User should get confirmation message {string}")
	public void userShouldGetConfirmationMessage(String string) {
	
	
	
	}
	
	

}
