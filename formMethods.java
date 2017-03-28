package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("http://us.makemytrip.com/");
System.out.println("Before clicking on Multi city Radio button");
System.out.println(driver.findElement(By.className("ui-button ui-widget ui-state-default ui-button-text-only ui-corner-right")).isDisplayed());
driver.findElement(By.className("ui-button ui-widget ui-state-default ui-button-text-only ui-corner-right")).click();
System.out.println("after clicking on Multi city Radio button");
System.out.println(driver.findElement(By.className("ret_date_overlay flL hide")).isDisplayed());
		}

}
