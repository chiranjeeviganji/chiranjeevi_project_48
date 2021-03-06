package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_home {
	
	WebDriver driver;
	public Admin_home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    
	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement Home_btn;
	
	@FindBy(xpath="//a[href='change_password.aspx']")
	public WebElement Change_password;
	
	@FindBy(xpath="//a[href='home.aspx']")
	public WebElement Logout;
	
	@FindBy(xpath="//a[href='admin_banker_master.aspx']")
	public WebElement Branches_info;
	
	@FindBy(xpath="//a[href='Admin_Roles_details.aspx']")
	public WebElement Roles_info;
	
	@FindBy(xpath="//a[href='userdetails.aspx']")
	public WebElement Users_info;
	
	@FindBy(xpath="//a[href='Admin_Emp_details.aspx']")
	public WebElement Employee_info;
	
	public void Click_On_Home_btn()
	{
		Home_btn.click();
	}
	public void Click_On_Change_password()
	{
		Change_password.click();
	}
	public void Click_On_Logout()
	{
		Logout.click();
	}
	public void Click_On_Branches_info()
	{
		Branches_info.click();
	}
	public void Click_On_Roles_info()
	{
		Roles_info.click();
	}
	public void Click_On_Users_info()
	{
		Users_info.click();
	}
	public void Click_On_Employee_info()
	{
		Employee_info.click();
	}
	
}