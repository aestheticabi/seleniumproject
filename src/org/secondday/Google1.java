package org.secondday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement txtEnter = driver.findElement(By.name("q"));
		txtEnter.sendKeys("GreensTechnology");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}

