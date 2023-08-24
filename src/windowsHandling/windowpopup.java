package windowsHandling;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup {
 
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='addprimaryTextcolor']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("//div[@class='googleTab socialLoginTab']")).click();
		Thread.sleep(5000);
		
		//how many windows open in the page
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(" the windows open in page is= " +allwindows.size());
		System.out.println(allwindows);
		
		for(String child : allwindows) {
			if(!allwindows.equals(parent)) {
				driver.switchTo().window(child);
			
		}
		}
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("samatha");
	 Thread.sleep(3000);
	 
	 TakesScreenshot tk = (TakesScreenshot) driver;
	 File src = tk.getScreenshotAs(OutputType.FILE);
	File dst = new File("F:\\selenium_programs\\ScreenShot\\foundit.png");
	 Files.copy(src, dst);
}
}