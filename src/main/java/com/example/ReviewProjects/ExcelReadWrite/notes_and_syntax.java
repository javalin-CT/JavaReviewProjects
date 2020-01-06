package com.example.ReviewProjects.ExcelReadWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;



public class notes_and_syntax {
    public static void main(String[] args) throws IOException {

        //HOW TO READ AND WRITE INTO EXCEL
        String filePath = "/home/jcwcoding/workspace/Java/Excel/TD.xlsx"; //path to the excel file

        String sheetName = "Sheet1"; // name of the sheet we are accessing

        FileInputStream file = new FileInputStream(filePath); //reads the file

        Workbook excelFile = WorkbookFactory.create(file);
        // work book is specially designed for excel files
        // creates a link for java to the excel file

        Sheet sheet = excelFile.getSheet(sheetName); //gets the particular sheet

        Cell cell = sheet.getRow(1).getCell(0);

        //how to write
        cell.setCellValue("I dunno");

        //how to read
        String cellData = cell.toString();
        System.out.println(cellData);


    }
}
