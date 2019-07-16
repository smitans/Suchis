package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class LoginPage extends Base {
 public static WebElement UserName_editbox()
 {
	return driver.findElement(getElement("UserName"));
 }
 public static WebElement Password_editbox()
 {
	return driver.findElement(getElement("Password"));
 }
 public static WebElement Login_editbox()
 {
	return driver.findElement(getElement("Login"));
 }
}
