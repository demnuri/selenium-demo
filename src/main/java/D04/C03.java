package D04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C03 {
    //Window Handle
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
    public void windowHandleTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        String herokuappwindowHandle = driver.getWindowHandle();
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("The Internet"));
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        Thread.sleep(1000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "New Window";
        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
        driver.switchTo().window(windowList.get(0));
        Assert.assertTrue(driver.getTitle().contains("The Internet"));



    }

}
