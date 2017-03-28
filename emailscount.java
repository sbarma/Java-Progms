package selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class emailscount {

	public static void main(String[] args) {
	    // TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://accounts.google.com/ServiceLogin?");
        driver.findElement(By.id("Email")).sendKeys("subr2258@gmail.com");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys("sucharitha1992");
	
	//driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("sucharitha1992");
	driver.findElement(By.id("signIn")).click();
/*
	// some optional actions for reaching gmail inbo
	driver.findElement(By.xpath("//*[@title='Google apps']")).click();
	driver.findElement(By.id("gb23")).click();

	// now talking un-read email form inbox into a list
	List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));

	// Mailer name for which i want to check do i have an email in my inbox 
	String MyMailer = "Udacity";

	// real logic starts here
	for(int i=0;i<unreademeil.size();i++){
	    if(unreademeil.get(i).isDisplayed()==true){
	        // now verify if you have got mail form a specific mailer (Note Un-read mails)
	        // for read mails xpath loactor will change but logic will remain same
	        if(unreademeil.get(i).getText().equals(MyMailer)){
	            System.out.println("Yes we have got mail form " + MyMailer);
	            // also you can perform more actions here 
	            // like if you want to open email form the mailer
	            break;
	        }else{
	            System.out.println("No mail form " + MyMailer);
	        }
	    }
	}*/
	}

}
