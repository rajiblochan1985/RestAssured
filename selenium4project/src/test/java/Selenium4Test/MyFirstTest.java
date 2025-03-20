package Selenium4Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import java.lang.Thread;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		WebElement searchText = driver.findElement(By.xpath("//textarea[@name='q']"));
		searchText.sendKeys("Selenium 4 New Features");
		Thread.sleep(5000);
		WebElement searchResult = driver.findElement(By.xpath("//div[@aria-label='selenium 4 new features']//span[text()='selenium 4 new features']"));
		searchResult.click();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
