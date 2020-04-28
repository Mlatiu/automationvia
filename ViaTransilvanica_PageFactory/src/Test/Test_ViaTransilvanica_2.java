package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ViaTransilvanica_AchizitioneazaBorna;
import Pages.ViaTransilvanica_ContribuiePage;
import Pages.ViaTransilvanica_HomePage;
import Pages.ViaTransilvanica_PaymentSite;

public class Test_ViaTransilvanica_2 {

	String driverPath = "C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;

	ViaTransilvanica_HomePage obj_HomePage;
	ViaTransilvanica_ContribuiePage obj_ContribuiePage;
	ViaTransilvanica_AchizitioneazaBorna obj_AchizitioneazaBornaPage;
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
	public void test_AchizitioneazaBorna() throws InterruptedException {
		 obj_HomePage= new ViaTransilvanica_HomePage(driver);
		    obj_HomePage.Validation_ViaTransilvanicaHomePage();
		    obj_HomePage.GoToMenuBar();
		    obj_ContribuiePage = obj_HomePage.GoToConbtribuiePage();
		    obj_ContribuiePage.Validation_ContribuiePage();
		    obj_AchizitioneazaBornaPage = new ViaTransilvanica_AchizitioneazaBorna(driver);
		    obj_AchizitioneazaBornaPage = obj_ContribuiePage.GoToAchizitioneazaBornaPage();
		    obj_AchizitioneazaBornaPage.Validation_AchizitioneazaBornaPage();
		    obj_AchizitioneazaBornaPage.Achizitioneaza_2_Borne();
		    obj_AchizitioneazaBornaPage.Achizitioneaza_1_Borne();
		    obj_AchizitioneazaBornaPage.Achizitioneaza_5_Borne();
		    obj_AchizitioneazaBornaPage.Achizitioneaza_10_Borne();
		    obj_AchizitioneazaBornaPage.WriteNumeSustinator("Gigi Becali");
		    obj_AchizitioneazaBornaPage.WritePersonalData("Gigi", "Becali", "Sorin.Demian@endava.com", "0777777777");
		    obj_AchizitioneazaBornaPage.CheckTheBoxListaSustinatori();
		    obj_AchizitioneazaBornaPage.WriteInMotivationField("Sunt alaturi de voi in acest Proiect!");
		    obj_AchizitioneazaBornaPage.CheckTheBoxTermsAndConditions();
		    obj_AchizitioneazaBornaPage.GoToPaymentSite();
		    obj_PaymentPage = new ViaTransilvanica_PaymentSite(driver);
		    Thread.sleep(500);
			obj_PaymentPage.Validation_paymentSite();
		    
	}
}
