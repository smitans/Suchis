package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class NewUserEntry extends Base {
	public static WebElement RoleofUser_Dropdown()
	 {
		 return driver.findElement(getElement("RoleofUser"));
	 }
	public static WebElement BranchofUser_Dropdown()
	 {
		 return driver.findElement(getElement("BranchofUser"));
	 }
	public static WebElement CustomerID_Dropdown()
	 {
		 return driver.findElement(getElement("Customer"));
	 }
	public static WebElement CustomerName_textfeild()
	 {
		 return driver.findElement(getElement("CustomerName"));
	 }
	public static WebElement UserName_textfeild()
	 {
		 return driver.findElement(getElement("UserName"));
	 }
	public static WebElement LoginPassword_textfeild()
	 {
		 return driver.findElement(getElement("LoginPassword"));
	 }
	public static WebElement TransactionPassword_textfeild()
	 {
		 return driver.findElement(getElement("TransactionPassword"));
	 }
	
}
