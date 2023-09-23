package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(1000);
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

		/*List<WebElement> text = driver.findElements(By.cssSelector(".ui-autocomplete li"));
		for (WebElement option : text) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;   
			}  
		}    */
		
}
}
