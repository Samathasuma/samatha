package WebElementHandling;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Found_It_page_task {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in");
		
		String curr_win = driver.getWindowHandle();
		System.out.println("the window name is :" +curr_win);
		
		driver.findElement(By.xpath("//a[@class='addPrimaryTextColor']")).click();
		driver.findElement(By.xpath("//div[@class='googleTab socialLoginTab']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("no of windows opened = " + allWindows.size());
		System.out.println(allWindows);
		
		for(String child : allWindows)
		{
			if(!allWindows.equals(curr_win))
			{ 
				driver.switchTo().window(child);
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("samatha");
		
		TakesScreenshot screenshort = (TakesScreenshot) driver;
		File source = screenshort.getScreenshotAs(OutputType.FILE);
         File destination = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\screenshort\\founditScreenshot.png");
		Files.copy(source, destination);
	}

}
