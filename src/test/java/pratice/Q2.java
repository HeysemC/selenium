package pratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {

    public static void main(String[] args) {
        /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini ve Url alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */




        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.otto.de");
        String expectedTitleOtto = "OTTO";
        String actualTitleOtto = driver.getTitle();
        if (actualTitleOtto.contains(expectedTitleOtto)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }
        String expectedUrlOtto = "OTTO";
        String actualUrlOtto = driver.getCurrentUrl();
        if (actualUrlOtto.contains(expectedUrlOtto)) {
            System.out.println("URL testi PASSED");
        } else {
            System.out.println("URL testi FAILED");
        }
        driver.get("https://wisequarter.com/");
        String expectedTitleWise = "OTTO";
        String actualTitleWise = driver.getTitle();
        if (actualTitleWise.contains(expectedTitleWise)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title testi FAILED");
        }
        String expectedUrlWise = "OTTO";
        String actualUrlWise = driver.getCurrentUrl();
        if (actualUrlWise.contains(expectedUrlWise)) {
            System.out.println("URL testi PASSED");
        } else {
            System.out.println("URL testi FAILED");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();







    }













}
