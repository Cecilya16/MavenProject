package org.test;
import java.awt.AWTException;
import java.lang.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass  {
	public static WebDriver driver;
	public static WebDriver chromeBrowser() {
		driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver browserLaunch(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (name.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		return driver;
	}
	public static  void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public static void refresh() {
	refresh();

	}
	
	public static void implicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));

	}
	
	public static void enterValue(WebElement e,String value) {
		e.sendKeys(value);

	}
	
	public static void click(WebElement e) {
		e.click();

	}
	public static String getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static String getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
		return text;
		}
	
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
		

	}
	
	
	
	public static String toString(WebElement e) {
		String string = e.toString();
		return string;
	}
	public static void quitBrowser() {
		driver.quit();

	}
	
	public static void moveToelement(WebElement e) {
		Actions s = new Actions(driver);
		s.moveToElement(e).perform();

	}
	public static void dragAnddrop(WebElement src,WebElement tar) {
		Actions s= new Actions(driver);
		s.dragAndDrop(src, tar).perform();

	}
	public static void conTextclick(WebElement tar) {
		Actions s= new Actions(driver);
		s.contextClick(tar).perform();
	}
	public static void doubleClick(WebElement tar) {
		Actions s= new Actions(driver);
		s.doubleClick(tar);
	}
	public static void keyPress() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_COPY);

	}
	public static Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return driver.switchTo().alert();
	}
	public static void acceoptAlert(int timeout) {
		Alert a = waitForAlert(timeout);
		a.accept();
		}
	public static void dismissAlert(int timeout) {
		Alert a = waitForAlert(timeout);
		a.dismiss();
		}
	
	
	public static void close() {
		driver.close();
		
	}
	public static void dropDown(WebElement e,int a) {
		Select s = new Select(e);
		s.selectByIndex(a);
	}
		public static void dropDownn(WebElement e,String value) {
			Select s = new Select(e);
			s.selectByValue(value);

	}
	public static List<WebElement> getOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
	}
	
	public static List<WebElement> getallselectedOption(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
return allSelectedOptions;

	}
	
	public static WebElement getfirstselectedOption(WebElement e) {
		Select s = new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
return firstSelectedOption;
	}
	public static boolean isMultiple(WebElement e) {
		Select s = new Select(e);
		boolean multiple = s.isMultiple();
return multiple;

	}
	public static void dropDownn(WebElement e,int index,String value,String text) {
		Select s = new Select(e);
		s.deselectByIndex(index);
		s.deselectByValue(value);
		s.deselectByVisibleText(text);
		s.deselectAll();
}
public static File getScreenshotas() {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File sc = ts.getScreenshotAs(OutputType.FILE);
	return sc;
}

public static  void getScreenshotass(String url) throws IOException {

File des = new File(url);

File sc = null;
FileUtils.copyFile(sc, des);

	}
public static Object javascriptExecutor(String script,WebElement e) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Object executeScript = js.executeScript(script, e);
return executeScript;

}
public static Object jaEx(String script,WebElement e) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Object es = js.executeScript(script, e);
return es;
}

public static Object scrollupAnddown(String script,WebElement e) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Object es = js.executeScript(script, e);
	return es;

}
public static void frame(int index,String name,WebElement e,String id) {
	driver.switchTo().frame(index);
	driver.switchTo().frame(name);
	driver.switchTo().frame(e);
	driver.switchTo().frame(id);
}
public static boolean navigate(WebElement e) {
	boolean displayed = e.isDisplayed();
	return displayed;
}
public static boolean isSelected(WebElement e) {
	boolean selected = e.isSelected();
	return selected;
}
public static boolean isEnabled(WebElement e) {
	boolean enabled = e.isEnabled();
	return enabled;
	

}

public static void windowHandling() {
	String parentId = driver.getWindowHandle();
	System.out.println(parentId);
	
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);	
	for(String eachId:allId) {
		if(!allId.equals(eachId))
			driver.switchTo().window(eachId);
		System.out.println(driver.getTitle());
	}
	
		driver.switchTo().window(parentId);
	}
	
	
	
}
	



	







































	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

