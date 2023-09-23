package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium .WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "/Users/vamshimantha/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.get("https://www.google.com/");

		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("vamshi");
		driver.findElement(By.name("inputPassword"));
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("vamshi@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7799886655");
		driver.findElement(By.className("reset-pwd-btn")).click();	
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//driver.quit();
		driver.close();
		
		
		
	}
	
	

}
