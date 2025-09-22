package D05;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C07 extends TestBaseBeforeAfter {
    //Faker class
    @Test
    public void fakerTest() throws InterruptedException {
        driver.get("https://www.facebook.com");
        WebElement kayıtOl = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        Actions action = new Actions(driver);
        action.click(kayıtOl).perform();
        Thread.sleep(1000);
        Faker faker = new Faker();
        action.sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).perform();


    }
}
