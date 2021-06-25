package com.composemail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message_Compose {

	public static WebDriver driver;

	public Message_Compose(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//a[@accesskey = 'c']")
	private WebElement compose;

	public WebElement getCompose() {
		return compose;
	}

	@FindBy(xpath = "//textarea[@name = 'to']")
	private WebElement recipientmailid;

	public WebElement getRecipientmailid() {
		return recipientmailid;
	}

	@FindBy(xpath = "//input[@name = 'subject']")
	private WebElement subject;

	public WebElement getSubject() {
		return subject;
	}

	@FindBy(xpath = "(//textarea[@name= 'body'])")
	private WebElement mailbody;

	public WebElement getMailbody() {
		return mailbody;
	}

	@FindBy(xpath = "(//input[@value= 'Send'])[2]")
	private WebElement sendbutton;

	public WebElement getSendbutton() {
		return sendbutton;
	}

}
