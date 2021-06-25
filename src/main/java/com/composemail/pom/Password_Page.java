package com.composemail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password_Page {

	public static WebDriver driver;

	public Password_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "(//span[@jsname = 'V67aGc'])[1]")
	private WebElement next;

	public WebElement getNext() {
		return next;
	}
	@FindBy(xpath = "(//*[local-name() = 'svg'])[7]")
    private WebElement dotbutton;

	public WebElement getDotbutton() {
		return dotbutton;
	}
	
	@FindBy(xpath = "(//span[@class = 'MrEfLc'])[6]")
	private WebElement mailbutton;

	public WebElement getMailbutton() {
		return mailbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
