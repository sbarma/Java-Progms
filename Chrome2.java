package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.spicejet.com");
Select dropdown=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
dropdown.selectByIndex(4);
dropdown.selectByVisibleText("8 Adults");
dropdown.selectByValue("3");
//driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
//driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']"));
System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).getSize());
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	}

}
