package D04;

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
    //iFrame

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
        //https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement iframeBaslik = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(iframeBaslik.isDisplayed());
        System.out.println(iframeBaslik.getText());


        WebElement iFrameTextBox = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iFrameTextBox);
        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.sendKeys("Merhaba Dünya");

        //driver.switchTo().parentFrame(); ---- 1 üst seviyedeki frame e geçiş yapar.
        //driver.switchTo().defaultContent(); ----En üst seviyedeki frame çıkmak için kullanılır.

        ////*[@id='mce_0_ifr']
    }
}
