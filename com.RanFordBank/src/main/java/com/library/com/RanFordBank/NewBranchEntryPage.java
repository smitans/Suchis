package com.library.com.RanFordBank;

import org.openqa.selenium.WebElement;

import testBase.Base;

public class NewBranchEntryPage extends Base {
	 public static WebElement BranchName_textfield()
	 {
		 return driver.findElement(getElement("BranchName"));
	 }
	 public static WebElement Address1_textfeild()
	 {
		 return driver.findElement(getElement("Address1"));
	 }
	 public static WebElement Address2_textfeild()
	 {
		 return driver.findElement(getElement("Address2"));
	 }
	 public static WebElement Address3_textfeild()
	 {
		 return driver.findElement(getElement("Address3"));
	 }
	 public static WebElement Area_textfeild()
	 {
		 return driver.findElement(getElement("Area"));
	 }
	 public static WebElement Zipcode_textfeild()
	 {
		 return driver.findElement(getElement("Zipcode"));
	 }
	 public static WebElement Country_Dropdown()
	 {
		 return driver.findElement(getElement("Country"));
	 }
	 public static WebElement State_Dropdown()
	 {
		 return driver.findElement(getElement("State"));
	 }
	 public static WebElement City_Dropdown()
	 {
		 return driver.findElement(getElement("City"));
	 }
	 public static WebElement Submit_btn()
	 {
		 return driver.findElement(getElement("Submit"));
	 }
}
