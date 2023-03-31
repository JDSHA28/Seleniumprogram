package org.stepdefinition;

import org.pojo.MailLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import maven.org.BaseClass;

public class Mail extends BaseClass{
	MailLoginPojo m;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
	  launchBrowser();
	  windowmaximize();
	}

	@When("To launch the url of the gmail application")
	public void to_launch_the_url_of_the_gmail_application() {
	   launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S50683809%3A1679292589971671&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AWnogHduIsR5zKP0xMvbhSW72eBxESfL7_M-FLeDWxhC2EM5SKp6CpCUHkbslC4jbsb0SpFgNBvrOg&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}

	@When("To pass the valid username in the email field")
	public void to_pass_the_valid_username_in_the_email_field() {
		
	   m = new MailLoginPojo();
	   passText("jothimani628@gmail.com", m.getEmail());
	   clickbtn(m.getNext());
	   
	}

	@When("To pass the valid password in password field")
	public void to_pass_the_valid_password_in_password_field() throws InterruptedException {
		Thread.sleep(3000);
	  m = new MailLoginPojo();
	  passText("12345678", m.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	    m = new MailLoginPojo();
	    clickbtn(m.getNext1());
	}

	@When("To check whether navigate to the homepage or not")
	public void to_check_whether_navigate_to_the_homepage_or_not() {
	   System.out.println("Check the login credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	  //closeEntireBrowser();
	}




}
