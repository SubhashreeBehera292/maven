package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import design.Autoconstant;
import design.Basepage;
import design.ExcelLibrary;

public class POMActitimeLoginPage extends Basepage implements Autoconstant
{
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	/*@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedinCheckbox;*/
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	/*@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordLink;*/
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		 usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		 passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		 loginButton.click();
	}
	
}