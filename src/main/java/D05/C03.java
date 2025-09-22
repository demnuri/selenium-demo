package D05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import javax.swing.*;

public class C03 extends TestBaseBeforeAfter {
    //action Test
    @Test
    public void actionTest() throws InterruptedException {
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        WebElement hesaplar = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
        WebElement listeOlustur = driver.findElement(By.xpath("(//*[@class='nav-text'])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(hesaplar).click(listeOlustur).perform();

        //aramakutusuna iphone15 yazdır
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        action.click(searchBox).keyDown(Keys.SHIFT).sendKeys("i").keyUp(Keys.SHIFT).sendKeys("phone").sendKeys(" ").sendKeys("15")
                .keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("lus").sendKeys(Keys.ENTER).perform();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Iphone 15 Plus";
        Assert.assertTrue(actualTitle.contains(expectedTitle));



    }
}
