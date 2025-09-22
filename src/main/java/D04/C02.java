package D04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02 {
    //iFrame Practice
    WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }
    @After
    public void quit(){
        // driver.quit();
    }
    @Test
    public void IframeTest(){
        driver.get("https://html.com/tags/iframe/");
        List<WebElement> iFrame = driver.findElements(By.xpath("//iframe"));
        driver.switchTo().frame(iFrame.get(0));
        driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();
        driver.switchTo().defaultContent();

    }
}
