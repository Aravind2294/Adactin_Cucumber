package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Book {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cc_no;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cc_type;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement cc_exp_month;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement cc_exp_year;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookbtn;

	public Hotel_Book(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_no() {
		return cc_no;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

}
