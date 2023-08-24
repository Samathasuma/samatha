package windowsHandling;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithMultiplewindows {
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.naukri.com/");
	 String parent = driver.getWindowHandle();
	 System.out.println(parent);
	 
	 driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']")).click();
	 
	 //how many windows opened in the page
	 Set<String> allWindows = driver.getWindowHandles();
	 System.out.println("no of windows opened="+allWindows.size());
	 System.out.println(allWindows);
	 
	 for(String child : allWindows) {
		 if(!allWindows.equals(parent)) {
			 driver.switchTo().window(child);
		 }
	 }
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("samatha");
 }
}
