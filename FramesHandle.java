package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandle {
	
	public static void main(String[] args)

	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions a =new Actions(driver);
		
		WebElement sourceBox = driver.findElement(By.id("draggable"));
		WebElement targetBox = driver.findElement(By.id("droppable"));

		a.dragAndDrop(sourceBox, targetBox).build().perform();
		
		driver.switchTo().defaultContent();	//back from frames to main screen 
		
		
		//driver.quit();
		
	}
	

}
