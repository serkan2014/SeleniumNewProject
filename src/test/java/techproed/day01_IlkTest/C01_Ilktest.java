package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilktest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    }
}