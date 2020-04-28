package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViaTransilvanica_ContribuiePage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='primary-button' and contains(text(),'CONTRIBUIE')]")
	WebElement contribuieBtn;
	@FindBy(xpath = "//a[contains(text(),'ACHIZIȚIONEAZĂ O BORNĂ')]")
	WebElement achizitioneazaBornaBtn;
	
	public ViaTransilvanica_ContribuiePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	 
	public void Validation_ContribuiePage() {
		Assert.assertEquals(driver.getTitle(), "Contribuie la Via Transilvanica");
	}
	
	public ViaTransilvanica_ContribuiePage_suma GoToContribuiePageSuma() {
		contribuieBtn.click();
		return new ViaTransilvanica_ContribuiePage_suma(driver);
	}

	public ViaTransilvanica_AchizitioneazaBorna GoToAchizitioneazaBornaPage() {
		achizitioneazaBornaBtn.click();
		return new ViaTransilvanica_AchizitioneazaBorna(driver);
	}
	

}
