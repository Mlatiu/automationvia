package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViaTransilvanica_HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[@class='icon']")
	WebElement menuBar;
	@FindBy(xpath = "//a[contains(text(),'CONTRIBUIE')]//parent::div[@class='static-menu-links']")
	WebElement ContribuieBtn;

	public ViaTransilvanica_HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public ViaTransilvanica_HomePage Validation_ViaTransilvanicaHomePage() {
		org.testng.Assert.assertEquals(driver.getTitle(), "Via Transilvanica – drumul care unește");
		return this;
	}
	
	public ViaTransilvanica_HomePage GoToMenuBar() {
		menuBar.click();
		return this;
	}
	
	public ViaTransilvanica_ContribuiePage GoToConbtribuiePage() {
		ContribuieBtn.click();
		return new ViaTransilvanica_ContribuiePage(driver);
	}
}

