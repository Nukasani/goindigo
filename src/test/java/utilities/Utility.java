package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Utility 
{
	WebDriver driver;
	
	public WebDriver openBrowser()
	{
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return(driver);
	}
	public void launSite(String x)
	{
		driver.get(x);
	}
	public void closeSite()
	{
		driver.close();
	}
	

}
