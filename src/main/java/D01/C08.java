package D01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08 {
    public static void main(String[] args) throws InterruptedException {
        //CSS selector
        /*
        cssSelector sadee id ve class attribute leri için locate alınabilir
        id için başına #
        class için başına . işareti konulur
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();
        WebElement delete = driver.findElement(By.cssSelector(".added-manually"));
        if (delete.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(1000);
        delete.click();

        if (driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")).isDisplayed()){
            System.out.println("pppppassed");
        }else{
            System.out.println("ffffffailled");
        }
    }
}
