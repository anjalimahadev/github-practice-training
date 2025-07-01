package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author anjali
 */
public class ExcelUtility {
	/**
	 * This method is used to read data from excel file in string format
	 * @param sheetName
	 * @param rowIndex
	 * @param cloumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName, int rowIndex, int cloumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cloumnIndex).getStringCellValue();
	}
	/**
	 * This method is used to read data from excel file in Boolean format
	 * @param sheetName
	 * @param rowIndex
	 * @param cloumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public Boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int cloumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cloumnIndex).getBooleanCellValue();
	}
	/**
	 * This method is used to read data from excel file in numeric format
	 * @param sheetName
	 * @param rowIndex
	 * @param cloumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumericDataFromExcel(String sheetName, int rowIndex, int cloumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cloumnIndex).getNumericCellValue();
	}
	/**
	 * This method is used to read data from excel file in Timedate format
	 * @param sheetName
	 * @param rowIndex
	 * @param cloumnIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getDateAndTimeDataFromExcel(String sheetName, int rowIndex, int cloumnIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cloumnIndex).getLocalDateTimeCellValue();
	}
}
