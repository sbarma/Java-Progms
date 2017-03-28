package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multipleframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.fantasycrickett.dram11.com/IN/");
		WebDriverWait  wd=new WebDriverWait(driver,5);
		driver.findElement(By.xpath("'//*[@id='m_rtxtEmail1']")).sendKeys("aa");
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")).click();
		
		/*int switchToFrame(WebDriver driver)
		{
			int i;
			int framecount=driver.findElements(By.tagName("iframe")).size();
			for(i=0;i<framecount;i++)
			{
				driver.switchTo().frame(i);
				int count=driver.findElements(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).size();
				if(count>0)
				{
					driver.findElements(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
					break;
					
				}
				else
				{
					System.out.println("continue looping");
				}
			}
		}*/
	}

}
