package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class AdminPage extends Base {
	 public static WebElement Branches_btn()
	 {
		return  driver.findElement(getElement("Branches"));
	 }
	 public static WebElement Roles_btn()
	 {
		return driver.findElement(getElement("Roles"));
	 }
	 public static WebElement User_btn()
	 {
		 return driver.findElement(getElement("Users"));
	 }
	 public static WebElement Employee_btn()
	 {
		 return driver.findElement(getElement("Employee"));
	 }
}
