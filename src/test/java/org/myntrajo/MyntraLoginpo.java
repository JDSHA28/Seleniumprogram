package org.myntrajo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.org.BaseClass;

public class MyntraLoginpo extends BaseClass {
public MyntraLoginpo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@data-reactid='856']")
private WebElement profile;
@FindBy(xpath="//a[@data-track='login']")
private WebElement signin;
@FindBy(xpath="//input[@autocomplete='new-password']")
private WebElement phonenumber;
@FindBy(xpath="//div[text()='CONTINUE']")
private WebElement submit;
public WebElement getProfile() {
	return profile;
}
public WebElement getSignin() {
	return signin;
}
public WebElement getPhonenumber() {
	return phonenumber;
}
public WebElement getSubmit() {
	return submit;
}

}
