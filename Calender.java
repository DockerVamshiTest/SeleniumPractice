package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ixigo.com/");
		
		String day = "21";
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		
		
		while (true) {

			String text = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();	// Month selection 
			if (text.contains("November")) {
				break;
			} else {
				driver.findElement(By.cssSelector("button[class='ixi-icon-arrow rd-next']")).click();

			}
		}
		
		List<WebElement> date = driver.findElements(By.xpath("(//table[@class='rd-days'])[2]")); // day selection 
		for (int i = 1; i < date.size(); i++) {
			String number = driver.findElements(By.xpath("(//table[@class='rd-days'])[2]")).get(i).getText();	// xpaths are not correct
			System.out.println(number);
			if (number.equalsIgnoreCase(day)) {
				driver.findElements(By.xpath("(//table[@class='rd-days'])[2]")).get(i).click();
				break;
			}

		}
		
		
	}

}
