package excel;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import testBase.Base;

public class Excel_Class extends Base{
static String Folderpath= getConfig("excelfolderpath");
static Sheet sh;
public static void excel_connection(String Filename,String sheetname)
{
	try {
	File f= new File(Folderpath+Filename);
		Workbook wb = Workbook.getWorkbook(f);
		
	 sh = wb.getSheet(sheetname);
	} catch (Exception e) {
		e.printStackTrace();
	
}
}
public static int getRows()
{
	int rows=sh.getRows();
    return rows;
}
public static int getColumns()
{
	int cols=sh.getRows();
    return cols;
}
public static String readdata(int cols,int rows)
{
	String data = sh.getCell(cols,rows).getContents();
	return data;
}
}