package com.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private List<WebElement> username;
	@FindBy(name = "password")
	private List<WebElement> password;
	@FindBy(id = "login")
	private List<WebElement> btnLogin;

	public List<WebElement> getUsername() {
		return username;
	}

	public List<WebElement> getPassword() {
		return password;
	}

	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}
}