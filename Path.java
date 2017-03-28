    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	 
	public class Path {
	 
	      public static void main(String[] args) {
	            // TODO Auto-generated method stub
	            System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
	            WebDriver driver=new FirefoxDriver();
	            driver.get("http://facebook.com");
	            driver.findElement(By.id("email")).sendKeys("suchi.sucharitha5@gmail.com");
	            driver.findElement(By.name("pass")).sendKeys("sucharitha@23");
	            //driver.findElement(By.id("u_0_s")).click();
	            //driver.findElement(By.linkText("Forgot account?")).click();
	            driver.findElement(By.partialLinkText("Forgot")).click();
	            
	
}
}

 