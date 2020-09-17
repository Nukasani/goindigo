package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	
	public WebDriver driver;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Login'])[1]")
	public  WebElement loginbutton;
	
	@FindBy(id="memberId")
	public WebElement uid;
	
	@FindBy(how=How.XPATH,using="//*[@type='password']")
	public WebElement pwd;
	
	@FindBy(how=How.XPATH,using="(//*[text()='Login'])[3]")
	public WebElement Clickonlogin;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	public void uidFill(String x)
	{
		uid.sendKeys(x);
	}
	public void pwdFill(String x)
	{
		pwd.sendKeys(x);
	}
	public void Clicklogin1()
	{
		loginbutton.click();
	}
	public void Clicklogin2()
	{
		Clickonlogin.click();
	}
	

}
