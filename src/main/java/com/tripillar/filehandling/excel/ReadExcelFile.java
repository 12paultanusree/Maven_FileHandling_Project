package com.tripillar.filehandling.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) {
        String filename = "example.xlsx";

        try (FileInputStream file = new FileInputStream(filename)) {
            // Open the workbook
            Workbook workbook = new XSSFWorkbook(file);
            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through the rows
            for (Row row : sheet) {
                System.out.print(row.getCell(0) + "\t");
                System.out.print(row.getCell(1) + "\t");
                System.out.println(row.getCell(2));
            }

            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
