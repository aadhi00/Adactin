package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private List<WebElement> radio;
	@FindBy(id = "continue")
	private List<WebElement> confirm;

	public List<WebElement> getRadio() {
		return radio;
	}

	public List<WebElement> getConfirm() {
		return confirm;
	}

}
