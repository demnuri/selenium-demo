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
import java.util.List;

public class C04 {

    //Assertion Practice
    //Dropdown
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
    public void amazonTest(){

        driver.get("https://www.amazon.com.tr");
        List<WebElement> ddM = driver.findElements(By.xpath("//option"));
        System.out.println("ddM:" + ddM.size());
        for(WebElement w:ddM){
            System.out.println(w.getText());
        }

        int ActualDropdownMenu = ddM.size();
        int expectedDropdownMenu = 40;
        Assert.assertNotEquals(expectedDropdownMenu,ActualDropdownMenu);
    }
}
