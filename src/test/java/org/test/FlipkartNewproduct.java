package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartNewproduct extends BaseClass {
		
		public FlipkartNewproduct() {
			PageFactory.initElements(driver, this);
			
	}
		@FindBy(xpath="//button[text()=\"Buy Now\"]")
		private WebElement buynow;

public WebElement buynow() {
	return buynow;
}
}