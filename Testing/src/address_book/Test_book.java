package address_book;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_book {
     WebDriver driver;
     @BeforeMethod
     public void launch()
     {
    	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	 driver= new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("http://3.84.28.138:8000/addressbook/");
     }
     @Test
     public void verify_book()
     {
    	 driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
    	 driver.findElement(By.xpath("//div[@class=\"v-button v-widget\"]")).click();
    	 driver.findElement(By.id("gwt-uid-5")).sendKeys("selenium");
    	 driver.findElement(By.id("gwt-uid-7")).sendKeys("java");
    	 driver.findElement(By.id("gwt-uid-9")).sendKeys("98701078");
    	 driver.findElement(By.id("gwt-uid-11")).sendKeys("java@selenium123.com");
    	 driver.findElement(By.id("gwt-uid-13")).sendKeys("02/09/1989");
    	 driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
    	 }
     @AfterMethod
     public void close()
     {
    	 driver.close();
     }
}
