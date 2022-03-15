package org.secondday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram1 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("Abi");
		
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("ABC@123");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}


