package com.composemail.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.composemail.baseclass.Base_Class;
import com.composemail.helper.File_Reader_Manager;
import com.composemail.helper.Page_Object_Manager;
import com.composemail.testrunner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;
	public Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^: user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		geturl(File_Reader_Manager.getInstance().getInstancrCR().getUrl());
	}

	@When("^: user Enter The Valid Mailid In The Email Id Text Box$")
	public void user_Enter_The_Valid_Mailid_In_The_Email_Id_Text_Box() throws Throwable {
		sendValues(pom.getInstance_SignIn().getEmail(), File_Reader_Manager.getInstance().getInstancrCR().getEmailId());
	}

	@Then("^: user Click On The Next Button  And It Navigate To The Password Page$")
	public void user_Click_On_The_Next_Button_And_It_Navigate_To_The_Password_Page() throws Throwable {
		clickOnElement(pom.getInstance_SignIn().getNext());
	}

	@When("^: user Enter The Valid Password Id In The Password Text Box$")
	public void user_Enter_The_Valid_Password_Id_In_The_Password_Text_Box() throws Throwable {
		sleep(5000);
		sendValues(pom.getInstance_Password().getPassword(),
				File_Reader_Manager.getInstance().getInstancrCR().getPassword());

	}

	@Then("^: user Click On The Next Button  And It Navigate To The User Mail Inbox  Page$")
	public void user_Click_On_The_Next_Button_And_It_Navigate_To_The_User_Mail_Inbox_Page() throws Throwable {
		sleep(3000);
		clickOnElement(pom.getInstance_Password().getNext());

	}

	@When("^: user Click On The Compose Button And Compose Dialog Box Appears$")
	public void user_Click_On_The_Compose_Button_And_Compose_Dialog_Box_Appears() throws Throwable {
		sleep(5000);
		clickOnElement(pom.getInstance_Mail().getCompose());

	}

	@When("^: user Enter The Recipient Mail Id In The To Text Box$")
	public void user_Enter_The_Recipient_Mail_Id_In_The_To_Text_Box() throws Throwable {
		sleep(5000);
		sendValues(pom.getInstance_Mail().getRecipientmailid(), "  nextstepassociate@gmail.com");
	}

	@When("^: user Enter The Subject Of The Mail In The Subject Field$")
	public void user_Enter_The_Subject_Of_The_Mail_In_The_Subject_Field() throws Throwable {
		sendValues(pom.getInstance_Mail().getSubject(), "  Incubyte");
	}

	@When("^: user Compose The Body Of The Mail In The Mail Body Field$")
	public void user_Compose_The_Body_Of_The_Mail_In_The_Mail_Body_Field() throws Throwable {
		sendValues(pom.getInstance_Mail().getMailbody(), "Hi Its Mohammed Althaf Automation QA test for Incubyte");
	}

	@Then("^: user Click On The Send Button And It Sent The Mail\\.$")
	public void user_Click_On_The_Send_Button_And_It_Sent_The_Mail() throws Throwable {
		clickOnElement(pom.getInstance_Mail().getSendbutton());
	}

}
