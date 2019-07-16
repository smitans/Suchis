package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testBase.Base;

public class Table extends Base {
	static boolean status=false;
	public static void table_handle(By prop ,String operation,String id)
	{
		boolean flag=false;
		try {
			WebElement table=driver.findElement(prop);
			
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			
			String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
			
			for(int i=1;i<pagelinks.length;i++)
			{
				try {
					if(pagelinks[i].contains("...") && status==true)
					{
						driver.findElement(By.xpath("//a[text()='...'][2]")).click();
					}
					else
					{
						table.findElement(By.linkText(pagelinks[i])).click();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(pagelinks[i].contains("..."))
				{
					status=true;
					table_handle(prop, operation, id);
				}
				table=driver.findElement(By.id("DG_bankdetails"));
				 rows=table.findElements(By.tagName("tr"));
				 for(WebElement r:rows)
				 {
					 List<WebElement> columns= r.findElements(By.tagName("td"));
					 
					 for(WebElement c:columns)
					 {
						 if(c.getText().contains("145"))
						 {
							 if(operation.equals("edit"))
							 {
								 columns.get(columns.size()-2).findElement(By.tagName("a")).click();
							 }
							 else if(operation.equals("delete"))
							 {
								 columns.get(columns.size()-1).findElement(By.tagName("a")).click();
							 }
							 flag=true;
							 break;
						 }
					 }
					 if(flag==true)
					 {
						 break;
					 }
				 }
				 if(flag==true)
				 {
					 break;
				 }
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
