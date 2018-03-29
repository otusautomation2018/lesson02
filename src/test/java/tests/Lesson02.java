package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lesson02 {

    public static WebDriver driver = new ChromeDriver();

    @Test
    public void test() {
        driver.get("http://blazedemo.com/index.php");

        WebElement buttonSubmit = driver.findElement(By.cssSelector("[type='submit']"));
        buttonSubmit.click();

        WebElement tableOfFlights = driver.findElement(By.className("table"));

        assertTrue(tableOfFlights.isDisplayed());
    }

    @AfterAll
    public static void after() {
        driver.quit();
    }
}
