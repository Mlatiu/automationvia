package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ViaTransilvanica_AchizitioneazaBorna {

	WebDriver driver; 
	
	@FindBy(id = "number-of-milestones")
	WebElement dropdownNrBorneAchizitie;
	@FindBy(id = "userName")
	WebElement numeSustinatorField;
	@FindBy(id = "lastName")
	WebElement lastNameField;
	@FindBy(id = "firstName")
	WebElement firstNameField;
	@FindBy(id = "userEmail")
	WebElement emailField;
	@FindBy(id = "phone")
	WebElement phoneField;
	@FindBy(id = "anonymousCheckbox")
	WebElement listaSustinatoriCheckBox;
	@FindBy(id = "userMotivation")
	WebElement motivationField;
	@FindBy(id = "termsCheckbox")
	WebElement termsField;
	@FindBy(id = "donate-button")
	WebElement contribuieAcumBtn;

	public ViaTransilvanica_AchizitioneazaBorna(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public ViaTransilvanica_AchizitioneazaBorna Achizitioneaza_1_Borne() {
		Select dropdownNrBorne = new Select(dropdownNrBorneAchizitie);
		dropdownNrBorne.selectByValue("1");
		return this;
	}
	public ViaTransilvanica_AchizitioneazaBorna Achizitioneaza_2_Borne() {
		Select dropdownNrBorne = new Select(dropdownNrBorneAchizitie);
		dropdownNrBorne.selectByValue("2");
		return this;
	}
	
	public ViaTransilvanica_AchizitioneazaBorna Achizitioneaza_5_Borne() {
		Select dropdownNrBorne = new Select(dropdownNrBorneAchizitie);
		dropdownNrBorne.selectByValue("5");
		return this;
	}
	public ViaTransilvanica_AchizitioneazaBorna Achizitioneaza_10_Borne() {
		Select dropdownNrBorne = new Select(dropdownNrBorneAchizitie);
		dropdownNrBorne.selectByValue("10");
		return this;
	}
	
	public ViaTransilvanica_AchizitioneazaBorna WriteNumeSustinator(String strNumeSustinator) {
		numeSustinatorField.sendKeys(strNumeSustinator);
		return this;
	}
	public ViaTransilvanica_AchizitioneazaBorna WritePersonalData(String strFirstName, String strLastName, String strEmail, String strPhone) {
		firstNameField.sendKeys(strFirstName);
		lastNameField.sendKeys(strLastName);
		emailField.sendKeys(strEmail);
		phoneField.sendKeys(strPhone);
		return this;
	}
	
	public ViaTransilvanica_AchizitioneazaBorna CheckTheBoxListaSustinatori() {
		listaSustinatoriCheckBox.click();
		return this;
	}
	
	public ViaTransilvanica_AchizitioneazaBorna WriteInMotivationField(String strMotivation) {
		motivationField.sendKeys(strMotivation);
		return this;
	}
	
	public ViaTransilvanica_AchizitioneazaBorna CheckTheBoxTermsAndConditions() {
		termsField.click();
		return this;
	}
	
	public ViaTransilvanica_PaymentSite GoToPaymentSite() {
		contribuieAcumBtn.click();
		return new ViaTransilvanica_PaymentSite(driver);
	}
	
	public ViaTransilvanica_AchizitioneazaBorna Validation_AchizitioneazaBornaPage() {
		Assert.assertEquals(driver.getTitle(), "Fiecare bornă cumpărată ne duce cu un pas mai aproape de finalizarea proiectului.");
		return this;
	}
}
