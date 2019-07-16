package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class NewEmployeeEntry extends Base {
	public static WebElement EmployerName_textfield()
	 {
		 return driver.findElement(getElement("Employer"));
	 }
	 public static WebElement LoginPassword_textfeild()
	 {
		 return driver.findElement(getElement("LoginPassword"));
	 }
	 public static WebElement Role_DropDown()
	 {
		 return driver.findElement(getElement("Role"));
	 }
	 public static WebElement Branch_DropDown()
	 {
		 return driver.findElement(getElement("Branch"));
	 }
}
