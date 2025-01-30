package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlipcart extends BaseClass{
	public LoginFlipcart() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[@aria-label=\"Mobiles\"]")
	private WebElement searchproduct;
	
	@FindBy(name="q")
	private WebElement iphone;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement search;
	
	@FindBy(xpath="//div[text()=\"Apple iPhone 16 (White, 128 GB)\"]")
	private WebElement appleiphone;
	
	@FindBy(xpath="//button[text()=\"Buy Now\"]")
	private WebElement buynow;
	
	@FindBy(xpath="//button[text()=\"Add to cart\"]")
	private WebElement addcart;
	
	@FindBy(xpath="(//a[@class=\"A7CQcc\"])[1]")
	private WebElement helpcenter;
	
	public WebElement getmobiles() {
		return searchproduct;
	}

	public WebElement getiphone() {
		return iphone;
	}
	public WebElement getsearch() {
		return search;
	}
	
	public WebElement getapplephone() {
		return appleiphone;
	}
	
	public WebElement addtocart() {
		return addcart;
	}
	
	public WebElement buynow() {
		return buynow;
	}
	public WebElement gethelp () {
		return helpcenter;
	
	}
}
