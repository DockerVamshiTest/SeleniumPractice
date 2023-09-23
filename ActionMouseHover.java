package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseHover {
	
	public static void main(String[] args)

	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		Actions a = new Actions(driver);		// for mouse moments inbuilt class
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform(); //hover the mouse
		
		
		WebElement dr = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(dr).click().keyDown(Keys.SHIFT).sendKeys("poco").build().perform();	//entering text in search field
		
		
		//driver.quit();
		
		
		
	}
}
