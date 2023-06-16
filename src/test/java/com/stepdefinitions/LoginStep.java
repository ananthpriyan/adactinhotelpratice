package com.stepdefinitions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.baseclass.BaseClass;
import com.pagemaneger.PageManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {

	PageManager pom = new PageManager();

	@When("User is on login page")
	public void userIsOnLoginPage() {
		
		browserConfig();
		//getChrome();
		openUrl("https://adactinhotelapp.com/index.php");
		
	}
	@Then("User should perform login {string},{string}")
	public void userShouldPerformLogin(String user, String pass) {
		pom.getAdactinLoginPom().login(user, pass);
	}

	
	@When("click on login button")
	public void clickOnLoginButton() {

		
	}

	@Then("User Should verify the success message after login {string}")
	public void userShouldVerifyTheSuccessMessageAfterLogin(String string) {
		
     
	}
	
	@Then("User should perform login")
	public void userShouldPerformLogin() throws ClassNotFoundException, SQLException {
		
	
//	Class.forName("oracle.jdbc.driver.OracleDriver");
//	
//	//2. Connect to the DataBase
//	
//	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "test1234");
//	
//	//3. Write the sql  query
//	
//	String s = "select * from employees";
//	
//	//4. Prepare the statement
//	
//	PreparedStatement statement = connection.prepareStatement(s);
//	
//	//5.Execute the query
//	
//	ResultSet rs = statement.executeQuery();
//	
//	//6. Iterate the result
//	int columnCount = rs.getMetaData().getColumnCount();
//	System.out.println("c:"+columnCount);
//	rs.last();
//	int rowcount = rs.getRow();
//	System.out.println("R:"+rowcount);
//	
//	String[][] result=new String[rowcount][columnCount];
//	
//	int i=0;
//	while (rs.next()) {
//		
//		for (int j = 0; j < columnCount; j++) {
//			
//			result[i][j] = rs.getString(j+1);
//			
//		}
//		i=i+1;
//		
//	}
//		System.out.println(result);
			//rs.getMetaData().getColumnTypeName("FIRST_NAME");
			//String name = rs.getString("first_name");
			//String pass = rs.getString("last_name");
	    sendKeys(pom.getAdactinLoginPom().getTxtUser(),getSqlData("select first_name from employees where first_name='Steven'", "first_name"));
	    sendKeys(pom.getAdactinLoginPom().getTxtPass(),getSqlData("select last_name from employees where last_name='Holend'", "last_name"));
		clickElement(pom.getAdactinLoginPom().getbtnLogin());
	
	
	



	}

}
