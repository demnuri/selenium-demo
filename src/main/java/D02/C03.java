package D02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    //Before class After class
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void quid(){
        driver.quit();
    }

    @Test
    public void go(){
        driver.get("https://www.amazon.com.tr");
    }
    @Test
    public void go2(){
        driver.get("https://www.facebook.com.tr");
    }

}
