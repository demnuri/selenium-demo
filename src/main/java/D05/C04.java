package D05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C04 extends TestBaseBeforeAfter {

    @Test
    public void actionTest() throws InterruptedException {
       //https://the-internet.herokuapp.com/context_menu sitesine git
        //cizgili alana sağ tıkla.
        //allert çıkan yerini onayla
        //element selenium yerine tıkla.
        //acilan sayfada Element Selenium yazısını doğrula.


        //------------
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement cizgiliAlan = driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions action = new Actions(driver);
        action.contextClick(cizgiliAlan).perform();
        String actualText = driver.switchTo().alert().getText();
        String expectedText = "You selected context menu";
        Assert.assertEquals(expectedText,actualText);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        List<String> newPage = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newPage.get(1));




    }

    @Test
    public void deneme(){
        //https://the-internet.herokuapp.com/context_menu sitesine git
        //cizgili alana sağ tıkla.
        //allert çıkan yerini onayla
        //element selenium yerine tıkla.
        //acilan sayfada Element Selenium yazısını doğrula.
        //-----------------------------
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement cizgiliAlann = driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions action = new Actions(driver);
        action.contextClick(cizgiliAlann).perform();
        String actualText = driver.switchTo().alert().getText();
        String expectedText = "You selected context menu";
        Assert.assertEquals(expectedText,actualText);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));


    }

    @Test
    public void deneme2(){
        //https://the-internet.herokuapp.com/context_menu sitesine git
        //cizgili alana sağ tıkla.
        //allert çıkan yerini onayla
        //element selenium yerine tıkla.
        //acilan sayfada Element Selenium yazısını doğrula.

        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement cizgiliAlan2 = driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions action2 = new Actions(driver);
        action2.contextClick().perform();
        String actualText = driver.switchTo().alert().getText();
        String expecText = "you should..";
        Assert.assertEquals(expecText,actualText);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        List<String> windoHa = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windoHa.get(1));

    }

    @Test
    public void denem3(){
        //https://the-internet.herokuapp.com/context_menu sitesine git
        //cizgili alana sağ tıkla.
        //allert çıkan yerini onayla
        //element selenium yerine tıkla.
        //acilan sayfada Element Selenium yazısını doğrula.
        //-----------------------------
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement cizgiliAlan3 = driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions action3 = new Actions(driver);
        action3.contextClick(cizgiliAlan3);
        String expectedTtx = "you should.";
        String actualTtx = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedTtx,actualTtx);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        List<String> windowhandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowhandles.get(1));


    }

}
