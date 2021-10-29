Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: Login
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user  Enter The "<password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|Abc|Abc123|
|Def|Def|
|Aravind2294|8098294433|

@sanityTest
Scenario: Search Hotel
When user Select The Location
And user Select The Hotel
And user Select The Room Type
And user Select The Number Of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click On The Login Button And It Navigates To The Select Hotel Page

@sanityTest
Scenario: Select Hotel
When user Select The Hotel Button
Then user Click On The Continue Button And It Navigates To The Book Hotel Page

@sanityTest
Scenario: Book Hotel
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card No In Credit Card No Field
And user Enter The Credit Card Type In Credit Card Type Field
And user Enter The Expiry Date Month In Expiry Date Month Field
And user Enter The Expiry Date Year In Expiry Date Year Field
And User Enter The CVV Number In CVV Number Field
Then user Click On The Book Now Button And It Navigates To The Booking Confirmation Page

@regressionTest
Scenario: My Itinerary
When user Click On The My Itinerary Button And It Navigates To The Home Page