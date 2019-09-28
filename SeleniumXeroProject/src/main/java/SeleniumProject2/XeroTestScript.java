package SeleniumProject2;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import SeleniumProject2.ReusableMethods;


	public class  XeroTestScript  extends  ReusableMethods{
		 
		
		
	    
		public static void main (String[] args)throws InterruptedException, IOException {
					
					System.out.println("Start Test case");
					
					InitializeEtentReport();
					
					/*
				NevigateToXeroA();
				IncorrectPasswordB();
				IncorrectEmailC(); 
				
					NavigateToXEROD();
					SignUpToXDC();
					 SignUpToXDCB();
					 SignUpToXDCC();
					 SignUpToXDCD();
					SignUpToXDCE();
					TestAllTabsPage();
					TestLogoutFunctionality();*/
					 TestUploadProfileImage();
					 /*
					 AddAnotherOrganizationTrailVersion();
					AddAnotherOrganizationPaidVersion(); 
					//AddAnotherOrganizationStarterPlan();
					//AddAnotherOrganizationStandardPlan();
					//AddAnotherOrganizationPremiumPlan();
					AddAnotherorganizationWithUrrenQuickbooksUser();
					CheckIfUsersCanLookoutForTheirSubscriptionAndBilling(); */
				//CloseTC();
}

	@Test
public static void NevigateToXeroA() throws IOException, InterruptedException 

	{
		 // InitializeEtentReport();
		  InitializeDriver();
		  logger = report.startTest("NevigateToXeroA");
		 
	 	  LoginModule.Login();
	 	  
	 	
	 	 
	 	  Thread.sleep(3000);
	 	  driver.close();
	}
		
		

	@Test
public static void IncorrectPasswordB () throws InterruptedException 
	{
		 // InitializeEtentReport();
		  InitializeDriver();
		  
		  driver.get("https://login.xero.com/");
		  driver.manage().window().maximize();
		  logger = report.startTest("IncorrectPasswordB");
		  
		  WebElement userName1=driver.findElement(By.id("email"));
		  enterText(userName1,"selenium88priyanka@gmail.com","username");  
		  System.out.println("userName clicked sucessfully");
		  
		  WebElement fpw2=driver.findElement(By.id("password"));
		  enterText(fpw2,"selenium","password");
		  System.out.println("password clicked sucessfully");
			
		  WebElement logBtn1=driver.findElement(By.id("submitButton"));
		  clickElement(logBtn1,"Login"); 
		  System.out.println("login clicked sucessfully");
		  
		
		  Thread.sleep(3000);
		  driver.close();
	}


@Test
public static void  IncorrectEmailC() throws InterruptedException 		
{
	 // InitializeEtentReport();
	  InitializeDriver();
	
	  driver.get("https://login.xero.com/");
	  driver.manage().window().maximize();
	  logger = report.startTest("IncorrectEmailC");
	  
	  WebElement userName1=driver.findElement(By.id("email"));
	  enterText(userName1,"priyanka@gmail.com","username");  
	  System.out.println("userName clicked sucessfully");
	  
	  WebElement fpw2=driver.findElement(By.id("password"));
	  enterText(fpw2,"selenium","password");
	  System.out.println("password clicked sucessfully");
		
	  WebElement logBtn1=driver.findElement(By.id("submitButton"));
	  clickElement(logBtn1,"Login"); 
	  System.out.println("login clicked sucessfully");

	  
	  Thread.sleep(3000);
	  driver.close();
}


@Test
public static void  NavigateToXEROD() throws InterruptedException
{
	 // InitializeEtentReport();
	  InitializeDriver();
	
	  driver.get("https://login.xero.com/");
	  driver.manage().window().maximize();
	  
	  logger = report.startTest("NavigateToXEROD");
	  
	  
	  WebElement forgetpassword=driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
	  clickElement(forgetpassword,"forgetpassword");  
	  System.out.println("ForgotPassword clicked sucessfully");
	  
	  
	  WebElement userName4=driver.findElement(By.id("UserName"));
	  enterText(userName4,"selenium88priyanka@gmail.com","username");  
	  System.out.println("userName clicked sucessfully");
	  
	  WebElement link=driver.findElement(By.xpath("//a[@class='x-btn blue']"));
	  clickElement(link,"link");  
	  System.out.println("SendLink clicked sucessfully");
	  
	 
	  Thread.sleep(3000);
	  driver.close();
}

@Test
public static void  SignUpToXDC() throws InterruptedException
{
	  //InitializeEtentReport();
	  InitializeDriver();
	
	  driver.get("https://www.xero.com/us/");
	  driver.manage().window().maximize();
	  
	  logger = report.startTest("SignUpToXDC");
	  
	  
	  WebElement trial=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	  clickElement(trial,"trial");  
	  System.out.println("Free Trial clicked sucessfully");
	  
	  WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
	  enterText(firstname,"Priyanka","username");  
	  System.out.println("FirstName clicked sucessfully");
	  
	  WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
	  enterText(lastname,"Pradhan","username");  
	  System.out.println("LastName clicked sucessfully");
	  
	  WebElement email=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
	  enterText(email,"selenium88priyanka@gmail.com","username");  
	  System.out.println("Email Address clicked sucessfully");
	  
	  WebElement PhoneNumber=driver.findElement(By.xpath("//div[@class='signup-form-phone form-group']//label[@class='form-label']"));
	  enterText(PhoneNumber,"2017865435","username");  
	  System.out.println("PhoneNumber clicked sucessfully");
	  
	  
	  Select countryname= new Select(driver.findElement(By.xpath("//select[@name='LocationCode']")));
	  countryname.selectByVisibleText("United States");
	  System.out.println("CountryName selected");
	    
	  WebElement check=driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
      clickElement(check,"checkbox");  
	  System.out.println("CheckBox clicked sucessfully");
	  
	  
	 
	  Thread.sleep(3000);
	
	  driver.close();
	  
	  
	  
	  
		//captcha cannot be automate.....  
	 /* WebElement robot=driver.findElement(By.className("recaptcha-checkbox-checkmark"));
	  robot.click();
      clickElement(robot,"get started");  
	  System.out.println("Robot clicked sucessfully");*/
	     
	  
}

@Test
public static void  SignUpToXDCB()
{
	  //InitializeEtentReport();
	  InitializeDriver();
	
	  driver.get("https://www.xero.com/us/");
	  driver.manage().window().maximize();
	  
	  logger = report.startTest("SignUpToXDCB");
	  
	  WebElement trial1=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	  clickElement(trial1,"trial");  
	  System.out.println("Free Trial clicked sucessfully");
	  
	  WebElement getstarted=driver.findElement(By.className("g-recaptcha-submit"));
	  clickElement(getstarted,"get");  
	  System.out.println("Get Started clicked sucessfully");
	  

	  WebElement email1=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
	  enterText(email1,"seleniumpriyanka","username");  
	  System.out.println("Email Address clicked sucessfully");
	  
	  WebElement getstarted1=driver.findElement(By.className("g-recaptcha-submit"));
	  clickElement(getstarted1,"get");  
	  System.out.println("Get Started Again clicked sucessfully");
	  
	  driver.close();
	  
	  
}
@Test
public static void  SignUpToXDCC()
{
	// InitializeEtentReport();
	 InitializeDriver();
	 
	
	  driver.get("https://www.xero.com/us/");
	  driver.manage().window().maximize();
	  
	  logger = report.startTest("SignUpToXDCC");
	  
	  WebElement trial1=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	  clickElement(trial1,"trial");  
	  System.out.println("Free Trial clicked sucessfully");
	  
	  WebElement terms=driver.findElement(By.xpath("//a[contains(text(),'terms')]"));
	  clickElement(terms,"terms");  
	  System.out.println("Terms clicked sucessfully");
	  
	  WebElement privacy=driver.findElement(By.xpath("//a[contains(text(),'privacy')]"));
	  clickElement(privacy,"privacy");  
	  System.out.println("private policy clicked sucessfully");
	  
	  driver.close();

}
@Test
public static void  SignUpToXDCD()
{
	  //InitializeEtentReport();
	  InitializeDriver();
	
	  driver.get("https://www.xero.com/us/");
	  driver.manage().window().maximize();
	  
	  logger = report.startTest("SignUpToXDCB");
	  
	  WebElement trial1=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	  clickElement(trial1,"trial");  
	  System.out.println("Free Trial clicked sucessfully");
	  
	  WebElement offer=driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
	  clickElement(offer,"offer details");  
	  System.out.println("Offer Details clicked sucessfully");
	  
	  
	  driver.close();
}
@Test
public static void  SignUpToXDCE()
{
	  //InitializeEtentReport();
	  InitializeDriver();
	
	  driver.get("https://www.xero.com/us/");
	  driver.manage().window().maximize();
	  
	  logger = report.startTest("SignUpToXDCE");
	  
	  WebElement trial1=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
	  clickElement(trial1,"trial");  
	  System.out.println("Free Trial clicked sucessfully");
	  
	  WebElement bookkeeper=driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
	  clickElement(bookkeeper,"bookkeeper");  
	  System.out.println("accountant or bookkeeper clicked sucessfully");
	  
	  driver.close();
}
@Test
public static void  TestAllTabsPage() throws InterruptedException, IOException
{

	  //InitializeEtentReport();
	  InitializeDriver();
	
	  
	  logger = report.startTest("TestAllTabsPage");
	  
	  LoginModule.Login();
	
	  WebElement dashboard=driver.findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
	  clickElement(dashboard,"dashboard");  
	  System.out.println("DashBoard clicked sucessfully");
	  
	  WebElement account=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
	  clickElement(account,"account");  
	  System.out.println("Accounting clicked sucessfully");
	  
	  WebElement contact=driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
	  clickElement(contact,"contact");  
	  System.out.println("Contact clicked sucessfully");
	  
	 WebElement newtab=driver.findElement(By.xpath("//li[1]//button[1]//div[1]"));
	 clickElement(newtab,"newtab");  
	  System.out.println(" NewTab clicked sucessfully");
	  Thread.sleep(2000);
	  
	  WebElement search=driver.findElement(By.xpath("//li[@class='xrh-addon xrh-addon-alwaysvisible']//*[@class='xrh-icon xrh-icon-svg']"));
	  clickElement(search,"search"); 	 
	  System.out.println("Search clicked sucessfully");
	  Thread.sleep(2000);
	  
	  
	  
	  //By using Absolute path
	 WebElement notification =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[3]/button[1]"));
	 clickElement(notification,"notification");  

	 System.out.println("Notification clicked sucessfully");
	 Thread.sleep(2000);
	
	 //By using Absolute path
	 WebElement help=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[4]/button[1]"));
	 clickElement(help,"help");  
	 System.out.println("Help clicked sucessfully");
	
	  driver.close();
	  
	  
	
	
}

	@Test
	public static void  TestLogoutFunctionality() throws IOException
	{
		//initialize extent report at the beginning of the test case
		//InitializeEtentReport();
		
		//initialize the driver
		InitializeDriver();
		
		//This is the start of the log report
		 logger = report.startTest("TestLogoutFunctionality");
		
		 LoginModule.Login();
		
		 WebElement usernamepp=driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-2']"));
		 clickElement(usernamepp,"usernamepp");  
		 System.out.println("usernamePP clicked sucessfully");
		 
		 WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		 clickElement(logout,"logout");  
		 System.out.println("LogOut clicked sucessfully");
	
		//close the driver after test case execution is successful
		 driver.close();
	}
	
	
@Test
public static void  TestUploadProfileImage() throws InterruptedException, IOException
{
	

	//initialize extent report at the beginning of the test case
	//InitializeEtentReport();
	
	//initialize the driver
	InitializeDriver();
	
	//This is the start of the log report
	 logger = report.startTest("TestUploadProfileImage");
	
	 LoginModule.Login();
		
	 WebElement usernamepp=driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-2']"));
	 clickElement(usernamepp,"usernamepp");  
	 System.out.println("usernamePP clicked sucessfully");
	 
	 //by using absolute path
	 WebElement profile=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[5]/div[1]/div[2]/div[1]/ol[1]/li[1]/a[1]"));
	 clickElement(profile,"profile");  
	 System.out.println("Profile clicked sucessfully");
	
	 Thread.sleep(2000);
	 WebElement upload=driver.findElement(By.xpath("/html[1]/body[1]/div[4]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
	 clickElement(upload,"upload");  
	 System.out.println("Upload clicked sucessfully");
	 
	 Thread.sleep(2000);
	 WebElement browse=driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[2]/span[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/input[1]"));
	 browse.sendKeys("C:\\Users\\Ayushi\\Desktop\\IMG-8002.JPG");
	 System.out.println("Browse clicked sucessfully");
		 
	 Thread.sleep(2000);
	 WebElement upload1=driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]"));
	 clickElement(upload1,"upload");  
	 System.out.println("Upload1 clicked sucessfully");
		 
	 
	/*
	 WebDriverWait wait2 = new WebDriverWait(driver, 10);
	 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-btn x-exclude x-unselectable x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']//input[@class='x-form-file-input']")));
	  //Thread.sleep(10000);
	
	 WebElement browse=driver.findElement(By.xpath("//div[@class='x-btn x-exclude x-unselectable x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']//input[@class='x-form-file-input']"));
	// WebElement myelement = driver.findElement(By.id("navigationPageButton"));
	
	  */

//WebElement ele = driver.findElement(By.xpath("//div[@class='x-btn x-exclude x-unselectable x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']//div[@class='x-btn-wrap']//a[@class='x-btn-button']"));
//JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executeScript("arguments[0].click();", ele);
//ele.sendKeys("C:\\Users\\Ayushi\\Desktop\\IMG-8002.JPG");
	 //WebElement browse=driver.findElement(By.xpath("//span[text()='Upload']"));
	// browse.sendKeys("Desktop/IMG-8002.JPG");
	// clickElement(browse,"browse");  
	/*
	 WebDriverWait wait = new WebDriverWait(driver, 20);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='x-form-trigger-wrap']//div[@class='x-btn x-exclude x-unselectable x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']//input[@class='x-form-file-input' and contains(@id,'button-fileInputEl') and @name='file']")));
     WebElement ele5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='x-form-trigger-wrap']//div[@class='x-btn x-exclude x-unselectable x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']//input[@class='x-form-file-input' and contains(@id,'button-fileInputEl') and @name='file']")));
     ele5.clear();  
     ele5.sendKeys("45"); */
	
	//wait();
	
	//close the driver after test case execution is successful
	// driver.close();
	 
}



@Test
public static void  AddAnotherOrganizationTrailVersion() throws InterruptedException, IOException
{
	

	//initialize extent report at the beginning of the test case
	 //InitializeEtentReport();
	
	//initialize the driver
	 InitializeDriver();
	
	//This is the start of the log report
	 logger = report.startTest("AddAnotherOrganizationTrailVersion");
	 
	 
	 NewUserLoginModule.NewLogin();
	 
		
	 Thread.sleep(5000);
	 WebElement starttrail=driver.findElement(By.xpath("//button[@class='xui-button xui-actions--primary xui-actions--button-spacing xui-button-main xui-button-medium']"));
	 clickElement(starttrail,"starttrail"); 
	 System.out.println("StartTrail has been clicked sucessfully");
	 
	 //close the driver after test case execution is successful
	 driver.close();
	 
}
@Test
public static void  AddAnotherOrganizationPaidVersion() throws InterruptedException, IOException
{

	//initialize extent report at the beginning of the test case
	// InitializeEtentReport();
	
	//initialize the driver
	 InitializeDriver();
	
	//This is the start of the log report
	 logger = report.startTest(" AddAnotherOrganizationPaidVersion");
	 
	
	
	 NewUserLoginModule.NewLogin();
	 

		String[][] data = readXlData("C:\\eclipse-workspace\\SeleniumXeroProject\\data\\","AddAnotherOrganizationPaidVersionxls.xls");
		//String url = data[1][0];
		String  street1= data[1][0];
		String city1 = data[1][1];
		String state1= data[1][2];
		String zipcode1 = data[1][3];

		
		//logger = report.startTest(" AddAnotherOrganizationPaidVersion");
	 

	 Thread.sleep(5000);
	 WebElement buynow=driver.findElement(By.xpath("//button[@class='xui-button xui-actions--secondary xui-button-standard xui-button-medium']"));
	 clickElement(buynow,"buynow"); 
	 System.out.println("BuyNow has been clicked sucessfully");
	 
	 System.out.println("ContinueBillingAccount has been clicked sucessfully");
	 Thread.sleep(5000);
	 
	 //needed timer
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continueButton")));
	  Category_Body.sendKeys("Android Smart Phone - 16GB");
	  
	// WebElement continuebillingacount=driver.findElement(By.id("continueButton"));
	 //clickElement(continuebillingacount,"continuebillingacount"); 
	// continuebillingacount.click();
	 System.out.println("ContinueBillingAccount has been clicked sucessfully");
	 
	 
	 //used data-automationid
	    Thread.sleep(5000);
	    WebElement street=driver.findElement(By.xpath("//input[@data-automationid='contactAddresstextField']"));
		enterText(street,street1,"Industry");  
	    System.out.println("ContactStreet clicked sucessfully");
	 
	    Thread.sleep(5000);
	    WebElement city=driver.findElement(By.xpath("//input[@data-automationid='contactCitytextField']"));
		enterText(city,city1,"Industry");  
	    System.out.println("City clicked sucessfully");
	    

	     Thread.sleep(5000);
		 WebElement state=driver.findElement(By.xpath("  //div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']"));
		 state.click();
		 System.out.println("State dropdown selected");
		 
		 Thread.sleep(10000);
		 WebElement time1=driver.findElement(By.xpath("//span[contains(text(),'North Carolina')]"));
		 time1.click();
		 System.out.println("State NorthCarolina selected");
		 

		 Thread.sleep(5000);
		 WebElement ZipCode=driver.findElement(By.xpath("//input[@data-automationid='contactPostalCodetextField']"));
		 enterText(ZipCode,zipcode1,"Industry");  
		 System.out.println("ZipCode clicked sucessfully");
		    
		 Thread.sleep(10000);
		 WebElement continue1=driver.findElement(By.xpath("//button[@id='stepAccountCreate']"));
		 continue1.click();
		 System.out.println("Continue1 selected");
		 
		   
		 Thread.sleep(10000);
	     WebElement creditcard=driver.findElement(By.xpath("//body[@class='xui-body']/div[@id='react-app']/div/div/div/div/div[@class='xui-page-width-standard']/div[@class='xui-row-grid']/div[@class='xui-column-6-of-12-medium xui-column-6-of-12-wide xui-margin-large']/section[@class='xui-panel xui-panel-layout']/section[@class='xui-panel--section']/div[@class='xui-padding-vertical-small xui-padding-horizontal-large']/div[@class='custom-paymenttype-toggle xui-toggle xui-toggle-form-layout xui-toggle-small']/label[2]/span[1]"));
	     creditcard.click();
		 System.out.println("CreditCard selected");
				 

		// Thread.sleep(5000);
		//WebElement creditcardnumber=driver.findElement(By.xpath("//input[@aria-label='Credit or debit card expiration date']"));
	   //  enterText(creditcardnumber,"12/10","Industry");  
		// System.out.println("CreditCardNumber clicked sucessfully");
		  

		// Thread.sleep(5000);
		// WebElement creditcardnumber=driver.findElement(By.xpath(""));
	    // enterText(creditcardnumber,"8989 8989 8989 8989","Industry");  
		// System.out.println("CreditCardNumber clicked sucessfully");
		 
		 
		// driver.switchTo().frame(driver.findElement(By.id("spreedly-number-frame-1398")));

		// driver.findElement(By.id("card_number")).sendKeys(keysTosend);	 
		 
		//span[contains(text(),'Card number')]
		 
		 

		Thread.sleep(5000);
		WebElement cardholdername=driver.findElement(By.xpath("//input[@id='stripe-cardholder-name']"));
		enterText(cardholdername,"priya","Industry");  
		System.out.println("CardHolderName clicked sucessfully");
		

		 
		//close the driver after test case execution is successful
		 driver.close();	  
		
}

/*@Test
public static void  AddAnotherOrganizationStarterPlan() throws InterruptedException, IOException
{
	 NewUserLoginModule.NewLogin();


}
@Test
public static void  AddAnotherOrganizationStandardPlan() throws InterruptedException, IOException
{
	
	 NewUserLoginModule.NewLogin();

	
	
}	@Test
	public static void AddAnotherOrganizationPremiumPlan() throws InterruptedException, IOException
	{
	 NewUserLoginModule.NewLogin();


	
	
	
	}*/

@Test
public static void  AddAnotherorganizationWithUrrenQuickbooksUser() throws InterruptedException, IOException
{

	//initialize extent report at the beginning of the test case
	// InitializeEtentReport();
	
	//initialize the driver
	 InitializeDriver();
	
	//This is the start of the log report
	 logger = report.startTest("AddAnotherorganizationWithUrrenQuickbooksUser");
	 
	 NewUserLoginModule.NewLogin();
	 Thread.sleep(2000);
	 WebElement quickbook=driver.findElement(By.xpath("//button[@class='xui-button xui-button-icon xui-button-icon-medium']"));
	  clickElement(quickbook,"account");  
	  System.out.println("Quickbook clicked sucessfully");
	  
	  Thread.sleep(2000);
	 WebElement checkbox=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]"));
	 clickElement(checkbox,"account");  
	 System.out.println("CheckBox clicked sucessfully");
		  
	 Thread.sleep(2000);
	 WebElement continue12=driver.findElement(By.xpath("//button[@class='xui-button xui-actions--secondary xui-button-main xui-button-medium']"));
	 clickElement(continue12,"account");  
	 System.out.println("Continue clicked sucessfully");
		  
	
	 
		//close the driver after test case execution is successful
		 driver.close();	  
		
                                                               
	
}
@Test
public static void  CheckIfUsersCanLookoutForTheirSubscriptionAndBilling() throws InterruptedException, IOException
{
	

	//initialize extent report at the beginning of the test case
	 //InitializeEtentReport();
	
	//initialize the driver
	 InitializeDriver();
	
	//This is the start of the log report
	 logger = report.startTest("CheckIfUsersCanLookoutForTheirSubscriptionAndBilling");
	 
	
	 LoginModule.Login();
	
	  WebElement account=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
	  clickElement(account,"account");  
	  System.out.println("Accounting clicked sucessfully");
	  

		//close the driver after test case execution is successful
		  driver.close();	  
		
	

}
}		
