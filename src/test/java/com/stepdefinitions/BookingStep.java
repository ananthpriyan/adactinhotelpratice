package com.stepdefinitions;

import com.baseclass.BaseClass;
import com.pagemaneger.PageManager;

import io.cucumber.java.en.*;

public class BookingStep extends BaseClass {
	
	
	PageManager p3=new PageManager();
	
	
	@When("User is on bookin page")
	public void userIsOnBookinPage() {
		
		//p3.getAdactinLoginPom();
		//p3.getAdactinSearchpage();
		
		
	}
	@Then("User should click on Radiobutton,continuebutton")
	public void userShouldClickOnRadiobuttonContinuebutton() {
		
		p3.getAdbookingpage().bookingPage();
		
		
		
	}
	@Then("User Should navigate to Booking Confirmation page")
	public void userShouldNavigateToBookingConfirmationPage() {
		
		
		
	}

	

}
