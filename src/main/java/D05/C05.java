package D05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

public class C05 extends TestBaseBeforeAfter {

    @Test
    public void dropAction() throws InterruptedException {
        //https://demoqa.com/droppable adresine git
        driver.get("https://demoqa.com/droppable");

        //"Drag me" butonunu tutup "Drop here" butonunun üstüne bırakalım
        WebElement dragMe = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropHere = driver.findElement(By.xpath("(//*[@id='droppable'])[1]"));
        Actions action =new Actions(driver);
        Thread.sleep(1000);
        action.dragAndDrop(dragMe,dropHere).perform();

        //"Drop here" yazısı yerine "Dropped!" olduğunu test edin
        Assert.assertEquals("Dropped!",driver.findElement(By.xpath("//*[text()='Dropped!']")).getText());

        //version2


    }
}
