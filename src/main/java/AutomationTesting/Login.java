package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {
    static void main(String[] args) throws Exception {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        Thread.sleep(500);

        String name = "Bharathkumar";
        char[] letters = name.toCharArray();   //{'B',}

        for (char i : letters) {
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")).sendKeys(String.valueOf(letters[i]));
        Thread.sleep(500);
        }

        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input")).sendKeys("123!@#" + Keys.ENTER);
        Thread.sleep(1500);

        driver.quit();
    }
}