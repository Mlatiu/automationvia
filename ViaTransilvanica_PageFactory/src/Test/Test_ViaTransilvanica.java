package Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ViaTransilvanica_ContribuiePage;
import Pages.ViaTransilvanica_ContribuiePage_suma;
import Pages.ViaTransilvanica_HomePage;
import Pages.ViaTransilvanica_PaymentSite;

public class Test_ViaTransilvanica {

	

	String driverPath = "C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;

	ViaTransilvanica_HomePage obj_HomePage;
	ViaTransilvanica_ContribuiePage obj_ContribuiePage;
	ViaTransilvanica_ContribuiePage_suma obj_ContribuiePageSuma;
	ViaTransilvanica_PaymentSite obj_PaymentPage;

@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		 driver.get("https://www.viatransilvanica.com");
		 driver.findElement(By.id("accept-cookies")).click();
	}
	
@Test
	public void test_contribuie_suma() throws InterruptedException {
	    obj_HomePage= new ViaTransilvanica_HomePage(driver);
	    obj_HomePage.Validation_ViaTransilvanicaHomePage();
	    obj_HomePage.GoToMenuBar();
	    obj_ContribuiePage = obj_HomePage.GoToConbtribuiePage();
	    obj_ContribuiePage.Validation_ContribuiePage();
		obj_ContribuiePage.GoToContribuiePageSuma();
		obj_ContribuiePageSuma = new ViaTransilvanica_ContribuiePage_suma(driver);
		obj_ContribuiePageSuma.Validation_ContribuieSumaPage();
		obj_ContribuiePageSuma.CheckTheBox_100lei();
		obj_ContribuiePageSuma.CheckTheBox_200lei();
		obj_ContribuiePageSuma.CheckTheBox_25lei();
		obj_ContribuiePageSuma.CheckTheBox_50lei();
		obj_ContribuiePageSuma.CheckTheBox_75lei();
		obj_ContribuiePageSuma.CheckTheBox_15lei();
		obj_ContribuiePageSuma.CheckTheBox_altaSuma();
		obj_ContribuiePageSuma.WriteSumField("7");
		obj_ContribuiePageSuma.CheckTheBoxRecurrentPayment();
		obj_ContribuiePageSuma.WriteFullName("Demian", "Sorin");
		obj_ContribuiePageSuma.WriteEmail("Sorin.Demian@endava.com");
		obj_ContribuiePageSuma.WritePhoneNumber("0746107517");
		obj_ContribuiePageSuma.TermsCheckTheBox();
		obj_ContribuiePageSuma.GoToPaymentSite();
		obj_PaymentPage = new ViaTransilvanica_PaymentSite(driver);
		Thread.sleep(500);
		obj_PaymentPage.Validation_paymentSite();
	}
}
