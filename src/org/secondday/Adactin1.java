package org.secondday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin1 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("Abi");
	
	WebElement txtpassword = driver.findElement(By.id("password"));
	txtpassword.sendKeys("ABC@123");
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println(title);
}


}
