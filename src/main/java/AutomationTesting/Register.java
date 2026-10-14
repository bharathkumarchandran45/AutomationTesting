package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Register {
    static void main(String[] args) throws Exception{

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2500);

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("gender-male")).click();
        Thread.sleep(1500);

        driver.findElement(By.id("FirstName")).sendKeys("Bharath");
        Thread.sleep(1500);

        driver.findElement(By.id("LastName")).sendKeys("Kumar");
        Thread.sleep(1500);

        driver.findElement(By.id("Email")).sendKeys("bharath@gmail.com");
        Thread.sleep(1500);

        driver.findElement(By.name("Password")).sendKeys("123!@#");
        Thread.sleep(1000);

        driver.findElement(By.name("ConfirmPassword")).sendKeys("123!@#");
        Thread.sleep(1000);

        driver.findElement(By.id("register-button")).click();

        driver.quit();
    }
}
