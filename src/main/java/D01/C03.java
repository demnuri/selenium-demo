package D01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {
    public static void main(String[] args) {
        //manage metotdları
        //Chromedriver i setup et
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //amazona git
        driver.get("https://www.amazon.com.tr");
        //sayfanın konumunu ve boyutunu yazıdr
        System.out.println("Sayfanın konumu"+ driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutu: "+ driver.manage().window().getSize());
        //sayfayı simge durumuna getir.
        driver.manage().window().minimize();

    }
}
