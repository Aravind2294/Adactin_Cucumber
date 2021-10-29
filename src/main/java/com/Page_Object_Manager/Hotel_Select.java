package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Select {

	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement select_hotel;

	@FindBy(id = "continue")
	private WebElement continuebtn;

	public Hotel_Select(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect_hotel() {
		return select_hotel;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
