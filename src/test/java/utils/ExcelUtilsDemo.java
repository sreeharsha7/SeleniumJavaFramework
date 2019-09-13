package utils;

public class ExcelUtilsDemo {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        //ExcelUtilsFromOutside excels = new ExcelUtilsFromOutside(projectPath+"/excel/data.xlsx", "Sheet1");

         ExcelUtilsFromOutside excel = new ExcelUtilsFromOutside("C:/Users/s.singamsetty/IdeaProjects/SeleniumJavaFramework/excel/data.xls", "Sheet1");


        excel.getRowCount();
        excel.getCellDataString(0,0);
        excel.getCellDataNumber(1,1);

    }




}
