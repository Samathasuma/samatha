package WebElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwithDynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.dezlearn.com/webtable-example/");
           
           WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
           
           //number of rows
           List<WebElement> rows = table.findElements(By.tagName("tr"));
           System.out.println("Number of rows = "+rows.size());
           
           System.out.println("--------------------------------------------------------------");
           
           //number of heads
           List<WebElement> heads = table.findElements(By.tagName("th"));
           System.out.println("Number of heads = "+heads.size());
           
           for(WebElement head : heads) {
        	   System.out.println(head.getText());
           }

           System.out.println("---------------------------------------------------------------");
           
           List<WebElement> cols = table.findElements(By.tagName("td"));
           System.out.println("Number of colums = "+cols.size());
           
           for(WebElement col : cols) {
           System.out.println(col.getText());
           }
           
           System.out.println("----------------------------------------------------------------");
           
           for(int n=1;n<rows.size();n++) {
        	   List<WebElement> col = rows.get(n).findElements(By.tagName("td"));
        	   System.out.println(n+" "+"row cols are = "+col.size());
           }
           System.out.println("------------------------------------------------------------------");
           
           for(int i=1;i<rows.size();i++) {
        	   List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
        	   for(int j=0;j<col.size();j++) {
        		   
        	   System.out.println(col.get(j).getText()+" | ");
        	   if(i==1&&j==2) {
        		   col.get(j).findElement(By.tagName("input"));
        	   }
        	   else if(i==1&&j==0) {
        		   System.out.println(col.get(j).getText());
        	   }
        	   else if(i==2&&j==1) {
        		   System.out.println(col.get(j).getText());
        	   }
        	   else if(i==3&&j==2) {
        		   col.get(j).findElement(By.tagName("input")).click();
        	   }
        	   else if(i==4&&j==3) {
        		   col.get(j).findElement(By.tagName("input")).click();
        	   }
        	   else if(i==5&&j==4) {
        		   WebElement ele = col.get(j).findElement(By.tagName("select"));
        		   Select select = new Select(ele);
        		   select.selectByVisibleText("Sports");
        		   
        	   }
        	else if(i==6&&j==5) {
        		   col.get(j).findElement(By.tagName("input")).sendKeys("average");
        	   }   
        	   }
        	   
        	   }
           }

}
