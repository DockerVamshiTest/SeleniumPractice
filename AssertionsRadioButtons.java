package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsRadioButtons {
	
	public static void main(String[] args)
	{
	

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // not selected so its false
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // selection of checkboxes
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());//selected so true
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
		
		driver.close();
		
		//driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		/* Assignment 1
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


		driver.close(); */
		
		
		
	

}
}
