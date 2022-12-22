package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static <WebDriver> void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\heyse\\IdeaProjects\\com.Team105Selenium\\src\\drivers\\chromedriver.exe");

        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        Thread.sleep(5000);

        driver.close();



        /*
     1-Selenium jar dosyalarini ve chrome driver ini manuel olarak sisteme
     tanitmis olduk.

     Eger Firefox veya Safari ile calismamiz gerekse, o zaman da onlarin driver larini indirip
     manuel olarak 9. satirdaki gibi o driverlari tanimlamaliyiz.

     2- 12.satirda ChromeDriver() constructor'ini kullanarak bir obje olusturduk
     bu objeyi kullanmasak bile
     bu satirdan dolayi bos bir browser acilir

     3- driver.get(url) driver'i yazdigimiz url'e goturur
     url yazarken www yazmasak dahi calisir
     ancak https:// yazmazsak method calismaz.

 */



    }
}
