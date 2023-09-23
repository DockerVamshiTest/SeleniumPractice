package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		int j = 0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);

		String[] itemsname = { "Brocolli", "Carrot", "Cucumber" }; // user selection of cart

		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < product.size(); i++) {

			List<String> itemslist = Arrays.asList(itemsname); // converting array(itemsname) into ArrayList
			String[] extractitems = product.get(i).getText().split("-"); // As in website name is Brocolli - 1kg,
																			
			String formatName = extractitems[0].trim(); // trimming space "brocolli " tp "brocolli"  // trimming the name

			if (itemslist.contains(formatName)) { // comparing if the selectlist contains the trimmedname/formatname
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsname.length) {
					break;

				}

			}

		}

		driver.close();

	}

}
