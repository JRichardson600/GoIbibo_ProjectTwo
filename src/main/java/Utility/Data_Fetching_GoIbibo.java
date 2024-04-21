package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Data_Fetching_GoIbibo {

	public static String mob_1;
	public static String mob_2;
	public static String mob_3;
	public static String password_1;

	public void fetch() throws EncryptedDocumentException, IOException, InterruptedException {
		//System.out.println("Data_Fetching_GoIbibo");
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Richard\\eclipse-workspace\\GoIbibo\\ExcelSheet_1\\GoIbibo.xlsx");// location
		Workbook wb = WorkbookFactory.create(f1);
		mob_1 = NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(1).getCell(0).getNumericCellValue());
		//System.out.println("mob_1 : " + mob_1);
//		mob_2 = NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(1).getCell(1).getNumericCellValue());
//		mob_3 = NumberToTextConverter.toText(wb.getSheet("LoginDetails").getRow(1).getCell(2).getNumericCellValue());
		// password_1 =
		// wb.getSheet("LoginDetails").getRow(1).getCell(0).getStringCellValue();

	}
}
