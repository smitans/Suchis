package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class NewRoleEntry extends Base{
	 public static WebElement Rolename_textfeild()
	 {
		 return driver.findElement(getElement("Rolename"));
	 }
	 public static WebElement Roledesc_textfeild()
	 {
		 return driver.findElement(getElement("Roledesc"));
	 }
	 public static WebElement Roletype_Dropdown()
	 {
		 return driver.findElement(getElement("Roletype"));
	 }
}
