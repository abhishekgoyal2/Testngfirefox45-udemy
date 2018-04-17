package testingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Propertyfile {
	public WebDriver driver;
	@Test
	public void Login() throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Abhishek\\eclipse-workspace\\TestNGTutorial-1\\TestNGTutorial\\src\\testingFiles\\datadriven.properties"); 
	
	prop.load(fis);
	if(prop.getProperty("browser").equals("firefox"))
	{
		 driver=new FirefoxDriver();
	}
	if(prop.getProperty("browser").equals("chrome"))
	{
		 driver=new ChromeDriver();
	}
	else
	{
		 driver=new InternetExplorerDriver();
	}
	
	driver.get(prop.getProperty("url	"));
	System.out.println(prop.getProperty("username"));
	}
	
}
