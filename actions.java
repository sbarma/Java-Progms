package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
	Actions ac=new Actions(driver);
	WebElement  element=driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));
	ac.moveToElement(element).build().perform();
	
	}

}
