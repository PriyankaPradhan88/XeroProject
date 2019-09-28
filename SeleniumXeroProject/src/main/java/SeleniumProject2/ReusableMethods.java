package SeleniumProject2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;





public class ReusableMethods{
	
	 
	static WebDriver driver;
	static ExtentReports report;
    static ExtentTest logger;
	 
	 /* Name of Method:InitializeDriver
	 * Brief Description: initialize the driver
	 * Creation Date :20 september 2019
	 * Last Modified : 20 september 2019
	 */
 @BeforeTest
public static void InitializeDriver()
{
    //Initialize the browser setup
	String ChromeDriverPath ="C:\\Users\\Ayushi\\Downloads\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
     driver = new ChromeDriver();
     
   
     
}

/* Name of Method:InitializeEtentReport
 * Brief Description: this will create extents report in our folder at the below given path
 * Creation Date : 20 sept 2019
 * Last Modified : 20 sept 2019
 */


public static void InitializeEtentReport()
{
	String filename = new SimpleDateFormat("'ExtentReport'yyMMddHHmm'.html'").format(new Date());
	String path = "C:\\eclipse-workspace\\SeleniumXeroProject\\Reports\\" + filename;
	report = new ExtentReports(path);
	//logger = report.startTest("Test Case");
}

/* Name of Method:to close and flush report
 * Brief Description: this will close extents report only after this report will be generated in the folder
 * Creation Date : 20 sept 2019
 * Last Modified : 20 sept 2019
 */
@AfterTest
public static void CloseTC()
{
	report.endTest(logger);
	driver.quit();
	report.flush();
}






 /* Name of Method: enterText 
 * Brief Description: Enter text to the field
 * Arguments : ele --> Element, txtVal --> Text value to be entered , ObjectName --> Name of the Object
 * Creation Date : 20 sept 2019
 * Last Modified : 20 sept 2019
 */

//optimising code for .sendKeys and find element.
public static void enterText(WebElement ele,String txtVal,String ObjectName)
{
	if(ele.isDisplayed())
	{
		ele.sendKeys(txtVal);
		System.out.println(txtVal + " has been sucessfully enterd into " + ObjectName);
		logger.log(LogStatus.INFO,txtVal + " has been sucessfully enterd into " + ObjectName);
	}
	else
	{
		System.out.println(ObjectName + "is not displayed in the web page.");
		logger.log(LogStatus.ERROR, ObjectName + "is not displayed in the web page.");
	}
}


 /* Name of Method: clickElement
 * Brief Description: Enter click to the field
 * Arguments : ele --> Element, ObjectName --> Name of the Object
 * Creation Date : 20 sept 2019
 * Last Modified : 20 sept 2019
 */

public static void clickElement(WebElement ele, String ObjectName)
{
	if(ele.isDisplayed())
	{
		ele.click();
		System.out.println(ObjectName + " has been sucessfully clicked");
		logger.log(LogStatus.INFO, ObjectName + " has been sucessfully clicked");
		
	}
	else
	{
		System.out.println(ObjectName + "is not displayed in the web page.");
		logger.log(LogStatus.ERROR, ObjectName + " has been sucessfully clicked");
	}
}

 /* Name of Method: validateErrorMsg
	 * Brief Description: validate the msg
	 * Arguments : actualMsg --> Element,errorMsg--> Name of the Object
	 * Creation Date : 20 sept 2019
	 * Last Modified : 20 sept 2019
	 */

public static void ValidateErrorMsg(String actualMsg, String errorMsg)
{
	if(actualMsg.equals(errorMsg))
	{
		System.out.println("Expected Validation Message is Successful");
		logger.log(LogStatus.INFO, "Validation Message Successful");
	}
	else
	{
		System.out.println("Expected Validation Message is incorrect");
		logger.log(LogStatus.ERROR, "Expected Validation Message is incorrect");
		logger.log(LogStatus.INFO, "Expected Validation Message is '"+actualMsg+"'");
		
	}
	
}
 /* Name of Method: readXLData
 * Brief Description: read from the excel sheet.
 * Creation Date : 20 sept 2019
 * Last Modified : 20 sept 2019
 */


public static String[][] readXlData(String path, String fileName) throws IOException{
	FileInputStream fs=new FileInputStream(new File(path+ "\\" + fileName));
	HSSFWorkbook wb=new HSSFWorkbook(fs);
	HSSFSheet sheet=wb.getSheet("Sheet1");
	int rowCount=sheet.getLastRowNum()+1;
	int colCount=sheet.getRow(0).getLastCellNum();
	String[][] data=new String[rowCount][colCount];
	for(int i=0;i<rowCount;i++){
		for(int j=0;j<colCount;j++){
			int cellType=sheet.getRow(i).getCell(j).getCellType();
			if(cellType==HSSFCell.CELL_TYPE_NUMERIC){
				int val=(int)sheet.getRow(i).getCell(j).getNumericCellValue();
				data[i][j]=String.valueOf(val);
			}
			else
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				
		}
	}
	return (data);
}


}
