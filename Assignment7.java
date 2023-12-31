package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Assignment7 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

		WebElement table = driver.findElement(By.id("product"));		// for selecting table and setting scope for table
		System.out.println(table.findElements(By.tagName("tr")).size());		// fetching rows under scope table.
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());		//fetchinng columns and selecting only under 0 index row for columns

		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());

	}

}
