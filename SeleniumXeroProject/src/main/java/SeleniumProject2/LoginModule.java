package SeleniumProject2;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginModule extends ReusableMethods{
	
	public static void Login() throws IOException
	{

String[][] data = readXlData("C:\\eclipse-workspace\\SeleniumXeroProject\\data\\","NevigateToXeroAxls.xls");
String url = data[1][0];
String username1 = data[1][1];
String pwd = data[1][2];

//System.out.println(username1);
//System.out.println(pwd);

//System.out.println(pwd);
    //launch the correct url
    driver.get(url);
    driver.manage().window().maximize();
 
	
	
    WebElement userName = driver.findElement(By.id("email"));
   	enterText(userName,username1,"UserName"); 
   	System.out.println(username1);
   	
   	
   	WebElement Password = driver.findElement(By.id("password"));
   	enterText(Password,pwd,"password"); 	       	
   	System.out.println(pwd);
   
	 WebElement logBtn1 = driver.findElement(By.id("submitButton"));
	 clickElement(logBtn1,"Login"); 
	 System.out.println("login clicked sucessfully");
	}

}








/*package SeleniumProject2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginModule extends ReusableMethods{
	
	public static void Login()
	{
	
		  
		 driver.get("https://login.xero.com/");
		 driver.manage().window().maximize();
		    
		  WebElement userName1=driver.findElement(By.id("email"));
		  enterText(userName1,"selenium88priyanka@gmail.com","username");  
		   System.out.println("userName clicked sucessfully");
		  
		WebElement fpw2=driver.findElement(By.id("password"));
		enterText(fpw2,"pri88selenium","password");
		System.out.println("password clicked sucessfully");
			
		  WebElement logBtn1=driver.findElement(By.id("submitButton"));
		  clickElement(logBtn1,"Login"); 
		  System.out.println("login clicked sucessfully");
	}

}*/



