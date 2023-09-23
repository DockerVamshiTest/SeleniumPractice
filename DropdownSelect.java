package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium .WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class DropdownSelect {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("WebDriver.chrome.driver", "/Users/vamshimantha/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// driver.get("https://www.google.com/");

		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement selectDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(selectDropdown); // select class 
		dropdown.selectByIndex(2); //currency selection by index
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		dropdown.selectByVisibleText("USD");  //currency dropdown selection by visible text
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		

		
		driver.findElement(By.id("divpaxinfo")).click(); //passengers selection
		
		for (int i=1;i<5;i++ )
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click(); // selecting from location
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();// to location
				
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //current date from calender
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // round trip radio button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) 
		{
			System.out.println("enabled round trip radio button");
			
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);

		}
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//driver.quit();
		//driver.close();
		
		
		
	}

		
	}
	
	


