package Training;

import java.io.File;
import java.io.FileInputStream;

import jxl.Workbook;

public class Writeexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		public class Writeexcel {

		    

		    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

		    //Create a object of File class to open xlsx file

		    File file =    new File(filePath+"\\"+fileName);

		    //Create an object of FileInputStream class to read excel file

		    FileInputStream inputStream = new FileInputStream(file);

		    Workbook guru99Workbook = null;

		    //Find the file extension by spliting file name in substring and getting only extension name

		    String fileExtensionName = fileName.substring(fileName.indexOf("."));

		    //Check condition if the file is xlsx file

		    if(fileExtensionName.equals(".xlsx")){

		    //If it is xlsx file then create object of XSSFWorkbook class

		    guru99Workbook = new XSSFWorkbook(inputStream);

		    }

		    //Check condition if the file is xls file

		    else if(fileExtensionName.equals(".xls")){

		        //If it is xls file then create object of XSSFWorkbook class

		        guru99Workbook = new HSSFWorkbook(inputStream);

		    }

		    //Read sheet inside the workbook by its name

		    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

		    //Find number of rows in excel file

		    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

		    //Create a loop over all the rows of excel file to read it

		    for (int i = 0; i < rowCount+1; i++) {

		        Row row = guru99Sheet.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print excel data in console

		            System.out.print(row.getCell(j).getStringCellValue()+"| ");

		        }

		        System.out.println();

		    }

		    

		    }

		    

		    //Main function is calling readExcel function to read data from excel file

		    public static void main(String...strings) throws IOException{

		    //Create a object of ReadGuru99ExcelFile class

		    Writeexcel objExcelFile = new Writeexcel();

		    //Prepare the path of excel file
		     //Call read file method of the class to read data

		    objExcelFile.readExcel("C:\\Users\\HarishKumar\\Desktop\\Book1.xls","Book1.xlsx","Sheet1");

		    }

		}
		
	}

}
