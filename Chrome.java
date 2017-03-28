package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.spicejet.com");
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
     //dropdown.selectByIndex(arg0);   
	}
}
