package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplewin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://accounts.google.com/SignUp");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
        System.out.println(driver.getTitle());
        Set<String> ids=driver.getWindowHandles();
        Iterator<String>it=ids.iterator();
        String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        
        
        
        
	}

}
