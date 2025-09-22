package D04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {
    //window practice
    //Window Handle
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
    public void windowHandleTest(){
        //Amazon sayfasına gidin.
        driver.get("https://www.amazon.com.tr");
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        String amazonWindowHandle = driver.getWindowHandle(); // daha sonra amazona gideceğimiz için handle kodunu stringe atıyoruz.
        //Url'nin amazon içerdiğini test edin.
        String actualURL = driver.getCurrentUrl();
        String expectedURL= "amazon";
        Assert.assertTrue(actualURL.contains(expectedURL));
        //Yeni bir pencere açıp bestbuy anasayfasına gidelim(https://www.bestbuy.com)
        driver.switchTo().newWindow(WindowType.WINDOW); // yeni bir browser açacak
        driver.get("https:/www.bestbuy.com");
        String bestBuyWindowHandle = driver.getWindowHandle();
        //title'in bestbuy içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Best Buy";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //ilk sayfaya dönüp sayfada java aratalım
        driver.switchTo().window(amazonWindowHandle);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("java", Keys.ENTER);
        //arama sonuclarının java içerdiğini tes edelim
        WebElement actualText=driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));
        String actualResult = actualText.getText();
        String expectedResult = "java";
        Assert.assertTrue(actualResult.contains(expectedResult));
        //yeniden bestbuy sayfasına gidelim
        driver.switchTo().window(bestBuyWindowHandle);
        //logonun görünürlüğünü test edelim
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='logo']")).isDisplayed());

    }
}
