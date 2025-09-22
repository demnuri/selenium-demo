package D03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03 {
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
    public void dropdown() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownN = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select = new Select(dropdownN);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("------------------------------------");
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("------------------------------------");
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("------------------------------------");
        Thread.sleep(1000);
        select.selectByVisibleText("Option 2");
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("------------------------------------");

        List<WebElement> tag = driver.findElements(By.xpath("//option"));
        for(WebElement w:tag){
            System.out.println(w.getText());
        }


    }
}
