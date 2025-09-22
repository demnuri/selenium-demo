package D05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import javax.swing.*;

public class C06 extends TestBaseBeforeAfter {

    @Test
    public void test(){
        driver.get("https://www.facebook.com");
        WebElement kayıtOl = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        Actions action = new Actions(driver);
        action.click(kayıtOl).perform();
        action.sendKeys("nuri").sendKeys(Keys.TAB).sendKeys("dem").sendKeys(Keys.TAB).sendKeys("555555").sendKeys(Keys.TAB)
                .sendKeys("asd").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("12").sendKeys(Keys.TAB).sendKeys("Jun")
                .sendKeys(Keys.TAB).sendKeys("1995").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.RIGHT).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }
}
