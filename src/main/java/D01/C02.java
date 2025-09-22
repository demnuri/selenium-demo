package D01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        //Chromedriver i setup et
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com.tr"); //get'e göre daha hızlı
        //google anasayfasına git
        driver.navigate().to("https://www.google.com.tr"); //get'e göre daha hızlı
        //tekrar amazoan git
        Thread.sleep(1000);
        driver.navigate().back();
        //tekrar googla git
        Thread.sleep(1000);
        driver.navigate().forward();

        driver.quit();

    }
}
