package D06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C02 extends TestBaseBeforeAfter {

    //file Exist Download
    @Test
    public void fileExistTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//*[text()='SampleFile.txt']")).click();
        Thread.sleep(1500);
        String sampleText = "C:\\Users\\testinium\\OneDrive\\Masaüstü\\tmpdl20nnrn.txt";
        Assert.assertTrue(Files.exists(Paths.get(sampleText)));
        System.out.println(Paths.get(sampleText));

    }
}
