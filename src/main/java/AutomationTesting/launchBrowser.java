package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;


public class launchBrowser {
    static void main(String[] args) throws Exception {

        WebDriver driver = new EdgeDriver();
        Robot robot = new Robot();

        driver.get("https://www.facebook.com/");
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);

        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);

        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);

        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);

        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.quit();
    }
}