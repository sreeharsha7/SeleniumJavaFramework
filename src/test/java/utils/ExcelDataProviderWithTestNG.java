package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderWithTestNG{

    @Test(dataProvider = "test1Data")
    public void test1(String username, String password){
        System.out.println(username+ " "+password);

    }



    @DataProvider(name = "test1Data")
    public Object[][] getData(){
        String excelPath = "C:/Users/s.singamsetty/IdeaProjects/SeleniumJavaFramework/excel/data.xlsx";
        Object data[][] =  testData(excelPath, "Sheet1");
        return data;
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

