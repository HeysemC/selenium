package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMetgodlari {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("maximize boyutlari"+driver.manage().window().getSize());
        System.out.println("maximize konum"+driver.manage().window().getPosition());



        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("full screen boyutlari"+driver.manage().window().getSize());
        System.out.println("full screen konumu"+driver.manage().window().getPosition());

        /*
        farki;

        maximize boyutlari(1562, 846)

        full screen boyutlari(1549, 871)

         */
        Thread.sleep(3000);


        //browser'i istedigimiz konuma getirmek:
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));


        Thread.sleep(3000);
        driver.close();



    }

}
