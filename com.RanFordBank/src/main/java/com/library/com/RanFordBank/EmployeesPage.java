package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class EmployeesPage extends Base {
	 public static WebElement Home_btn()
	 {
		 return	 driver.findElement(getElement("Home"));
	 }
	 public static WebElement ChangePassword_btn()
	 {
		 return driver.findElement(getElement("ChangePassword"));
	 }
	 public static WebElement Logout_btn()
	 {
		 return driver.findElement(getElement("Logout"));
	 }
	 public static WebElement NewEmployee_btn()
	 {
		 return driver.findElement(getElement("NewEmployee"));
	 }
}
