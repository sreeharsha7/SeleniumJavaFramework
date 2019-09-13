package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static String projectPath ;
    static XSSFWorkbook workbook ;
    static XSSFSheet sheet ;


    public ExcelUtils(String excelPath, String sheetName) {
        try {

            projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        }catch (Exception e){
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        //getRowCount();
        getCellDataString(0,0);
        getCellDataNumber(1,1);
    }


    public static int getRowCount()    {
        int rowCount = 0;

        try {



            rowCount = sheet.getPhysicalNumberOfRows();
            //System.out.println("No of Rows" +rowCount);


        }catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

        return rowCount;

    }

    public static int getColCount()    {
        int colCount = 0;

        try {



            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            //System.out.println("No of rows: " + colCount);


        }catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

        return  colCount;

    }

    public static String getCellDataString(int rowNum, int colNum) {
        String cellData = null;

        try {

            //projectPath = System.getProperty("user.dir");
            //workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
            //sheet = workbook.getSheet("Sheet1");
            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);
        }catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

        return cellData;

    }

    public static void getCellDataNumber(int rowNum, int colNum) {
        try {

            //projectPath = System.getProperty("user.dir");
            //workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
            //sheet = workbook.getSheet("Sheet1");
           double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);
        }catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

    }


}

*/


// import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsColumnCount {
    //static String projectPath ;
    static XSSFWorkbook workbook ;
    static XSSFSheet sheet ;

    ExcelUtilsColumnCount(String excelPath, String sheetName){

        try {
            //projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);

        }catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();


        }


    }



    public static void main(String[] args) {
        getRowCount();
        getColCount();
        getCellDataString(0,0);
        getCellDataNumber(1,1);

    }

    public  static int getRowCount() {
        int rowCount = 0;


        try {

            //projectPath = System.getProperty("user.dir");
            //workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
            //sheet = workbook.getSheet("Sheet1");

            rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("No of rows  :"+rowCount);

        }
        catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

        return rowCount;



    }



    public  static int getColCount() {

        int colCount = 0;

        try {

           // projectPath = System.getProperty("user.dir");

            // workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
            // sheet = workbook.getSheet("Sheet1");
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("No of columns  :"+colCount);

        }
        catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

        return colCount;



    }


    public static String getCellDataString(int rowNum, int colNum) {
            String cellData = null;
        try {
            //projectPath = System.getProperty("user.dir");
            //workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
            //sheet = workbook.getSheet("Sheet1");
            cellData =  sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            System.out.println(cellData);

        }

        catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }
        return  cellData;

    }

    public static void getCellDataNumber(int rowNum, int colNum) {

        try {
            //projectPath = System.getProperty("user.dir");
            //workbook = new XSSFWorkbook(projectPath + "\\excel\\data.xlsx");
            //sheet = workbook.getSheet("Sheet1");
            Double cellData =  sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);

        }

        catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

    }



}