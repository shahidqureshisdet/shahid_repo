package project_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Login 
{
	//declaration
		@FindBy(xpath="//a[.='Login']")
		private WebElement lo;
		@FindBy(id="email")
		private WebElement unTbox;
		@FindBy(id="password")
		private WebElement passTbox;
		@FindBy(xpath="//button[@id='loginBtn']")
		private WebElement loginButton;
		
		//initialization
		public POM_Login(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		// utilization
		public void logincl()
		{
			lo.click();
		}
		public void unData(String un)
		{
			unTbox.sendKeys(un);
		}

		public void passData(String pass)
		{
			passTbox.sendKeys(pass);
		}
		public void clickLogin()
		{
			loginButton.click();
		}

}
