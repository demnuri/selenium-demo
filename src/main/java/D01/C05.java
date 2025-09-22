package D01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05 {
    public static void main(String[] args) throws InterruptedException {
        //practice
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Facebook sayfasına gidin ve sayfa baslığının facebook olduğunu doğrulayın
        driver.get("https://www.facebook.com");
        if(driver.getTitle().contains("facebook")){
            System.out.println("Test Passed");

        }else{
            System.out.println("Actual Title."+ driver.getTitle());
        }

        //Sayfa URL inin facebook kelimesi içerdiğini doğrulayın
        if(driver.getCurrentUrl().contains("facebook")){
            System.out.println("TestPassed");
        }else{
            System.out.println("ActualURL"+driver.getCurrentUrl());
        }
        //walmart sayfasına gidin
        driver.navigate().to("https://www.walmart.com");
        //Tekrar facebook sayfasına gidin
        driver.navigate().back();
        //Sayfayı yenileyin
        Thread.sleep(1000);
        driver.navigate().refresh();
        //Sayfayı maximize edin
        driver.manage().window().maximize();
        //Browserı kapat
        driver.close();

    }
}
