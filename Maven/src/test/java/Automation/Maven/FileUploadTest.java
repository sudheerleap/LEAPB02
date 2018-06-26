package Automation.Maven;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileUploadTest {
	WebDriver driver;
  @Test
  public void upload() throws Exception {
	WebElement  focus= driver.findElement(By.xpath("//*[@id=\"pick-files\"]/span[2]"));
	 focus.click();
	 //focus.sendKeys ("C:\\Users\\edu1\\Desktop\\Sanjay ramaswami.pdf");
	 Runtime.getRuntime().exec("C:\\Users\\edu1\\Desktop\\fileupload.exe");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\SELENIUM DUMP\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.pdf2doc.com");
	  driver.manage().window().maximize();
;	  
  }

}
