package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		ChromeOptions option = new ChromeOptions();
		// option.addArguments("--disable-geolocation");
		option.addArguments("--disable-notifications"); // For blocking the popup windows like camera, location etc
		// option.setExperimentalOption("excludeSwitches",
		// Arrays.asList("disable-popup-blocking"));
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/vamshimantha/Downloads/screenshot.png"));

	}
}
