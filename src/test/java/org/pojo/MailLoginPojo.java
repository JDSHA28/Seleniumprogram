package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.org.BaseClass;

public class MailLoginPojo extends BaseClass {
public MailLoginPojo() {
PageFactory.initElements(driver, this);	
}
@FindBy(id="identifierId")
private WebElement email;
@FindBy(xpath = "//span[text()='Next']")
private WebElement next;
@FindBy(name="Passwd")
private WebElement password;
@FindBy(xpath="//span[text()='Next']")
private WebElement next1;

public WebElement getEmail() {
	return email;
}
public WebElement getNext() {
	return next;
}
public WebElement getPassword() {
	return password;
}
public WebElement getNext1() {
	return next1;
}
}
