package D01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {

    public static void main(String[] args) {
        //Chromedriver i setup et
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //amazona sitesine git
        driver.get("https://www.amazon.com.tr");
        driver.manage().window().maximize();
        //sayfanın başlığını yazdır
        System.out.println("Sitenin başlığı :"+driver.getTitle());
        //sayfanın URL yazıdr
        System.out.println("Sayfa URL:"+driver.getCurrentUrl());
        //sayfanın kaynak kodlarını yazıdr
        //System.out.println("Sayfanın kaynak kodları:"+driver.getPageSource());
        //Kaynak kodların içinde Gateway kelimesinin olduğunu test ediniz.
        String actualData = driver.getPageSource();
        String ExpectedData = "Gateway";
        if(actualData.contains(ExpectedData)){
            System.out.println("TEST PASSED");

        }else{
            System.out.println("TEST FAİLED");
        }
        //sayfanın window handle kodunu yazdır
        System.out.println("Window Handle:" + driver.getWindowHandle());
        //sayfayı kapat
        driver.close();

    }
}
