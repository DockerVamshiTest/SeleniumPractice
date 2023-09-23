package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "/Users/vamshimantha/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("WebDriver.gecko.driver", "/Users/vamshimantha/Documents/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		String password = getpassword(driver);
				
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		driver.close();


	}



public static String getpassword(WebDriver driver) throws InterruptedException

	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		
		String passwordstatement = driver.findElement(By.className("infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.

		String password1[] = passwordstatement.split("'");
		// splitted in array[0] Please use temporary password ' ar[1]=rahulshettyacademy' to Login
		String password2[] = password1[1].split("'");
		//again splitted to ar[0] = rahulshettyacademy ; ar[1]= to Login
		String password3 = password2[0]; //--> ar[0] = rahulshettyacademy
		System.out.println(password3);
		return password3;
		
		
	}
	
	
}






