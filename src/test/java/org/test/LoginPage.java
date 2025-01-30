package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	
@FindBy(id="email")
private WebElement txtUsername;

@FindBy(id="pass")
private WebElement txtpassword;

@FindBy(name="login")
private WebElement btnLogin;

@FindBy(xpath="(//a[@role=\"button\"])[2]")
private WebElement createbtn;

public WebElement getTxtUsername() {
	return txtUsername;
}

public WebElement getTxtpassword() {
	return txtpassword;
}

public WebElement getBtnLogin() {
	return btnLogin;	
}

public WebElement getCreatebtn() {
	return createbtn;
}


}
