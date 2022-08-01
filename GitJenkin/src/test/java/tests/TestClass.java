package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass  {
	
	WebDriver driver;
	  
	@BeforeMethod
	public void setups() {
		if(System.getProperty("browser").equalsIgnoreCase("Chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}else if(System.getProperty("browser").equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}else if(System.getProperty("browser").equalsIgnoreCase("IE")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new InternetExplorerDriver();
	}
		
	driver.manage().window().maximize();
	driver.get(System.getProperty("url"));
	driver.get("https://www.google.com/");
}
	
	@Test(priority = 1)
	public void testcase1() {
		System.out.println("This is testcase1");
	}
	
	@Test(priority = 2)
	public void testcase2() {
		System.out.println("This is testcase2");
	}
	
	@Test(priority = 3)
	public void testcase3() {
		System.out.println("This is testcase3");
	}
	
	@Test(priority = 4)
	public void testcase4() {
		System.out.println("This is testcase4");
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
