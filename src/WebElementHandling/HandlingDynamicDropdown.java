package WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\for_javaprograms\\My first project\\selenium basics\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("flowers");
		
		Thread.sleep(2000);
		
		//how many dropdowns we got
	List<WebElement> options = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	System.out.println(options.size());	
		
	//how to get the all elements text inside the dropdown
	for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
	}
	}

}
