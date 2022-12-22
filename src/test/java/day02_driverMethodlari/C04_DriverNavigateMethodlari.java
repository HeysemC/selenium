package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //get ile ayni islemi yapar
        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(2000);
        driver.get("https://www.wisequarter.com");

        Thread.sleep(2000);
        //yeniden amazon'a donmek istersek
        driver.navigate().back();

        Thread.sleep(2000);
        //tekrar www.wisequarter.com'g gitmek istersek
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.quit();
    }
}
