package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Lesson02 {

    static WebDriver driver;

    @BeforeAll
    public static void beforeClass() {
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void before() {
        driver.get("http://blazedemo.com/index.php");
    }

    @Test
    public void test() {

        WebElement buttonSubmit = driver.findElement(By.cssSelector("[type='submit']"));
        buttonSubmit.click();

        WebElement title = driver.findElement(By.tagName("h3"));

        assertTrue(title.isDisplayed());
    }

    @AfterAll
    public static void after() {
        driver.quit();
    }
}
