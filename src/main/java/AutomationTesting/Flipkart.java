package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {
    static void main(String[] args) throws Exception{

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://flipkart.com");
        Thread.sleep(3000);


        driver.findElement(By.className("b3wTlE")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}





