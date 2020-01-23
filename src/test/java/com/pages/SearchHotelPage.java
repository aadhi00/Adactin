package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelPage extends LibGlobal {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private List<WebElement> location;
	@FindBy(id = "hotels")
	private List<WebElement> hotels;
	@FindBy(id = "room_type")
	private List<WebElement> roomType;
	@FindBy(id = "room_nos")
	private List<WebElement> roomNos;
	@FindBy(id = "datepick_in")
	private List<WebElement> checkInDate;
	@FindBy(id = "datepick_out")
	private List<WebElement> checkOutDate;
	@FindBy(id = "adult_room")
	private List<WebElement> adultRoom;
	@FindBy(id = "child_room")
	private List<WebElement> childRoom;
	@FindBy(id = "Submit")
	private List<WebElement> btnSearch;

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotels() {
		return hotels;
	}

	public List<WebElement> getRoomType() {
		return roomType;
	}

	public List<WebElement> getRoomNos() {
		return roomNos;
	}

	public List<WebElement> getCheckInDate() {
		return checkInDate;
	}

	public List<WebElement> getCheckOutDate() {
		return checkOutDate;
	}

	public List<WebElement> getAdultRoom() {
		return adultRoom;
	}

	public List<WebElement> getChildRoom() {
		return childRoom;
	}

	public List<WebElement> getBtnSearch() {
		return btnSearch;
	}
}
