package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutosuggestiveDropdown {
	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("WebDriver.chrome.driver",
		// "/Users/vamshimantha/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // selection of checkboxes
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("Indonesia")) {
				option.click();
				break;
			}
			// System.out.println(option.getText())

		}
			//driver.close();

	}
}