package selenium;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StreamsSortingCompare {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
		driver.findElement(By.xpath("//tr//th[1]")).click();

		List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> original = items.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sorted = original.stream().sorted().collect(Collectors.toList());

		Assert.assertEquals(original, sorted);		//comparing 2 strings

		List<String> product; // scan the name column with getText ->Beans->print the price of the Mango

		do {

			List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));
			product = row.stream().filter(s -> s.getText().contains("Mango")).map(s -> veggies(s))
					.collect(Collectors.toList());

			product.forEach(a -> System.out.println(a));

			if (product.size() < 1) {
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}

		while (product.size() < 1);
	}

	private static String veggies(WebElement s) {
		String nbr = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return nbr;
	}

}



		
		
		
		
		
		
		
		
		