package marina.edu.test.tests;

import marina.edu.test.appmanager.ContactCreationTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {
    public static WebDriver driver;
    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static void sessionHelper2() {

        driver.get("http://localhost/addressbook/");
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.id("LoginForm")).click();
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
    public static void contactFilling() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Ivan");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Ivanov");
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).sendKeys("89998887766");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("test@test.uy");
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }
}
