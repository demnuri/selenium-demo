package D03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
    //Allertsler 2 tür allert vardır HTML locate edebildiğimiz ve JS allerlet bunlarıda locade edemiyoruz
    WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


    }
    @After
    public void quit(){
        // driver.quit();
    }
    @Test
    public void acceptAlert() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        WebElement resulttext = driver.findElement(By.xpath("//*[text()='You successfully clicked an alert']"));
        String actualText = resulttext.getText();
        String expectedText = "You successfully clicked an alert";
        Assert.assertEquals(expectedText,actualText);


    }

    @Test
    public void dismissAlert() throws InterruptedException {
        //2. butona tıklaytın uyarıdaki cancel butonuna tıklayın ve resulkt mesajını
        //successfuly içermediğini test edin. Alert üzerinde ki mesajını yazdırın.
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        Thread.sleep(1000);
        System.out.println("Allert un içinde ki mesaj=" + driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        WebElement actualText = driver.findElement(By.xpath("//*[text()='You clicked: Cancel']"));
        String expectedMessage = "successfuly";
        Assert.assertNotEquals(expectedMessage,actualText);

    }
    @Test
    public void sendKeysAlert() throws InterruptedException {
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        System.out.println("Allertun içinde ki metod="+ driver.switchTo().alert().getText());

        driver.switchTo().alert().sendKeys("Nurullah");
        driver.switchTo().alert().accept();
        WebElement acualText = driver.findElement(By.xpath("//*[@id='result']"));
        String acText = acualText.getText();
        String expectedText = "Nurullah";
        Assert.assertTrue(acText.contains(expectedText));
    }
}
