package utils;

public class ExcelDataProvider1 {

    public static void main(String[] args) {
        String excelPath = "C:/Users/s.singamsetty/IdeaProjects/SeleniumJavaFramework/excel/data.xlsx";
        testData(excelPath, "Sheet1");

    }


    public static Object[][] testData(String excelPath, String sheetName) {

        ExcelUtilsColumnCount excel = new ExcelUtilsColumnCount(excelPath, sheetName);

        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();


        Object data[][] = new Object[rowCount-1][colCount];


        for(int i=1; i<rowCount; i++) {
            for (int j = 0; j < colCount; j++) {

                String cellData = excel.getCellDataString(i, j);
                System.out.print(cellData+" | ");
               data[i - 1][j] = cellData;

            }
            System.out.println();
        }
            return data;
    }


}
