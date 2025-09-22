package D01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //https://www.heroku.com/home adresine gidin
        driver.get("https://www.heroku.com/home");

        //Sign Up butonuna tıklayın
        WebElement signUp = driver.findElement(By.id("logged-out-signup"));
        signUp.click();


        //Firstname textbox, lastname textboz, company elementlerini locate ediniz.
        WebElement firstname = driver.findElement(By.id("first_name"));
        WebElement lastname = driver.findElement(By.id("last_name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement company = driver.findElement(By.name("company"));

        Thread.sleep(1000);
        firstname.sendKeys("Nurullah");
        lastname.sendKeys("Demirci");
        email.sendKeys("asd@gmail.com");
        company.sendKeys("ASD");

    }
}
