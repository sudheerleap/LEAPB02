package autoit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadTest {
	WebDriver driver;
  @Test
  public void upload() throws Exception {
	WebElement  focus= driver.findElement(By.xpath("//*[@id=\"pick-files\"]/span[2]"));
	 focus.click();
	 Thread.sleep(2000);
	 //focus.sendKeys ("C:\\Users\\edu1\\Desktop\\Sanjay ramaswami.pdf");
	 Runtime.getRuntime().exec("C:\\Users\\edu1\\git\\SELENIUM\\fileupload.exe");
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("D:\\SELENIUM WORKSPACE\\screenshots\\fileupload.png"));
 }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DUMP\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.pdf2doc.com");
	  driver.manage().window().maximize();
	 
	 
	  
	  
  }

}
