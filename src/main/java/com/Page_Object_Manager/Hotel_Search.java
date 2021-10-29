package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {

	public WebDriver driver;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(className = "search_combobox")
	private WebElement no_of_rooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement indate;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement outdate;

	@FindBy(id = "adult_room")
	private WebElement adult_room;

	@FindBy(id = "child_room")
	private WebElement child_room;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbtn;

	public Hotel_Search(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

}
