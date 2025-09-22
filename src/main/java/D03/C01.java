package D03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {

    //Assertions
    WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
    }
    @After
    public void quit(){
        // driver.quit();
    }

    @Test
    public void Test1(){
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "amazon";
        Assert.assertTrue(actualURL.contains(expectedURL));


    }
    @Test
    public void Test2(){
        String getTitle = driver.getTitle();
        String expectedTitle = "facebook";
        Assert.assertFalse(getTitle.contains(expectedTitle));


    }
    @Test
    public void Test3(){
        WebElement logo = driver.findElement(By.cssSelector("#nav-logo-sprites"));
        Assert.assertTrue(logo.isDisplayed());


    }
}
