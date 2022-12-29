package testPractice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestEbayMacBookProSatinAlma {


    @Test
    public void testEbayMacBookProSatinAlma(){





        //1-Gerekli ayarlamalari yap,
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //2-"https://www.trendyol.com" gidin,
        driver.get("https://www.trendyol.com");

        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//div[@class='modal-close']")).click();

        //3-Arama kismina "MacBook pro m2" yazin ve aratin,
        driver.findElement(By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")).sendKeys("MacBook pro m2"+Keys.ENTER);


        //4-Arama sonucunun kaç tane oldugunu yazdirin
        WebElement bulunanSonuc=driver.findElement(By.xpath("//div[@class='srch-ttl-cntnr-wrppr']"));
        System.out.println(bulunanSonuc.getText());


        //5-2020 model ve ustunu getir



        //6-Sonuclari ucuzdan pahaliya dogru sirala
        driver.findElement(By.xpath("//option[@value='PRICE_BY_DESC']")).click();


        //7-Cikan sonuclardan ilkini sepete ekle
        driver.findElement(By.xpath("//div[@data-id='265756770']")).click();
        driver.findElement(By.xpath("//button[@class='add-to-basket']")).click();











    }

}
