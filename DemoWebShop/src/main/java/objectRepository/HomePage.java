package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText="Books")
	private WebElement booksLink;
	
	@FindBy(partialLinkText="Computers")
	private WebElement computerLink;
	
	@FindBy(partialLinkText="Gift Cards")
	private WebElement giftCards;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}
	
	
}
