package testPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestYoutubeSoru {

   @Test
  public void kullaniciGiris() throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("https://youtube.com");

       // Kullanici girisi;
       driver.findElement(By.xpath("//ytd-button-renderer[@id='sign-in-button']")).click();

       //input[@type='email']
       driver.findElement(By.xpath("//input[@type='email']")).click();

       //input[@id='identifierId']
       driver.findElement(By.id("identifierId")).sendKeys("o***@gmail.com"+ Keys.ENTER);

       driver.findElement(By.xpath("//input[@type='password']")).click();

       driver.findElement(By.id("password")).sendKeys("******"+Keys.ENTER);

       driver.findElement(By.xpath("//input[@id='search']")).click();
       //driver.findElement(By.id("search")).sendKeys("ahmet bulutluoz"+Keys.ENTER);
       driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).sendKeys("ahmet bulutluoz"+Keys.ENTER);


       driver.findElement(By.xpath("//div[@id='avatar']")).click();

       Thread.sleep(200);
       //ytd-subscribe-button-renderer[@class='style-scope ytd-c4-tabbed-header-renderer']
       driver.findElement(By.xpath("//ytd-subscribe-button-renderer[@class='style-scope ytd-c4-tabbed-header-renderer']"+Keys.ENTER));



       //driver.close();
       /*
       Test basarili olduk ancal stabil calisamadi mail hesabi kendini korumaya aldi
        */
    }
}
