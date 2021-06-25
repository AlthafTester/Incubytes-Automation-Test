package com.composemail.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.composemail.pom.Message_Compose;
import com.composemail.pom.Password_Page;
import com.composemail.pom.Sign_In_page;

public class Page_Object_Manager {

	public static WebDriver driver;
	
	
	
	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	
	private Sign_In_page signin;
	
	public Sign_In_page getInstance_SignIn() {

		signin = new Sign_In_page(driver);
		return signin;
	}
	
	private Password_Page password;
	
	public Password_Page getInstance_Password() {

		
		password = new Password_Page(driver);
		return password;
	}
	
	private Message_Compose mail;
	
	public Message_Compose getInstance_Mail() {

		mail = new Message_Compose(driver);
		return mail;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
