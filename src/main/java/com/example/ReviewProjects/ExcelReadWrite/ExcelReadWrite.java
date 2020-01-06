package com.example.ReviewProjects.ExcelReadWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ExcelReadWrite {

    String filePath;
    String sheetName;
    FileInputStream file;
    Workbook excelFile;
    Sheet sheet;
    Cell cell;

    public ExcelReadWrite(String filePath, String sheetName){
        this.filePath = filePath;
        this.sheetName = sheetName;

        try{
            file = new FileInputStream(filePath);
            excelFile = WorkbookFactory.create(file);
            sheet = excelFile.getSheet(sheetName);
        }catch (Exception e){
        }
    }

    public String readData(int rowNum, int cellNum){
        String data = "";
        cell = sheet.getRow(rowNum).getCell(cellNum);
        data = cell.toString();
        return data;
    }
    public void writeData(int rowNum, int cellNum, String setValue){
        cell = sheet.getRow(rowNum).getCell(cellNum);
        cell.setCellValue(setValue);
    }
}
