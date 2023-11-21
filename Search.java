package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search {
	WebDriver driver = null;

	@Test(priority = 1)
	public void testsearch() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\visha\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// driver.findElement(By.className("nav-search-submit-button")).click();
		/*
		 * driver.findElement(By.cssSelector(
		 * "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(7) > div > div > div > div > span > div > div > div > div.puisg-col.puisg-col-4-of-12.puisg-col-8-of-16.puisg-col-12-of-20.puisg-col-12-of-24.puis-list-col-right > div > div > div.a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style > h2 > a > span"
		 * )) .click();
		 */

//		AddToCard demo = new AddToCard();
//		demo.test2();

		// driver.findElement(By.id("add-to-cart-button")).click();

		DisplayLogo displayLogo = new DisplayLogo();
		boolean displayLogo2 = displayLogo.displayLogo();
		System.out.println(displayLogo2);

	}

	/*
	 * @Test(priority = 2) public void test2() {
	 * 
	 * driver.get(
	 * "https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?keywords=iphone&qid=1700555477&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1"
	 * ); driver.findElement(By.id("add-to-cart-button")).click();
	 * //findElement.click(); }
	 */

}
