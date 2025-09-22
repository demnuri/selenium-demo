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

public class C05 {
    //RadioButton

    WebDriver driver;

    @Before
    public void setUp(){
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
    public void test(){
        driver.get("https://www.facebook.com");
        WebElement createButton = driver.findElement(By.xpath("//*[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
        createButton.click();
        WebElement name = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        WebElement lastname = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[2]"));
        WebElement phone = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[5]"));
        WebElement pass = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[7]"));
        WebElement day =driver.findElement(By.xpath("//*[@id='day']"));
        WebElement month =driver.findElement(By.xpath("//*[@id='month']"));
        WebElement year =driver.findElement(By.xpath("//*[@id='year']"));
        WebElement genderF =driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
        WebElement genderM =driver.findElement(By.xpath("(//*[@name='sex'])[2]"));

        name.sendKeys("Nurullah");
        lastname.sendKeys("Demirci");
        phone.sendKeys("123");
        pass.sendKeys("asd");
        day.sendKeys("12");
        month.sendKeys("Jan");
        year.sendKeys("1995");
        if (!genderM.isSelected()){
            genderM.click();
        }
    }

}
