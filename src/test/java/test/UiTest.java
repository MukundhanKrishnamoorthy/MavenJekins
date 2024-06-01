package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UiTest {

	private static WebDriver driver;

	@Parameters("Browser")
	@Test
	public static void testMethod(String browserValue) {

		if(browserValue.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
			System.out.println("Current driver invoked is Chrome");
		}

		else if(browserValue.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
			System.out.println("Current driver invoked is Edge");
		}

		else if(browserValue.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			System.out.println("Current driver invoked is Firefox");
		}
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getTitle().equals("Google"));
		driver.quit();
	}
}