package ApachePOI.resource;

import Pages.DialogContent_Mert;
import Pages.ParentPage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelLogin_Mert {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("UsernameAndPassword");

        Row newRow = sheet.createRow(0);
        Cell newCell = newRow.createCell(0);
        newCell.setCellValue("Username:");
        Cell newCell1 = newRow.createCell(1);
        newCell1.setCellValue("TestTitans2@example.com");

        Row newRow1 = sheet.createRow(1);
        Cell newCell2 = newRow1.createCell(0);
        newCell2.setCellValue("Password:");
        Cell newCell3 = newRow1.createCell(1);
        newCell3.setCellValue("Passw0rd");

        String path = "src/test/java/ApachePOI/resource/UsernameAndPassword.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }

    public static void excelWord(WebElement emailInput, WebElement passwordInput) throws IOException {
        String path = "src/test/java/ApachePOI/resource/UsernameAndPassword.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("UsernameAndPassword");

        DialogContent_Mert dcm = new DialogContent_Mert();
        String searchWord = "Username:";
        String searchWord1 = "Password:";

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchWord)) {

                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    dcm.mySendKeys(emailInput, String.valueOf(sheet.getRow(0).getCell(1)));
                }
            }

                if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchWord1)) {

                    for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                        dcm.mySendKeys(passwordInput, String.valueOf(sheet.getRow(1).getCell(1)));

                    }
                }
        }
    inputStream.close();
    }
}


