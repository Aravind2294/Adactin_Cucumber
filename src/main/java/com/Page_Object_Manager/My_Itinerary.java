package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Itinerary {

	public WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement my_itinerary;

	public My_Itinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}

}
