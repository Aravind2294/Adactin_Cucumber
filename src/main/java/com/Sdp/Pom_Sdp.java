package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Manager.Hotel_Book;
import com.Page_Object_Manager.Hotel_Search;
import com.Page_Object_Manager.Hotel_Select;
import com.Page_Object_Manager.Login_Page;
import com.Page_Object_Manager.My_Itinerary;

public class Pom_Sdp {

	public WebDriver driver;

	private Login_Page lp;
	private Hotel_Search hs;
	private Hotel_Select hsel;
	private Hotel_Book hb;
	private My_Itinerary mi;

	public Pom_Sdp(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getinstancelp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Hotel_Search getinstancehs() {
		hs = new Hotel_Search(driver);
		return hs;
	}

	public Hotel_Select getinstancehsel() {
		hsel = new Hotel_Select(driver);
		return hsel;

	}

	public Hotel_Book getinstancehb() {
		hb = new Hotel_Book(driver);
		return hb;
	}

	public My_Itinerary getinstancemi() {
		mi = new My_Itinerary(driver);
		return mi;
	}

}
