package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3Waits {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // implicit wait
		

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("(//label[@class='customradio'])[2]")).click(); // radio button clciking

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));  // Explicit wait

		driver.findElement(By.id("okayBtn")).click(); // ok ON pop-up screen 
		driver.findElement(By.id("terms")).click(); 

		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);  		// Select class for dropdown selection
		dropdown.selectByValue("consult");				// selecting the consult from dropdown

		driver.findElement(By.id("signInBtn")).click();

		WebDriverWait signinwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		signinwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']")));	// Explicit wait

		
		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='card-title']"));		// selecting the product
		for (int i = 0; i < items.size(); i++) {
			driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();		//Selecting the 4 items in ADD to Cart

		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();

	}
}
