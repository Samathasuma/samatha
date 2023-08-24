package WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.AJIO.com/");
		driver.manage().window().maximize();
		
		List<WebElement> element = driver.findElements(By.className("alignTag"));
		System.out.println("the count of text = " +element.size());
		
		System.out.println("the test of = " +element.get(0).getText());
		
		for(int i = 0; i<element.size();i++) {
			System.out.println(" the text of = " +element.get(i).getText());
		}
	}

}
