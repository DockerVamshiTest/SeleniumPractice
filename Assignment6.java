package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption3"));	// radio button selection
		String input = driver.findElement(By.cssSelector("label[for='honda']")).getText();	//grabbing text and storing

		WebElement options = driver.findElement(By.id("dropdown-class-example"));		//selecting the same input text from dropdown
		Select dropdown = new Select(options);
		dropdown.selectByVisibleText(input);

		driver.findElement(By.id("name")).sendKeys(input);		// enetering the option3/input text in alert text field
		driver.findElement(By.id("alertbtn")).click();

		String Finaltext = driver.switchTo().alert().getText();		//grabbing the alert text
		if (Finaltext.contains(input)) {							//equqting the alert text and input var text 
			System.out.println("Got desired text " + input);
		}

		else {
			System.out.println("failed....");
		}

	}

}
