package config;

import java.io.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

//import static config.PropertiesFile.projectPath;

public class PropertiesDemoFile {

    static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");

    public static void main(String[] args) {
        getDemoProperties();
        setDemoProperties();
        //getDemoProperties();
    }


    public static void getDemoProperties()  {

        try {


            InputStream input_demo = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
            prop.load(input_demo);
            String browser = prop.getProperty("browser");
            System.out.println(browser);

        }

        catch (Exception exp) {
            System.out.println(exp.getMessage());
            //System.out.println(exp.getCause());
            exp.printStackTrace();

    }

}
    public static void setDemoProperties()  {

        try {

            OutputStream output_demo = new FileOutputStream(projectPath + "/src/test/java/config/configDemo.properties");

            prop.setProperty("browser", "chrome");
            prop.store(output_demo, null);
            //System.out.println(browser);

        }

        catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();

        }

}

}

