package com.stepdefinition;

import java.net.MalformedURLException;

import com.base.LibGlobal;
import com.managers.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBooking extends LibGlobal{
	public static PageObjectManager pom;
	@Given("User is on Adactin Page")
	public void user_is_on_Adactin_Page() throws MalformedURLException {
		launch("https://www.adactin.com/HotelApp/index.php");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		pom = new PageObjectManager();
		fill(pom.getLoginPage().getUsername().get(0),username);
		fill(pom.getLoginPage().getPassword().get(0),password);
		verifyValue(pom.getLoginPage().getUsername(),username);
		verifyValue(pom.getLoginPage().getPassword(),password);
	}
	@When("User clicks Login Button")
	public void user_clicks_Login_Button() {
		click(pom.getLoginPage().getBtnLogin().get(0));
	}
	@Then("User should be redirected to the Search Hotel page")
	public void user_should_be_redirected_to_the_Search_Hotel_page() {
	   System.out.println("Logging in...");
	   String eUrl="https://www.adactin.com/HotelApp/SearchHotel.php";
		verifyUrl(eUrl);
		System.out.println("->Log In Successful");
	}
	@Given("User is in the Search Hotel page")
	public void user_is_in_the_Search_Hotel_page() {
		System.out.println("Searching for Hotels...");
	}
	@When("User selects the location {string}")
	public void user_selects_the_location(String loc) {
		dropDown(pom.getSearchHotelPage().getLocation().get(0),loc);
		verifyValue(pom.getSearchHotelPage().getLocation(),loc);
	}

	@When("selects the Hotel name {string}")
	public void selects_the_Hotel_name(String hot) {
		dropDown(pom.getSearchHotelPage().getHotels().get(0),hot);
		verifyValue(pom.getSearchHotelPage().getHotels(),hot);
	}

	@When("selects the room type {string}")
	public void selects_the_room_type(String rmtype) {
		 dropDown(pom.getSearchHotelPage().getRoomType().get(0),rmtype);
		 verifyValue(pom.getSearchHotelPage().getRoomType(),rmtype);
	}

	@When("selects the number of rooms {string}")
	public void selects_the_number_of_rooms(String rmnos) {
		dropDown(pom.getSearchHotelPage().getRoomNos().get(0),rmnos);
		//verifyValue(srhp.getRoomNos(),rmnos);
	}
	@When("selects the check-in date {string}")
	public void selects_the_check_in_date(String chkDateIn){
		fill(pom.getSearchHotelPage().getCheckInDate().get(0),chkDateIn);
		verifyValue(pom.getSearchHotelPage().getCheckInDate(),chkDateIn);
	}

	@When("selects the check-out date {string}")
	public void selects_the_check_out_date(String chkDateOut){
		 fill(pom.getSearchHotelPage().getCheckOutDate().get(0),chkDateOut);
		 verifyValue(pom.getSearchHotelPage().getCheckOutDate(),chkDateOut);
	}
	@When("selects the adults per room {string}")
	public void selects_the_adults_per_room(String aproom) {
		dropDown(pom.getSearchHotelPage().getAdultRoom().get(0),aproom);
		//verifyValue(srhp.getAdultRoom(),aproom);
	}

	@When("selects the children per room {string}")
	public void selects_the_children_per_room(String cproom) {
		dropDown(pom.getSearchHotelPage().getChildRoom().get(0),cproom);
		//verifyValue(srhp.getChildRoom(),cproom);
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		 click(pom.getSearchHotelPage().getBtnSearch().get(0));
	}

	@Then("User should be redirected to the Select Hotel page")
	public void user_should_be_redirected_to_the_Select_Hotel_page() {
		System.out.println("Redirecting to Select Hotel Page...");
		String eUrl="https://www.adactin.com/HotelApp/SelectHotel.php";
		waitFor("radiobutton_0",3);
	    verifyUrl(eUrl);
	    System.out.println("->Displaying results");
	}

	@Given("User is in the Select Hotel Page")
	public void user_is_in_the_Select_Hotel_Page() {
	    System.out.println("Selecting a hotel...");
	}

	@When("User selects the Hotel")
	public void user_selects_the_Hotel() {
		click(pom.getSelectHotelPage().getRadio().get(0));
	}

	@When("clicks the continue button")
	public void clicks_the_continue_button() {
		click(pom.getSelectHotelPage().getConfirm().get(0));
	}

	@Then("User should be redirected to the Book A Hotel page")
	public void user_should_be_redirected_to_the_Book_A_Hotel_page() {
		String eUrl="https://www.adactin.com/HotelApp/BookHotel.php";
		verifyUrl(eUrl);
		System.out.println("Redirecting to Book A Hotel Page...");
	}

	@Given("User is in the Book A Hotel Page")
	public void user_is_in_the_Book_A_Hotel_Page() {
		System.out.println("Entering details...");	
	}

	@When("User fills the {string} and {string}")
	public void user_fills_the_and(String fname, String lname) {
		 fill(pom.getBookAHotelPage().getfName().get(0),fname);
		 fill(pom.getBookAHotelPage().getlName().get(0),lname);
		 verifyValue(pom.getBookAHotelPage().getfName(),fname);
		 verifyValue(pom.getBookAHotelPage().getlName(),lname);
	}

	@When("fills the Billing Address {string}")
	public void fills_the_Billing_Address(String add) {
		fill(pom.getBookAHotelPage().getAddress().get(0),add);
		verifyValue(pom.getBookAHotelPage().getAddress(),add);
	}
	@When("fills the credit card no. {string}")
	public void fills_the_credit_card_no(String ccNum) {
		fill(pom.getBookAHotelPage().getCcNum().get(0),ccNum);
		verifyValue(pom.getBookAHotelPage().getCcNum(),ccNum);
	}

	@When("selects the credit card type {string}")
	public void selects_the_credit_card_type(String cctyp) {
		dropDown(pom.getBookAHotelPage().getCcType().get(0),cctyp);
		//verifyValue(bhp.getCcType(),cctyp);
	}

	@When("selects the Expiry month {string} and year {string}")
	public void selects_the_Expiry_month_and_year(String exmon, String exyear) {
		dropDown(pom.getBookAHotelPage().getCcExpMonth().get(0),exmon);
		dropDown(pom.getBookAHotelPage().getCcExpYear().get(0),exyear);
		//verifyValue(bhp.getCcExpMonth(),exmon);
		//verifyValue(bhp.getCcExpYear(),exyear);
	}

	@When("fills the cvv number {string}")
	public void fills_the_cvv_number(String cvv) {
		fill(pom.getBookAHotelPage().getCcCvv().get(0),cvv);
		verifyValue(pom.getBookAHotelPage().getCcCvv(),cvv);
	}

	@When("clicks Book now button")
	public void clicks_Book_now_button() {
		click(pom.getBookAHotelPage().getBookNow().get(0));
	}

	@Then("User should be redirected to the Booking confirmation page")
	public void user_should_be_redirected_to_the_Booking_confirmation_page() {
	  System.out.println("Redirecting to Booking confirmation page...");
	}

	@Then("User should verify the Order No.")
	public void user_should_verify_the_Order_No() {
		waitFor("order_no",10);
		String text=pom.getBookingConfirmationPage().getOrderNo().get(0).getAttribute("value");
		 String eUrl="https://www.adactin.com/HotelApp/BookingConfirm.php";
		   verifyUrl(eUrl);
		   System.out.println("->Booking confirmed");
		 System.out.println("Order ID: "+text);
	}
}
