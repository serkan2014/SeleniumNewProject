package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

          /*
            implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir.
            Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler.30 saniye beklemesini belirtirsem
        30 saniye bekler ve alt satira gecer.
         */


        //techproed sayfasina gidelim
        String techproUrl = "https://techproeducation.com";
        String amazonUrl = "https://amazon.com";
        driver.get(techproUrl);
        Thread.sleep(3000);

        //amazona gidelim

        driver.get(amazonUrl);
        Thread.sleep(3000);
        //techpro sayfasina geri donelim

        driver.navigate().back();
        Thread.sleep(3000);

        //sayfa basliginin techpro icerdigini test edelim

        String actualTitle = driver.getTitle();
        String arananKelime = "techpro";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Test PASSED");

        }else System.out.println("Test FAILED");



        //tekrar amazon sayfasina gidelim

        driver.navigate().forward();

        //sayfa basliginin amazon icerdigini test edelim

        if(driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        // Sayfayi Kapatınız.

        driver.close();








    }
}