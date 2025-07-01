package genericutility;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Krishneel
 */
public class WebDriverUtility {
	/**
	 * This method is used to maximize the window
	 * @param driver
	 */
	public void maximize(WebDriver driver) {  // webDriver driver is a formal argument 
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to perform mouse the action
	 * @param driver
	 * @param element
	 */
	public void mouseOverAction(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This method is used to perform click and hold action
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	/**
	 * This method is used to perform right click action
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This method is used to perform darg and drop action
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	/**
	 * This method is used to select option by select by index value
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select ref=new Select(element);
		ref.selectByIndex(index);		
	}
	/**
	 * This method is used to select option by select by value
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element, String value) {
		Select ref=new Select(element);
		ref.selectByValue(value);		
	}
	/**
	 * This method is used to select option by selectbyVisible test method
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element, String text) {
		Select ref=new Select(element);
		ref.selectByVisibleText(text);
	}
	/**
	 * This method is used to select all option by getoptions	 
	 * * @param element
	 * @return
	 */
	public List<String> getAllOptions(WebElement element) {
		Select ref=new Select(element);
		List<WebElement> allOptions = ref.getOptions();
		 
		List<String> options=new ArrayList<>();
		for(WebElement opt:allOptions) {
			options.add(opt.getText());
		}
		return options;
	}
	
	/**
	 * This method is used to switch to the frame by index
	 * @param driver
	 * @param index
	 */
	public void switchTOFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to switch to the frame by number or id
	 * @param driver
	 * @param numOrId
	 */
	public void switchToFrame(WebDriver driver, String numOrId) {
		driver.switchTo().frame(numOrId);
	}
	
	/**
	 * This method is used to switch to the frame by element
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method is used to switch back to the main page
	 * @param driver
	 */
	public void switchBackToMainPage(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method is used to switch back to the main page 
	 * @param driver
	 */
	public void switchBackToMainPage2(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * his method is used to switch to the alert
	 * @param driver
	 * @return 
	 */
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	/**
	 * his method is used to switch to the window
	 * @param driver
	 * @param url
	 */
	public void switchToWindow(WebDriver driver, String url) {
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds) {
			driver.switchTo().window(id);
			String actual = driver.getCurrentUrl();
			if(actual.contains(url)) {
				break;
			}
		}
	}
	
	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility jutil=new JavaUtility(); // to avoid using dat and time again as it is already there in javautility
		TakesScreenshot ts=(TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+jutil.getSystemTime() +".png");
		FileHandler.copy(img, dest);
	}
	
	public void getJSScroll(WebDriver driver, Point val1, Point val2) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+val1+", "+val2+")");
	}
	
}

