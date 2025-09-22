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

public class C02 {
    //assertion practise
    WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");

    }
    @After
    public void quit(){
        // driver.quit();
    }
    @Test
    public void tittleTest(){
        String currentTittle = driver.getTitle();
        String expectedTittle = "YouTube";
        Assert.assertTrue(currentTittle.contains(expectedTittle));
    }
    @Test
    public void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id='yt-ringo2-svg_yt34']"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    public void searchBox(){
        WebElement search = driver.findElement(By.xpath("//*[@name='search_query']"));
        Assert.assertTrue(search.isEnabled());
    }
    @Test
    public void wrongTittleTest(){
        String actualTittle = driver.getTitle();
        String expectedTittle = "youtube";
        Assert.assertFalse(actualTittle.contains(expectedTittle));
    }
}
