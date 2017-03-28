package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.espncricinfo.com");
		WebElement table=driver.findElement(By.id("inningsBat1"));
		List<WebElement>noofrows=table.findElements(By.tagName("tr"));
	}

}
