package HandlingFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithFileupload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		
		WebElement upload = driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoview;", upload);
		
		Thread.sleep(3000);
		
		upload.click();
		
		String path = "C:\\Users\\DELL\\OneDrive\\Desktop\\programs\\samatha.pdf";
		StringSelection select = new StringSelection(path);
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(select, select);
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.delay(3000);
		 
		robo.keyPress(KeyEvent.VK_CONTROL);.
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
