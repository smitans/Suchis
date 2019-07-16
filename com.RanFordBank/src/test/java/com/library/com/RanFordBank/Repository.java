package com.library.com.RanFordBank;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import bsh.classpath.BshClassPath.AmbiguousName;
import testBase.Base;
import utility.Generic;
import webtable.Table;

public abstract class Repository  extends Base{
	
	ExtentReports Report;
	ExtentTest Test;
	String barnchID;
	@BeforeTest
	public void report_html()
	{
		Report=new ExtentReports(".\\ExtentReports\\Report.html",true); 
	}
	
	@BeforeMethod
	public void Send_Tc_to_report(Method method)
	{
		 Test = Report.startTest(this.getClass().getSimpleName()+":"+method.getName());
		 Test.assignAuthor("Er Suchismita");
		 Test.assignCategory("Regression");
	}
	
	@AfterTest
	public void Save_report()
	{
		Report.flush();
	}
	public void launch() {
		if(getConfig("browser").equals("chrome"))
		{
		  System.setProperty(getConfig("chromedrivername"), getConfig("chromedriverpath"));
			driver=new ChromeDriver();
		}
		else if (getConfig("browser").equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get(getConfig("build1"));
		String actualUrl=driver.getCurrentUrl();
		String expUrl=getConfig("build1");
		
		if(actualUrl.equals(expUrl))
		{
		Test.log(LogStatus.PASS, "My expected Url:-"+ getConfig("build1")+"is matching with actual Url:"+ actualUrl);
		Test.log(LogStatus.INFO, "Launch has done successfully");   
		}
		else
		{
			Test.log(LogStatus.FAIL, "My expected Url:-"+ getConfig("build1")+"is not matching with actual Url:"+ actualUrl);
		}
	}

	public  void login_Tc() {
    
		LoginPage.UserName_editbox().sendKeys(getConfig("username"));
		LoginPage.Password_editbox().sendKeys(getConfig("Password"));
		LoginPage.Login_editbox().click();
		
		String actualTitle=driver.getTitle();
		String expTitle=getConfig("Title Login");
		if(actualTitle.equals(expTitle))
		{
		Test.log(LogStatus.PASS, "My Expected Title:-"+ getConfig("build1")+"is matching with actual Url:"+ actualTitle);
		}
		else
		{
			Test.log(LogStatus.FAIL, "My expected Title:-"+ getConfig("build1")+"is not matching with actual Url:"+ actualTitle);
		}
	
	}
    public void Branches_Tc()
    {
    	AdminPage.Branches_btn().click();
    }
    
    public  void  branch_creation_Tc(String BranchName,String Address1,String Country,String State,String city,String Zipcode)
    {
      BranchesPage.NewBranch_btn().click();
      NewBranchEntryPage.BranchName_textfield().sendKeys(BranchName);
      NewBranchEntryPage.Address1_textfeild().sendKeys(Address1);
      Generic.Drop_Down(NewBranchEntryPage.Country_Dropdown(),Country );
      Generic.Drop_Down(NewBranchEntryPage.State_Dropdown(),State);
      Generic.Drop_Down(NewBranchEntryPage.City_Dropdown(),city);
      NewBranchEntryPage.Zipcode_textfeild().sendKeys(Zipcode);
      NewBranchEntryPage.Submit_btn().click();
      String Actvalue=driver.switchTo().alert().getText();
      String Expvalue=getConfig("Alert");
      if(Actvalue.equals(Expvalue))
		{
		Test.log(LogStatus.PASS, "My expected alert:-"+ getConfig("Alert")+"is matching with actual Alert msg:"+ Actvalue);
		Test.log(LogStatus.INFO, "Branch is created successfully"); 
		 barnchID=Actvalue.split(" ")[4];
         System.out.println(barnchID);
		}
		else
		{
			Test.log(LogStatus.FAIL, "My expected alert:-"+ getConfig("Alert")+"is not matching with Alert msg:"+ Actvalue);
		}
        
         
         driver.switchTo().alert().accept();
         
    }
    public void branch_search_Tc()
    {
    AdminPage.Branches_btn().click();
    Generic.Drop_Down(BranchesPage.Country_dropdown(), getConfig("Country"));
    Generic.Drop_Down(BranchesPage.State_dropdown(), getConfig("State"));
    Generic.Drop_Down(BranchesPage.City_dropdown(), getConfig("city"));
    BranchesPage.Search_btn().click();
    Table.table_handle(By.id("DG_bankdetails"), "edit", "539");

    }
public void  Roles_Tc()
{
AdminPage.Roles_btn().click();
}
public  void  Role_creation_Tc(String Rolename,String Roledesc ,String Roletype)
{
	AdminPage.Roles_btn().click();
	NewRoleEntry.Rolename_textfeild().sendKeys(Rolename);
	NewRoleEntry.Roledesc_textfeild().sendKeys(Roledesc);
	Generic.Drop_Down(NewRoleEntry.Roletype_Dropdown(),Roletype);
}
public void Role_search_Tc()
{
	
}
public void  Users_Tc()
{
AdminPage.User_btn().click();
}
public void User_creation_Tc(String RoleOfUser,String BranchofUser,String CustomerID,String CustomerName,String UserName,String LoginPassword,String TransactionPassword)
{
	AdminPage.User_btn().click();
	Generic.Drop_Down(NewUserEntry.RoleofUser_Dropdown(),RoleOfUser);
	Generic.Drop_Down(NewUserEntry.BranchofUser_Dropdown(), BranchofUser);
	Generic.Drop_Down(NewUserEntry.CustomerID_Dropdown(),CustomerID);
	NewUserEntry.CustomerName_textfeild().sendKeys(CustomerName);
    NewUserEntry.UserName_textfeild().sendKeys(UserName);
    NewUserEntry.LoginPassword_textfeild().sendKeys(LoginPassword);
    NewUserEntry.TransactionPassword_textfeild().sendKeys(TransactionPassword);
    
}
public void Employee_Tc()
{
	AdminPage.Employee_btn().click();
}
public void Employee_Creation_Tc(String EmployerName, String LoginPassword, String Role, String Branch)
{
  AdminPage.Employee_btn().click();
  NewEmployeeEntry.EmployerName_textfield().sendKeys(EmployerName);
  NewEmployeeEntry.LoginPassword_textfeild().sendKeys(LoginPassword);
  Generic.Drop_Down(NewEmployeeEntry.Role_DropDown(), Role);
  Generic.Drop_Down(NewEmployeeEntry.Branch_DropDown(), Branch);
}
}








