
package sections;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.node.locators.ById;
import org.openqa.selenium.interactions.Actions;

public class Asection {
	
	public static void main(String[]args) throws InterruptedException, AWTException, IOException {
		// for thread sleep
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace\\Sections\\LIBRARY\\chromedriver.exe");		
	    WebDriver Driver = new ChromeDriver();
	    String url = "https://amazon.com";
	    
	    
	    Driver.navigate().to(url);
        Driver.manage().window().maximize();
//        Driver.findElement(By.name("alertbox")).click();
//        Alert A = Driver.switchTo().alert();
//        A.accept();
//        Driver.findElement(By.xpath("//button[contains(text(),'Confirm Alert Box')]")).click();
//        A.dismiss();
//        Driver.findElement(By.xpath("//button[contains(text(),'Prompt ')]")).click();
//        A.sendKeys("Yes");
//        String T = A.getText();
//        System.out.println(T);
//        A.accept(); 
//        TakesScreenshot ts = (TakesScreenshot)Driver;
//        File Source = ts.getScreenshotAs(OutputType.FILE); 
//        File Dest = new File("C:\\Users\\HEMU\\eclipse-workspace\\Sections\\Screenshot\\image");
//        FileUtils.copyFile(Source, Dest);//        
          //  WebElement username=Driver.findElement(By.xpath("//input[@type='text']"));
//        Actions A = new Actions(Driver);
//        A.contextClick(username).build().perform();
//        Robot R = new Robot();
//        for(int i=0;i<2;i++) {
//        	R.keyPress(KeyEvent.VK_DOWN);
//        	R.keyRelease(KeyEvent.VK_DOWN);    	
//        }
//        Thread.sleep(5000);
//        R.keyPress(KeyEvent.VK_ENTER);
//        R.keyRelease(KeyEvent.VK_ENTER);
//        
        
        
//	    Thread.sleep(5000);
//	    WebElement Drag1=Driver.findElement(By.xpath("(//a[contains(text(),'BANK')]"));
//	    WebElement Drop1=Driver.findElement(By.xpath("//li[@class='placeholder'])[1]"));
//	    WebElement Drag2=Driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//	    WebElement Drop2=Driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//	    WebElement Drag3=Driver.findElement(By.xpath("//a[@class='button button-orange'])[6]"));
//	    WebElement Drop3=Driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//	    WebElement Drag4=Driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//	    WebElement Drop4=Driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//	    Actions A = new Actions(Driver);
//	    Thread.sleep(5000);
//	    A.dragAndDrop(Drag1, Drop1).build().perform();
////	    Thread.sleep(3000);
//	    A.dragAndDrop(Drag2, Drop2).build().perform();
//	    Thread.sleep(3000);
//	    A.dragAndDrop(Drag3, Drop3).build().perform();
//	    Thread.sleep(3000);
//	    A.dragAndDrop(Drag4, Drop4).build().perform();
        
        
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   // WebElement signin = Driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
	    
//	   WebElement username = Driver.findElement(By.id("email"));
//	    username.sendKeys("Hemanth@3123");
//	    WebElement password = Driver.findElement(By.xpath("//input[@type='password']"));
//	    password.sendKeys("hemu3123");
//	    
//	    String attribute = username.getAttribute("value");
//	    if(attribute.equals("Hemanth@3123")){
//	    	System.out.println("Accepting");
//	    	
//	    }
//	    WebElement text =Driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
//	    String t = text.getText();
//	    System.out.println(t);
//		List <WebElement> tag1 =Driver.findElements(By.tagName("input"));
//	    System.out.println(tag1.size());
//	    
//	    WebElement forgot = Driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//	    forgot.click();

//	    Actions A = new Actions(Driver);
//	    A.contextClick(username).build().perform();
//	    Thread.sleep(3000);
//	    A.doubleClick(password).build().perform();
//	    A.moveToElement(signin).perform();
//	   
		}
	}
		

