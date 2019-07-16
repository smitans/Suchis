
package com.library.com.RanFordBank;

import org.testng.annotations.Test;

import excel.Excel_Class;

public class TestExecution extends Repository {

	@Test(priority=0)
	public void verify_launch()
	{
		launch();
	}
	@Test(priority=1)
	public void verify_login_Tc()
	{
		login_Tc();
	}
	@Test(priority=2)
	public void verify_Branches_Tc()
	{
			Branches_Tc();
		}
	
	@Test(priority=3)
	public void verify_branch_creation_Tc()
	{
		Excel_Class.excel_connection("dataexcel.xls", "Branches");
		for(int r=1;r<Excel_Class.getRows();r++) 
		{
			String BranchName = Excel_Class.readdata(0, r);
			String Address1 = Excel_Class.readdata(1, r);
			String Country = Excel_Class.readdata(2, r);
			String State = Excel_Class.readdata(3, r);
			String city = Excel_Class.readdata(4, r);
			 String Zipcode = Excel_Class.readdata(5, r);
		//String ID=branch_creation_Tc();
		branch_creation_Tc(BranchName,Address1,Country,State,city,Zipcode);
		}
	}
	@Test(priority=4)
	public void verify_branch_search_Tc()
	{
		branch_search_Tc();
	}
	
}
