package com.StepD;

import org.openqa.selenium.WebDriver;

import com.Adactin_Hotel.Base_Class;
import com.Runner.Test_Runner;
import com.Sdp.Pom_Sdp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;

	public static Pom_Sdp pom = new Pom_Sdp(driver);

	@Given("user Launch The Application")
	public void user_launch_the_application() {
		geturl("https://adactinhotelapp.com/index.php");
	}

	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
		InputValueElement(pom.getinstancelp().getUsername(), username);
	}
	@When("user  Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String password) {
		InputValueElement(pom.getinstancelp().getPassword(), password);
	}
	
	@Then("user Click On The Login Button And It Navigates To The Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_the_search_hotel_page() {
		ClickOnElement(pom.getinstancelp().getLoginbtnn());
	}

	@When("user Select The Location")
	public void user_select_the_location() {
		dropdown(pom.getinstancehs().getLocation(), "byValue", "New York");
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {
		dropdown(pom.getinstancehs().getHotels(), "byIndex", "2");
	}

	@When("user Select The Room Type")
	public void user_select_the_room_type() {
		dropdown(pom.getinstancehs().getRoomtype(), "byVisibleText", "Super Deluxe");
	}

	@When("user Select The Number Of Rooms")
	public void user_select_the_number_of_rooms() {
		dropdown(pom.getinstancehs().getNo_of_rooms(), "byIndex", "3");
	}

	@When("user Select The Check In Date")
	public void user_select_the_check_in_date() {
		clear(pom.getinstancehs().getIndate());
		InputValueElement(pom.getinstancehs().getIndate(), "04/11/2021");
	}

	@When("user Select The Check Out Date")
	public void user_select_the_check_out_date() {
		clear(pom.getinstancehs().getOutdate());
		InputValueElement(pom.getinstancehs().getOutdate(), "05/11/2021");
	}

	@When("user Select The Adults Per Room")
	public void user_select_the_adults_per_room() {
		dropdown(pom.getinstancehs().getAdult_room(), "byValue", "2");
	}

	@When("user Select The Children Per Room")
	public void user_select_the_children_per_room() {
		dropdown(pom.getinstancehs().getChild_room(), "byVisibleText", "3 - Three");
	}

	@Then("user Click On The Login Button And It Navigates To The Select Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_the_select_hotel_page() {
		ClickOnElement(pom.getinstancehs().getSearchbtn());
	}

	@When("user Select The Hotel Button")
	public void user_select_the_hotel_button() {
		ClickOnElement(pom.getinstancehsel().getSelect_hotel());
	}

	@Then("user Click On The Continue Button And It Navigates To The Book Hotel Page")
	public void user_click_on_the_continue_button_and_it_navigates_to_the_book_hotel_page() {
		ClickOnElement(pom.getinstancehsel().getContinuebtn());
	}

	@When("user Enter The Firstname In Firstname Field")
	public void user_enter_the_firstname_in_firstname_field() {
		InputValueElement(pom.getinstancehb().getFirstname(), "Aravind");
	}

	@When("user Enter The Lastname In Lastname Field")
	public void user_enter_the_lastname_in_lastname_field() {
		InputValueElement(pom.getinstancehb().getLastname(), "S");
	}

	@When("user Enter The Billing Address In Billing Address Field")
	public void user_enter_the_billing_address_in_billing_address_field() {
		InputValueElement(pom.getinstancehb().getAddress(), "London");
	}

	@When("user Enter The Credit Card No In Credit Card No Field")
	public void user_enter_the_credit_card_no_in_credit_card_no_field() {
		InputValueElement(pom.getinstancehb().getCc_no(), "8098294433737352");
	}

	@When("user Enter The Credit Card Type In Credit Card Type Field")
	public void user_enter_the_credit_card_type_in_credit_card_type_field() {
		dropdown(pom.getinstancehb().getCc_type(), "byVisibleText", "VISA");
	}

	@When("user Enter The Expiry Date Month In Expiry Date Month Field")
	public void user_enter_the_expiry_date_month_in_expiry_date_month_field() {
		dropdown(pom.getinstancehb().getCc_exp_month(), "byValue", "3");
	}

	@When("user Enter The Expiry Date Year In Expiry Date Year Field")
	public void user_enter_the_expiry_date_year_in_expiry_date_year_field() {
		dropdown(pom.getinstancehb().getCc_exp_year(), "byIndex", "12");
	}

	@When("User Enter The CVV Number In CVV Number Field")
	public void user_enter_the_cvv_number_in_cvv_number_field() {
		InputValueElement(pom.getinstancehb().getCvv(), "1234");
	}

	@Then("user Click On The Book Now Button And It Navigates To The Booking Confirmation Page")
	public void user_click_on_the_book_now_button_and_it_navigates_to_the_booking_confirmation_page() {
		ClickOnElement(pom.getinstancehb().getBookbtn());
	}
	
	@When("user Click On The My Itinerary Button And It Navigates To The Home Page")
	public void user_click_on_the_my_itinerary_button_and_it_navigates_to_the_home_page() {
		implicitlyWait(10);
		ClickOnElement(pom.getinstancemi().getMy_itinerary()); 
	}

}
