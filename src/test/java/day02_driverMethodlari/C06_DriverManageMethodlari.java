package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //implicitlyWait gittigimiz sayfa acilincaya veya aradigimiz webelement buluncaya kadar
        //driver'in bekleyecegi maz sureyi belirler
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //bu 4'lu her test method'unun basina yazilacak






        Thread.sleep(2000);
        driver.close();
    }
}
