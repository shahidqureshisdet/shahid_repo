package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script 
{
	//declaration
	@FindBy(id="email")
	private WebElement unTbox;
	@FindBy(id="pass")
	private WebElement passTbox;
	@FindBy(name="login")
	private WebElement loginButton;
	
	//initialization
	public POM_Script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// utilization
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
