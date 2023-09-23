package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Vamshi");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vamshi@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Vamshi@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement genderdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(genderdropdown);
		
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("[type='date']")).sendKeys("28041996");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		
		
		
		
		
		

	}

}
