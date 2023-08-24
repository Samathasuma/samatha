package com.qa.baisc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo {

	public static void main(String[] args) throws InterruptedException {

		
		//program to launch browser automaticaly with using automationscript
		
		//drivers are found in our system we need to give path to the script\
		//  static key to open chrome browser : webdriver.chrome.driver
		
		System.setProperty("webdriver.chrome.driver","F:\\for_javaprograms\\My first project\\selenium basics\\drivers\\chromedriver.exe");
		
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		
		//use manage method and maximize
		driver.manage().window().maximize();
		
		//use get and open one url
		driver.get("https://www.google.com/");
		
		//use navigate and open another url
		driver.navigate().to("http://www.facebook.com/");
		
		//use get current url and print url
		String url =driver.getCurrentUrl();
		System.out.println("the url of the page is ="+url);

		//use get window handle
		String window=driver.getWindowHandle();
		
		//use switch to and open the new tab open AJIO
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.AJIO.com/");
		
		//use close
		driver.close();
		
		//use quit
		Thread.sleep(3000);
		driver.quit();
	}

}
