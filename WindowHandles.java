package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();

		Set<String> window = driver.getWindowHandles(); // Handling windows class
		Iterator<String> it = window.iterator(); // iterates and collects all window/tabs ids

		String Parentid = it.next();
		String Childid = it.next();

		driver.switchTo().window(Childid); // switching to child tab

		String username = driver.findElement(By.className("red")).getText().split("at")[1].trim()
				.split(" ")[0]; // extracting text

		driver.switchTo().window(Parentid);
		driver.findElement(By.name("username")).sendKeys(username);

		// driver.close(); //closes only 1 - current tab
		driver.quit(); // closes all tabs

	}

}
