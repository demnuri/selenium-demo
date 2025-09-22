package D06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C03 extends TestBaseBeforeAfter {

    //file exist upload

    @Test
    public void test(){

        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement dosyaSec = driver.findElement(By.xpath("//*[@id='file-upload']"));
        String uploaded = "C:\\Users\\testinium\\OneDrive\\Masaüstü\\SampleFile.txt";
        dosyaSec.sendKeys(uploaded);
        driver.findElement(By.xpath("//*[@id='file-submit']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());

    }


}
