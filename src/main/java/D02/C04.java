package D02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    //checkbox
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    /*@After
    public void quit(){
        driver.quit();

    }

     */
    @Test
    public void Test(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));

        if (!checkbox.isSelected()){
            checkbox.click();
        }
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
    }
}
