package sections;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsJava {
	

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace\\Sections\\LIBRARY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url1 = "https://www.flipkart.com";
		driver.navigate().to( url1);
		String Gurl =driver.getCurrentUrl();
		System.out.println(Gurl);
		if(Gurl.equals(url1)) {
			System.out.println("Equals");
		}
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement type=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(3000);
		WebElement Scrolldown=driver.findElement(By.xpath("//span[contains(text(),'Help Center')]"));
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','mobiles')", type);
		Object tex=js.executeScript("return arguments[0].getAttribute('value')", type);
	
		System.out.println(tex);
		//Thread.sleep(3000);
		//js.executeScript("arguments[0].scrollIntoView(true)", Scrolldown);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", search);
		
		
		
		
		
		
		
		
		
		
		
	//	F1.click();	
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
//		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
//		String Parent = driver.getWindowHandle();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
//		driver.switchTo().window(Parent);
//		Set<String> Child = driver.getWindowHandles();
//		driver.switchTo().window(Parent);
//		Thread.sleep(3000);
//		
//		List<String> Childs = new ArrayList<String>(Child);
//		
//		String child1 = Childs.get(2);
//		driver.g
//		
//		Childs.addAll(Child);
//		System.out.println(Childs);
		
		
		
		
		
		
		
		
		
		
		
//		WebElement dd1 = driver.findElement(By.xpath("//select[@id='first']"));
//		WebElement dd2 = driver.findElement(By.xpath("//select[@id='animals']"));
//		WebElement dd3 = driver.findElement(By.xpath("//select[@id='second']"));
//		// dropdown
//		Select S = new Select(dd3);
//		Boolean B = S.isMultiple();
//		System.out.println(B);
//		S.selectByIndex(0);
//		Thread.sleep(2000);
//		S.selectByIndex(1);
//		Thread.sleep(2000);
//		S.selectByIndex(2);
//		Thread.sleep(2000);
//		S.selectByIndex(3);
//		WebElement Animals = S.getFirstSelectedOption();
//		String text = Animals.getText();
//		System.out.println(text);
//		S.deselectByIndex(2);
//		List <WebElement> all = S.getAllSelectedOptions();
//		for(int i=0;i<all.size();i++) {
//			WebElement allopt = all.get(i);
//			String AT = allopt.getText();
//			System.out.println(AT);
//			
//			
//		
//		}
//		List<WebElement> Options = S.getOptions();
//		for (int i=0;i<Options.size();i++) {
//			WebElement Index = Options.get(i);
//			String Text = Index.getText();
//			System.out.println(Text);
//		}
//		
	//	S.selectByIndex(1);
	//	S.selectByVisibleText("Iphone");
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.close();
//		WebElement product = driver.findElement(By.xpath("//input[@type='text']"));
//		WebElement signin = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-topbar-menu-button-renderer'])[1]"));
//		product.sendKeys("tamilvideosongs");
//		Thread.sleep(3000);
//		Actions a = new Actions(driver);
//		a.contextClick(product).build().perform();
//		Robot R = new Robot();
//		Thread.sleep(3000);
//
//		for(int i=0;i<3;i++) {
//			R.keyPress(KeyEvent.VK_DOWN);
//			R.keyRelease(KeyEvent.VK_DOWN);			
//		}
//		Thread.sleep(3000);
//		R.keyPress(KeyEvent.VK_ENTER);
//		R.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(3000);
//		a.moveToElement(signin).perform();
//		
//		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Naattu Koothu')])[1]"));
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//*[text()='Home']"));
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File Source = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\HEMU\\eclipse-workspace\\Sections\\Screenshot\\img");
//		FileUtils.copyFile(Source, dest);
//		
//		Actions a = new Actions(driver);
//		a.doubleClick(product).build().perform();
//		

		
		
	
	}
	

}
