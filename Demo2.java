package com.selenium;

import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com");
		//count of links in entire page
		//System.out.println("No. of links in a page");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		//count of no of links in footer section
		WebElement footer=driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println("No. of links in a footer section");
		System.out.println(footer.findElements(By.tagName("a")).size());
		//links of 2nd column in footer section
		WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("No. of links in a 2nd column of footer section");
		System.out.println(col.findElements(By.tagName("a")).size());
		//printing text of 2nd column from footer section
		String Beforeclicking=null;
		String Afterclicking;
		for(int i=0; i<col.findElements(By.tagName("a")).size(); i++)
		{
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				Beforeclicking=driver.getTitle();
				//System.out.println(driver.getTitle());
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
	}
}
			/*Afterclicking=driver.getTitle();
			if(Beforeclicking!=Afterclicking)
			{
				if(driver.getPageSource().contains("view our Site map"))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("Fail");
				}
			}
		}
		/*Set<String> ids=driver.getWindowHandles();
		java.util.Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String  childid=it.next();
		driver.switchTo().window(childid);*/
		//System.out.println(driver.getTitle());
		
		//Assert.assertNotEquals(unexpected, actual);*/
	
	
	
	


