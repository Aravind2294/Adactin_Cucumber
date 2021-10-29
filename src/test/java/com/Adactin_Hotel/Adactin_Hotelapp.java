package com.Adactin_Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin_Hotelapp extends Base_Class {

	public static void main(String[] args) {

		driver = get_Driver("chrome");
		implicitlyWait(20);
		geturl("https://adactinhotelapp.com/index.php");

		WebElement username = driver.findElement(By.id("username"));
		InputValueElement(username, "Aravind2294");

		WebElement password = driver.findElement(By.id("password"));
		InputValueElement(password, "8098294433");

		WebElement login_button = driver.findElement(By.className("login_button"));
		ClickOnElement(login_button);

		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		dropdown(location, "byValue", "New York");

		WebElement hotels = driver.findElement(By.id("hotels"));
		dropdown(hotels, "byIndex", "2");

		WebElement room_type = driver.findElement(By.id("room_type"));
		dropdown(room_type, "byVisibleText", "Super Deluxe");

		WebElement Number_of_Rooms = driver.findElement(By.className("search_combobox"));
		dropdown(Number_of_Rooms, "byIndex", "3");

		WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		clear(indate);
		InputValueElement(indate, "04/11/2021");

		WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		clear(outdate);
		InputValueElement(outdate, "05/11/2021");

		WebElement adult_room = driver.findElement(By.id("adult_room"));
		dropdown(adult_room, "byValue", "2");

		WebElement child_room = driver.findElement(By.id("child_room"));
		dropdown(child_room, "byVisibleText", "3 - Three");

		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		ClickOnElement(search);

		WebElement radiobutton_0 = driver.findElement(By.id("radiobutton_0"));
		ClickOnElement(radiobutton_0);

		WebElement continuebtn = driver.findElement(By.id("continue"));
		ClickOnElement(continuebtn);

		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		InputValueElement(firstname, "Aravind");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		InputValueElement(lastname, "S");

		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		InputValueElement(address, "London");

		WebElement cc_no = driver.findElement(By.xpath("//input[@name='cc_num']"));
		InputValueElement(cc_no, "8098294433737352");

		WebElement cc_type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		dropdown(cc_type, "byVisibleText", "VISA");

		WebElement cc_exp_month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		dropdown(cc_exp_month, "byValue", "3");

		WebElement cc_exp_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		dropdown(cc_exp_year, "byIndex", "12");

		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		InputValueElement(cvv, "1234");

		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		ClickOnElement(book);

		WebElement my_itinerary = driver.findElement(By.id("my_itinerary"));
		ClickOnElement(my_itinerary);

	}

}
