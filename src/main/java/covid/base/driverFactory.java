package covid.base;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {
	
	public static Properties prop;
	public FileInputStream fis;
	protected static WebDriver driver;

	public driverFactory() throws IOException{
		prop = new Properties();
		
		fis = new FileInputStream("C:\\Users\\Abinash\\eclipse-workspace\\covid19\\src\\main\\java\\covid\\properties\\config.properties");
	
		prop.load(fis);
	}
	
	public static void startBrowser() {
		
		String Browser = prop.getProperty("browser");
		
		if(Browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (Browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else {
			System.out.println("No Browser");
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
	}

	

}
