package com.composemail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_page {

	public static WebDriver driver;

	public Sign_In_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath = "(//span[@jsname='V67aGc'])[1]")
	private WebElement next;

	public WebElement getNext() {
		return next;
	}

}
