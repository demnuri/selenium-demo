package D03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06 {

    //Basic Authentications
    WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/basic_auth");


    }
    @After
    public void quit(){
        // driver.quit();
    }
    @Test
    public void basicAuthen(){
        //https://the-internet.herokuapp.com/basic_auth
        //Html komutu: https://username:password@URL
        // username: admin
        //password: admin
        //başarılı bir şekilde giriş olduğunu doğryula

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());


    }
}
