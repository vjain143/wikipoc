package com.wiki.poc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class VisaAppointmentAlert
{
    private String testUrl;
    private WebDriver driver;
    private AudioStream audioStream;

    private void setup()
    {
        System.setProperty("webdriver.gecko.driver","webdriver/geckodriver");
        driver = new FirefoxDriver();
    }

    private void alertVisaAppointment()
    {
        AudioStream audioStream = null;
        try
        {
            String testUrl = "https://xyz.com/dev/utils/gnib-appointments/";
            String gongFile = "/Users/vjain143/Data/CodePlaygraound/2018/visa-appointment-alert/src/main/tone1.wav";
            InputStream in = new FileInputStream(gongFile);
            // create an audiostream from the inputstream
            audioStream = new AudioStream(in);

            driver.get(testUrl);
            // Find elements by attribute lang="READ_MORE_BTN"
            WebElement element = ((FirefoxDriver) driver).findElementByClassName("baskerville");
            //Click the selected button
            String message = element.getText();
            //System.out.println("Value = "+message);
            //System.out.println("##############################################");
            String visaMessage = message.substring(message.lastIndexOf("VISA Appointments"),message.length());

            String[] lines = visaMessage.split(System.getProperty("line.separator"));
            if("VISA Appointments".equals(lines[0]))
            {
                if( ("No appointments".equals(lines[2])) || ("No appointments".equals(lines[4])) )
                {
                    //System.out.print("No appointments,");
                }
                else
                {
                    System.out.println("Appointments :: Individual = " + lines[1]+ ", Family = "+lines[3]);
                    while(true)
                    {
                        AudioPlayer.player.start(audioStream);
                    }
                }
            }
        }
        catch (Throwable ball)
        {
            System.out.println("Error");
            ball.printStackTrace();
            while(true)
            {
                System.out.println("VisaAppointmentAlert stopped due to exception");
                AudioPlayer.player.start(audioStream);
            }
        }

    }

    public static void main(String args[])
    {
        VisaAppointmentAlert alertVisaAppointment = new VisaAppointmentAlert();
        alertVisaAppointment.setup();
        System.out.println("VisaAppointmentAlert started");
        while(true)
        {
            alertVisaAppointment.alertVisaAppointment();
        }
    }
}
