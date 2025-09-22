package D01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class C04 {
    public static void main(String[] args) throws InterruptedException {
        //locators
        //Chromedriver i setup et
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //amazona
        driver.get("https://www.amazon.com.tr");
        WebElement cerezler = driver.findElement(By.id("sp-cc-rejectall-link"));
        cerezler.click();
        Thread.sleep(1000);
        WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("notebook", Keys.ENTER);

        //amazon sayfasında tagları a olanları yazdır
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("Tag a olanların sayısı"+ tag.size());





    }
}
