package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
public static void main(String[] args) throws InterruptedException  {
	browserLaunch("chrome");
	urlLaunch("https://www.flipkart.com/");
	implicitlyWait(10);
//	LoginPage l=new LoginPage();
//	enterValue(l.getTxtUsername(),"cecily");
//	enterValue(l.getTxtpassword(),"1254");
//	//click(l.getBtnLogin());
//	click(l.getCreatebtn());
//	
//	RegisterPage r = new RegisterPage();
//
//	enterValue(r.getFirstName(),"cecily");
//	enterValue(r.getLastName(),"vasanth");
//	click(r.getBirthDay());
//	dropDown(r.getBirthDay(), 15);
//	click(r.getBirthdayMonth());
//	dropDown(r.getBirthdayMonth(),4);
//	click(r.getBirthYear());
//	dropDownn(r.getBirthYear(),"1994");
//	click(r.selectGenderFemale());
//    enterValue(r.getEmail(),"ceci@gmail.com");
//    enterValue(r.getPassword(),"12354");
//  //  click(r.singup());
//    click(r.alreadyHaveaccount());
//	
	LoginFlipcart l=new LoginFlipcart();
 click(l.getmobiles());
 enterValue(l.getiphone(),"iphone");
 click(l.getsearch());
 click(l.getapplephone());
 windowHandling();
 Thread.sleep(1000);
 click(l.buynow());
 click(l.gethelp());
	
//	AdactinHotel ah= new AdactinHotel();
//	enterValue(ah.getUsrname(),"Cecilyaa");
//	enterValue(ah.getPasswd(),"cecily16");
//	click(ah.getLogin());
//	click(ah.getLocation());
//	dropDownn(ah.getLocation(),"London");
//	dropDownn(ah.getHotels(),"Hotel Sunshine");
//	dropDownn(ah.getRoom(),"Super Deluxe");
//	dropDown(ah.getRoomno(),4);
//	ah.getIndate().clear();
//	enterValue(ah.getIndate(),"20/02/2025");
//	ah.getOutdate().clear();
//	enterValue(ah.getOutdate(),"24/02/2025");
//	dropDown(ah.getAdultroom(),2);
//	dropDown(ah.getChildroom(),1);
//	click(ah.getSearch());
//	click(ah.getBtn());
//	click(ah.getCon());
//	enterValue(ah.getFname(),"cecily");
//	enterValue(ah.getLname(),"vasanth");
//	enterValue(ah.getAdd(),"No.32,Kavarai Street,Kallkurichi");
//	enterValue(ah.getCcno(),"4512361457896321");
//	dropDownn(ah.getCctype(),"MAST");
//	dropDown(ah.getExmon(),6);
//	dropDown(ah.getExyear(),16);
//	enterValue(ah.getCcvno(),"456");
//	click(ah.getBooknow());
//	String attribute = getAttribute(ah.getOrderno());	
//	System.out.println("OrderId: "+attribute);

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 

	
}
}

	

