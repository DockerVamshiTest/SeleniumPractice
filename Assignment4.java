package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set <String> window = driver.getWindowHandles();
		Iterator <String> itr = window.iterator();
		
		String Parentid = itr.next();
		String Childid = itr.next();
		
		driver.switchTo().window(Childid);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		driver.switchTo().window(Parentid);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
}

}
