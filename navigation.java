package Demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class navigation {
	WebDriver driver;
	SoftAssert softassert;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\visha\\Downloads\\chromedriver-win64.zip\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		softassert =new SoftAssert();
	}
	@AfterMethod
	public void teradown() {
		if (driver != null) {
			driver.quit();
		}
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertAll();
		
		
	}
	private void softassertAll() {
		// TODO Auto-generated method stub
		
	}
	@Test(priority=1)
	public void homepage() {
		WebElement mobile =driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5])"));
		softassert.assertTrue(mobile.isDisplayed(), "Mobile link is not displayed");
		mobile.click();
		Screenshots("a mobile link is clicked");
				}
	private void Screenshots(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
