package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import web_pages.Ranford_home;

public class test_start
{
     public static void main(String args[])
     {
    	 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
    	 WebDriver driver= new ChromeDriver();
    	 driver.manage().window().maximize();   	 
     
	 
     Ranford_home RFH= new Ranford_home(driver);
     if(RFH.Is_Ranford_Homepage_Opened())
		{
			System.out.println("title verified");
			RFH.Enter_Admin_Banker_Login("Admin", "M1ndq");
		}
		else
			System.out.println("title mismatch");

	}
     

}
