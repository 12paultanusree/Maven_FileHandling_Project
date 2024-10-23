package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args) {
        String filename = "example.xlsx";

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Data");

            // Create a row and put some cells in it.
            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("Name");
            row.createCell(1).setCellValue("Age");
            row.createCell(2).setCellValue("Occupation");

            Row row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Alice");
            row1.createCell(1).setCellValue(30);
            row1.createCell(2).setCellValue("Engineer");

            // Write the output to a file
            try (FileOutputStream fileOut = new FileOutputStream(filename)) {
                workbook.write(fileOut);
                System.out.println("Excel file has been written successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
