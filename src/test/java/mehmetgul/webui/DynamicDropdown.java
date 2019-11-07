package tests.mehmetgul.webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.utils.BrowserFactory;
import tests.utils.BrowserUtils;

public class DynamicDropdown {
	public static void main(String[] args) {

		//If we need to scroll down from and dropdown menu we can use below options.
		//  .senKeys("abcsd");  .sendKeys(Keys.ARROW_DOWN);  .sendKeys(Keys.ENTER);

		WebDriver driver = BrowserFactory.getDriver("chrome");
		driver.get("http://www.makemytrip.com");

		BrowserUtils.wait(3000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bang");

		BrowserUtils.wait(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).click();

		BrowserUtils.wait(2000);
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Hyd");


		BrowserUtils.wait(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Hyderabad, India')]")).click();







	}
}
