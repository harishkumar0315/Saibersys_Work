package Training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Writer;

import jxl.Workbook;

public class ExcelInTableFormat {

	public void readExcel(String filePath,String fileName,String sheetName)  throws IOException{
		// TODO Auto-generated method stub

		
File file = new File(filePath+"\\"+fileName);

//Create an object of FileInputStream class to read excel file

FileInputStream Harish = new FileInputStream(file);

Workbook guru99Workbook = null;
	
//Find the file extension by spliting file name in substring and getting only extension name

String fileExtensionName = fileName.substring(fileName.indexOf("."));

//Check condition if the file is xlsx file

if(fileExtensionName.equals(".xlsx")){
	
//If it is xlsx file then create object of XSSFWorkbook class
	
	guru99Workbook = new XSSFWorkbook(Harish);
	
}

// Check condition if the file is xls file

else if(file ExtensionName.equals(".xls")){

	//If it is xls file then create object of XSSFWorkbook class
	
	guru99Workbook = new HSSFWorkbook(Harish);
	
	
	}

//Read sheet inside the workbook by its name

Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

//Find no. of rows in excel file

int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

//Create a loop over all the rows of excel file to read it

for (int j=0;j<row.getLastCellNum(); j++){
	
	// Print excel data in console
	System.out.print(row.getCell(j).getStringCellValue()+"|");
}
System.out.println();
	}
}
//Main function is calling read Excel function to  read data from Excel file

public static void main(String...strings)throws IOException{
	
	//create a object of ReadGuru99ExcelFile class
	
	ExcelInTableFormat objExcelFile = new ExcelInTableFormat();
	
	objExcelFile.readExcel("C:\\Users\\HarishKumar\\Desktop\\Book1.xls", "Book1.xls");
	
	
			




}
