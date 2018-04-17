package testingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Propertyfile {
	public WebDriver driver =null;
	File file =new File("C:\\Users\\Abhishek\\eclipse-workspace\\TestNGTutorial-1\\TestNGTutorial\\src\\testingFiles\\datadriven.properties");
	Properties prop =new Properties();
	

	@Test
	public void Login() throws InterruptedException 
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
		 driver=new FirefoxDriver();
		 System.out.println("pass");
	}
//	if(prop.getProperty("browser")=="chrome")
//	{
//		 driver=new ChromeDriver();
//	}
//	else
//	{
//		 driver=new InternetExplorerDriver();
//	}
	
//	driver.get(prop.getProperty("url"));
//	Thread.sleep(500);
//	System.out.println(prop.getProperty("url"));
//	System.out.println(prop.getProperty("browser"));

	}
	
}
