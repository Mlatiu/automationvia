package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViaTransilvanica_PaymentSite {

	WebDriver driver;
	
	public ViaTransilvanica_PaymentSite(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void Validation_paymentSite() {
		Assert.assertEquals(driver.getTitle(), "EuPlătesc.ro - Detaliile tranzacţiei");
	}
}
