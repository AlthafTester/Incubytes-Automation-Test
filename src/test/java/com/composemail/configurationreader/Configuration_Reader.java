package com.composemail.configurationreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configuration_Reader {

	public static WebDriver driver;
	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\JKS\\eclipse-workspace\\Compose_Mail\\src\\test\\java\\com\\composemail\\propertfile\\composemail.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowser() {

		String browser = p.getProperty("Browser");
		return browser;
	}

	public String getUrl() {

		String url = p.getProperty("url");
		return url;
	}

	public String getEmailId() {

		String email = p.getProperty("emailid");
		return email;
	}

	public String getPassword() {

		String password = p.getProperty("password");
		return password;
	}

}
