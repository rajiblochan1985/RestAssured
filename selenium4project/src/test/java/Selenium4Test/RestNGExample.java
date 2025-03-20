package Selenium4Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RestNGExample {
	
	WebDriver driver =null;
	
	@BeforeTest
	public void TestSetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
	}
	
	@Test(priority=1)
	public void GoogleSearch() throws InterruptedException {
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		WebElement searchText = driver.findElement(By.xpath("//textarea[@name='q']"));
		searchText.sendKeys("Selenium 4 New Features");
		Thread.sleep(5000);
		WebElement searchResult = driver.findElement(By.xpath("//div[@aria-label='selenium 4 new features']//span[text()='selenium 4 new features']"));
		searchResult.click();
		Thread.sleep(5000);
		
	}
	@Test(priority=2)
	public void CheckGoogleNews() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(5000);
		WebElement googleApps = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		googleApps.click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement newsLink = driver.findElement(By.xpath("//span[@data-text='News']"));
		//newsLink.click();
		js.executeScript("arguments[0].click();", newsLink);
		Thread.sleep(5000);
		
		WebElement topStories= driver.findElement(By.xpath("//a[contains(text(),'Top stories')]"));
		String topStoriesText = topStories.getText();
		System.out.println("Top Stories News:  "+ topStoriesText);
		
	}
	
	@AfterTest
	public void TestTearDown() {
		driver.close();
		System.out.println("Successfully Executed the Test Case.....");		
	}

}
