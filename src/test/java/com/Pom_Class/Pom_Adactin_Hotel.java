package com.Pom_Class;

import org.openqa.selenium.WebDriver;

import com.Adactin_Hotel.Base_Class;
import com.Helper.File_Reader_Manager;
import com.Sdp.Pom_Sdp;

public class Pom_Adactin_Hotel extends Base_Class {

	public static WebDriver driver = Base_Class.get_Driver("chrome");
	public static Pom_Sdp pom = new Pom_Sdp(driver);

	public static void main(String[] args) throws Throwable {

		implicitlyWait(20);
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		geturl(url);

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		InputValueElement(pom.getinstancelp().getUsername(), username);

		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		InputValueElement(pom.getinstancelp().getPassword(), password);

		ClickOnElement(pom.getinstancelp().getLoginbtnn());

		dropdown(pom.getinstancehs().getLocation(), "byValue", "New York");

		dropdown(pom.getinstancehs().getHotels(), "byIndex", "2");

		dropdown(pom.getinstancehs().getRoomtype(), "byVisibleText", "Super Deluxe");

		dropdown(pom.getinstancehs().getNo_of_rooms(), "byIndex", "3");

		clear(pom.getinstancehs().getIndate());
		InputValueElement(pom.getinstancehs().getIndate(), "04/11/2021");

		clear(pom.getinstancehs().getOutdate());
		InputValueElement(pom.getinstancehs().getOutdate(), "05/11/2021");

		dropdown(pom.getinstancehs().getAdult_room(), "byValue", "2");

		dropdown(pom.getinstancehs().getChild_room(), "byVisibleText", "3 - Three");

		ClickOnElement(pom.getinstancehs().getSearchbtn());

		ClickOnElement(pom.getinstancehsel().getSelect_hotel());

		ClickOnElement(pom.getinstancehsel().getContinuebtn());

		InputValueElement(pom.getinstancehb().getFirstname(), "Aravind");

		InputValueElement(pom.getinstancehb().getLastname(), "S");

		InputValueElement(pom.getinstancehb().getAddress(), "London");

		InputValueElement(pom.getinstancehb().getCc_no(), "8098294433737352");

		dropdown(pom.getinstancehb().getCc_type(), "byVisibleText", "VISA");

		dropdown(pom.getinstancehb().getCc_exp_month(), "byValue", "3");

		dropdown(pom.getinstancehb().getCc_exp_year(), "byIndex", "12");

		InputValueElement(pom.getinstancehb().getCvv(), "1234");

		ClickOnElement(pom.getinstancehb().getBookbtn());

		ClickOnElement(pom.getinstancemi().getMy_itinerary());

		close();

	}

}
