package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel extends BaseClass{
	public AdactinHotel() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="username")
	private WebElement usrname;
	
	@FindBy(id="password")
	private WebElement passwd;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy (id="room_nos")
	private WebElement roomno;
	@FindBy (id="datepick_in")
	private WebElement indate;
	@FindBy(id="datepick_out")
	private WebElement outdate;
	@FindBy (id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childroom;
	@FindBy(id="Submit")
	private WebElement search;
	@FindBy(id="radiobutton_0")
	private WebElement btn;
	@FindBy(id="continue")
	private WebElement contue;
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement ccno;
	@FindBy (id="cc_type")
	private WebElement cctype;
	@FindBy (id="cc_exp_month")
	private WebElement exmon;
	@FindBy (id="cc_exp_year")
	private WebElement exyear;
	@FindBy (id="cc_cvv")
	private WebElement ccvno;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(id="order_no")
	private WebElement orderno;
	@FindBy(id="my_itinerary")
	private WebElement itineary;
	@FindBy(xpath="//input[@value=\"O0197W2RE0\"]")
	private WebElement fono;




	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getBtn() {
		return btn;
	}
	public WebElement getCon() {
		return contue;
	}

	public WebElement getContue() {
		return contue;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExmon() {
		return exmon;
	}

	public WebElement getExyear() {
		return exyear;
	}

	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getMyitine() {
		return itineary;
	}
	public WebElement getOrn() {
		return fono;
	}
	
	
	
}
