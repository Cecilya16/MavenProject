package org.test;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {

		public RegisterPage() {
			PageFactory.initElements(driver, this);
			}
		
		@FindBy(xpath="(//a[@role=\"button\"])[2]")
		private WebElement createbtn;
		
		@FindBy(name="firstname")
		private static  WebElement fsname;

		@FindBy(name="lastname")
        private  WebElement lsname;
      
		@FindBy(id="day")
        private  WebElement day;
        
        @FindBy(id="month")
        private  WebElement month;
        
        @FindBy(id="year")
        private  WebElement year;
        
        @FindBy(xpath="(//input[@type=\"text\"])[5]")
        private  WebElement email;
        
        @FindBy(xpath="//input[@type=\"password\"]")
        private  WebElement passwd;
        
        @FindBy(xpath="(//input[@type=\"radio\"])[1]")
        private  WebElement female;
        
        @FindBy(name="websubmit")
        private  WebElement signup;
        
        @FindBy(xpath="//div[@class=\"_9bq4\"]")
        private WebElement alracc;

		public WebElement getCreatebtn() {
			return createbtn;
		}

		public  WebElement getFirstName() {
		return fsname;
		}
		
		public  WebElement getLastName() {
        return lsname;

		}
		
		public  WebElement getEmail() {
			return email;
		}
		public  WebElement getPassword() {
			return passwd;
		}
		public  WebElement getBirthDay() {
			return day;
		}
		public  WebElement getBirthdayMonth() {
			return month;
		}
		public  WebElement getBirthYear() {
			return year;
		}
		public  WebElement selectGenderFemale() {
			female.click();
			return female;
		}
		public  WebElement singup() {
			return signup;
		}
		public WebElement alreadyHaveaccount() {
			return alracc;
	
			
		}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
