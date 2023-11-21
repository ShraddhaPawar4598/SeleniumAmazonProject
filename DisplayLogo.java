package Demo;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayLogo {

	WebDriver driver = null;

	@Test(priority = 1)
	public boolean displayLogo() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone&ref=nb_sb_noss");
		
			try {
				
				
				WebElement ele =driver.findElement(By.xpath("//*[@id=\"CardInstancemPbPZ5r-K7_LwM8x6gFx8g\"]/div[1]/div[1]/div[1]/div/div[1]/a/div/img"));//element present
				if(ele.isDisplayed()) {
					System.out.println("pass");//visible
					//return true
					}
				else {
					System.out.println("fail");
					//return false
				}
				
			}catch (NoSuchElementException e) {  //not present
			return false;
				
			}
			return false;
		
//		AddToCard demo = new AddToCard();
//		demo.test2();

		// driver.findElement(By.id("add-to-cart-button")).click();

	}
}
