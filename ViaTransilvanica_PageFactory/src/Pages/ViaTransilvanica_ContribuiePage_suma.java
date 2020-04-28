package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ViaTransilvanica_ContribuiePage_suma {
	
	WebDriver driver;
	
	@FindBy(id = "radio-1")
	WebElement chechbox_sum_15lei;
	@FindBy(id = "radio-2")
	WebElement chechbox_sum_25lei;
	@FindBy(id = "radio-3")
	WebElement chechbox_sum_50lei;
	@FindBy(id = "radio-4")
	WebElement chechbox_sum_75lei;
	@FindBy(id = "radio-5")
	WebElement chechbox_sum_100lei;
	@FindBy(id = "radio-6")
	WebElement chechbox_sum_200lei;
	@FindBy(id = "otherAmountCheckbox")
	WebElement chechbox_sum_altaSuma;
	@FindBy(id = "other-amount")
	WebElement sumField;
	@FindBy(id = "recurrentPayment")
	WebElement RecurrentPayment;
	@FindBy(id = "lastName")
	WebElement lastNameField;
	@FindBy(id = "firstName")
	WebElement firstNameField;
	@FindBy(id = "userEmail")
	WebElement emailField;
	@FindBy(id = "phone")
	WebElement phoneField;
	@FindBy(id = "termsCheckbox")
	WebElement termsCheckBox;
	@FindBy(id = "donate-button")
	WebElement contribuieAcumBtn;
	
	public ViaTransilvanica_ContribuiePage_suma(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public ViaTransilvanica_ContribuiePage_suma CheckTheBox_15lei() {
		chechbox_sum_15lei.click();
		return this;
	}
	
	public ViaTransilvanica_ContribuiePage_suma CheckTheBox_25lei() {
		chechbox_sum_25lei.click();
		return this;
	}
	public ViaTransilvanica_ContribuiePage_suma CheckTheBox_50lei() {
		chechbox_sum_50lei.click();
		return this;
	}
	public ViaTransilvanica_ContribuiePage_suma CheckTheBox_75lei() {
		chechbox_sum_75lei.click();
		return this;
	}
	public ViaTransilvanica_ContribuiePage_suma CheckTheBox_100lei() {
		chechbox_sum_100lei.click();
		return this;
	}
	public ViaTransilvanica_ContribuiePage_suma CheckTheBox_200lei() {
		chechbox_sum_200lei.click();
		return this;
	}
	public ViaTransilvanica_ContribuiePage_suma CheckTheBox_altaSuma() {
		chechbox_sum_altaSuma.click();
		return this;
	}
	public ViaTransilvanica_ContribuiePage_suma WriteSumField(String strSum) {
		sumField.clear();
		sumField.sendKeys(strSum);
		return this;
	}
	
	public ViaTransilvanica_ContribuiePage_suma CheckTheBoxRecurrentPayment() {
		RecurrentPayment.click();
		return this;
	}
	
	public ViaTransilvanica_ContribuiePage_suma WriteFullName(String strLastName, String strfirstName) {
		lastNameField.clear();
		lastNameField.sendKeys(strLastName);
		firstNameField.clear();
		firstNameField.sendKeys(strfirstName);
		return this;
	}
	
	public ViaTransilvanica_ContribuiePage_suma WriteEmail(String strEmail) {
		emailField.sendKeys(strEmail);
		return this;
	}
	
	public ViaTransilvanica_ContribuiePage_suma WritePhoneNumber(String strPhone) {
		phoneField.sendKeys(strPhone);
		return this;
	}
	public ViaTransilvanica_ContribuiePage_suma TermsCheckTheBox() {
		termsCheckBox.click();
		return this;
	} 
	
	public ViaTransilvanica_PaymentSite GoToPaymentSite() {
		contribuieAcumBtn.click();
		return new ViaTransilvanica_PaymentSite(driver);
	}
	
	public ViaTransilvanica_ContribuiePage_suma Validation_ContribuieSumaPage() {
		Assert.assertEquals(driver.getTitle(), "Fiecare contribuție ne duce cu un pas mai aproape de finalizarea proiectului.");
		return this;
	}
}
