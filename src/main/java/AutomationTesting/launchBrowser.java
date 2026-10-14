package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchBrowser {
    static void main(String[] args) throws Exception {

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }
}