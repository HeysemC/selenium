package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleDegeri {

    public static void main(String[] args) throws InterruptedException {

/*
her driver olusturdugumuzda benzersiz bir ref atiyor.
 */

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());//CDwindow-70B79F1709D4D7F1ACC7AAE3AB75C688
        Thread.sleep(2000);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());



        Thread.sleep(2000);
        driver.quit();



















    }
}
