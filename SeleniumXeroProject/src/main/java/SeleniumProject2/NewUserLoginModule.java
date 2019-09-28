package SeleniumProject2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewUserLoginModule extends ReusableMethods{
	
	public static void NewLogin() throws InterruptedException, IOException
	
	{
       
		String[][] data = readXlData("C:\\eclipse-workspace\\SeleniumXeroProject\\data\\","AddAnotherOrganizationTrailVersionxls.xls");
		String url = data[1][0];
		String username1 = data[1][1];
		String pwd = data[1][2];
		String name = data[1][3];
   
		
		
		  driver.get(url);
		  driver.manage().window().maximize();
		  
		  WebElement login=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		  clickElement(login,"login");  
		  System.out.println("Login clicked sucessfully");
		  
		  WebElement UserName=driver.findElement(By.id("email"));
		  enterText(UserName,username1,"username");  
		  System.out.println("userName clicked sucessfully");
		  
		  WebElement Password=driver.findElement(By.id("password"));
		  enterText(Password,pwd,"password");
		  System.out.println("password clicked sucessfully");
			
		  WebElement logBtn1=driver.findElement(By.id("submitButton"));
		  clickElement(logBtn1,"Login"); 
		  System.out.println("login clicked sucessfully");
			
		  Thread.sleep(5000);
		  WebElement Myxero=driver.findElement(By.xpath("//div[@class='xrh-appmenucontainer']"));
		  clickElement(Myxero,"xero"); 
		  System.out.println("MyXero sucessfully");
		  
		  String oldwindow =  driver.getWindowHandle();
		  
		  Thread.sleep(5000);
		  WebElement XXero=driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		  clickElement(XXero,"XXero"); 
		  System.out.println("MY XXero clicked sucessfully");
		  
		  for(String winHandle:driver.getWindowHandles())
		  {
			  
			  driver.switchTo().window(winHandle);
		  }
		  
			
		  Thread.sleep(5000);
		  WebElement AddOrganization=driver.findElement(By.xpath("//a[@id='ext-gen1043']"));
		  clickElement(AddOrganization,"Organization"); 
		  System.out.println("Add Organization has been clicked sucessfully");
		  
		   
		  WebElement NewUser=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		  enterText(NewUser,name,"username");  
		   System.out.println("userName clicked sucessfully");
		  
		   Thread.sleep(5000);
		   
		   WebElement countryname=driver.findElement(By.xpath("//button[@data-automationid='country-autocompleter--open-dropdown-button']"));
		   
		   countryname.click();	
		   Thread.sleep(1000);
		   System.out.println("Country  Clicked");   
		 
		   WebElement c=driver.findElement(By.xpath("//li[@id='CNTRY/US']//button[@class='xui-pickitem--body']//span[@class='xui-pickitem--text']//span//strong[contains(text(),'United States')]"));
			 c.click();  
		   System.out.println("country zone selected");   
		      
		   
			 Thread.sleep(5000);
			 WebElement time=driver.findElement(By.xpath("//button[@data-automationid='timezone-autocompleter--open-dropdown-button']"));
			 time.click();
			 System.out.println("time zone selected");
			 
			 Thread.sleep(10000);
			 WebElement time1=driver.findElement(By.xpath("//li[@id='TIMEZONE/PACIFICSTANDARDTIME']//button[@class='xui-pickitem--body']//span[@class='xui-pickitem--text']//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]"));
			 time1.click();
			 System.out.println("time zone selected");
			  
			WebElement industry=driver.findElement(By.xpath("//input[@data-automationid='industry-autocompleter--input']"));
			enterText(industry,"Accoun","Industry");  
			Thread.sleep(5000);
			 System.out.println("Accounting  selected");
			 WebElement industry1=driver.findElement(By.xpath("//div[@data-automationid='industry-autocompleter--list--scrollable-content']//ul[@class='xui-picklist xui-picklist-layout xui-picklist-medium']//li[@class='xui-pickitem xui-pickitem-medium']//button[@class='xui-pickitem--body']//span[@class='xui-pickitem--text']//span[contains(text(),'Bookkeeping Services')]"));
			 industry1.click();
			 System.out.println("Industry selected");
			 
			
			 
}
}