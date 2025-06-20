package testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamplTest1 {
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		TakesScreenshot str= (TakesScreenshot)driver;
		File src=str.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\admin\\eclipse-workspace\\RD002\\Screenshot.png");
		FileHandler.copy(src, dest);
		driver.close();
	}

}
