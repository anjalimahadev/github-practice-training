package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	@FindBy(linkText= "Register")
	private WebElement registerLink;
		
	@FindBy(linkText= "Log in")
	private WebElement LoginLink;
	
	@FindBy(xpath= "//span[text()='Shopping cart']")
	private WebElement ShoppingCartLink;

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getShoppingCartLink() {
		return ShoppingCartLink;
	}

	
	
	
	
}
