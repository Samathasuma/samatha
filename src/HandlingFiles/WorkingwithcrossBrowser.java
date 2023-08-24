package HandlingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithcrossBrowser {
	
	//class variable / instance
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
           File f = new File("F:\\for_javaprograms\\My first project\\selenium basics\\properties\\browser.properties");
		
		//read the data
		FileInputStream fis = new FileInputStream(f);
		
		//To handle the properties file
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserValue = prop.getProperty("browser");
		System.out.println("The brower is =" +browserValue);
		
		if(browserValue.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(browserValue.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			
		}
		
		else if(browserValue.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("the browser is not found");
		}
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.xpath(prop.getProperty("userpath"))).sendKeys(prop.getProperty("value"));
		//driver.findElement(By.xpath(prop.getProperty("passpath"))).sendKeys(prop.getProperty("password"));
	}

}
