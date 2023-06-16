package com.baseclass;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserConfig() {
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		
	}

	
	public static void openUrl(String url) {
		driver.get(url);

	}

	public static void maximizeBrowser() {

		driver.manage().window().maximize();

	}


	
	public void sendKeys(WebElement element, String strings) {

		element.sendKeys(strings);

	}

	public void clickElement(WebElement element) {

		element.click();

	}
	
	public void selectByVisibleText(WebElement element, String text) {
		Select sl=new Select(element);
		sl.selectByVisibleText(text);

	}
	
	public void clearTextBox(WebElement element) {
		
		element.clear();

	}
	
	public static String getSqlData(String query, String user) throws ClassNotFoundException, SQLException {
              
		String name=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "test1234");
		//String s = "select * from employees";
		PreparedStatement statement = connection.prepareStatement(query);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
				name = rs.getString(user);
		}
		connection.close();
		return name;

	}

}
