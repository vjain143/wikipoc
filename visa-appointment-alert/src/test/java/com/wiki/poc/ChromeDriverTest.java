package com.wiki.poc;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class ChromeDriverTest {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() {
        //setup chromedriver
        System.setProperty(
                "webdriver.chrome.driver",
                "webdriver/chromedriver");

        testUrl = "https://vjain143.github.io/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(testUrl);
    }

    @Test
    public void testTitle() throws IOException {
        List<WebElement> elements = driver.findElements(By.cssSelector("[lang=\"READ\"]"));

        //Click the selected button
        elements.get(0).click();


        assertTrue("Expected", (new WebDriverWait(driver, 5))
                        .until(new ExpectedCondition<Boolean>() {   public Boolean apply(WebDriver d) { return d.getTitle().equals("");  }
                        })
        );

    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }

}
