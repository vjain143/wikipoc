package com.wiki.poc;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by haozuo on 3/23/16.
 */
public class FirefoxTest {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() {

        testUrl = "https://xyz.com/dev/utils/gnib-appointments/";

        System.setProperty("webdriver.gecko.driver","webdriver/geckodriver");
        driver = new FirefoxDriver();
        driver.get(testUrl);
    }

    @Test
    public void testTitle() throws IOException {

        WebElement element = ((FirefoxDriver) driver).findElementByClassName("baskerville");
        String message = element.getText();
        System.out.println("Value = "+message);
        System.out.println("##############################################");
        String visaMessage = message.substring(message.lastIndexOf("VISA Appointments"),message.length());

        String[] lines = visaMessage.split(System.getProperty("line.separator"));
        if("VISA Appointments".equals(lines[0]))
        {
            if( (!"No appointments".equals(lines[2])) || (!"No appointments".equals(lines[4])) )
            {
                //invoke Alarm
                System.out.println("Hello");
                String gongFile = "/Users/vjain143/Data/CodePlaygraound/2018/selenium-example-master/src/main/tone1.wav";
                InputStream in = new FileInputStream(gongFile);

                AudioStream audioStream = new AudioStream(in);
                AudioPlayer.player.start(audioStream);
            }
            else
            {
                System.out.println("No appointments");
                String gongFile = "/Users/vjain143/Data/CodePlaygraound/2018/selenium-example-master/src/main/tone1.wav";
                InputStream in = new FileInputStream(gongFile);
                AudioStream audioStream = new AudioStream(in);
                while(true)
                {
                    AudioPlayer.player.start(audioStream);
                }

            }
        }

    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }

}
