package io.wiki.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VCardApp 
{
	public static void main(String args[])
    {
		VCardApp vcard = new VCardApp();
		SpringApplication.run(VCardApp.class, args);
    }

}
