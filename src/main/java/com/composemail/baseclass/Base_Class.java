package com.composemail.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserlaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\JKS\\eclipse-workspace\\Compose_Mail\\Driver\\chromedriver.exe");

				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\JKS\\eclipse-workspace\\Compose_Mail\\Driver2\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("INVALID BROWSER");
			}

			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendValues(WebElement element, String inputs) {
		try {
			element.sendKeys(inputs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicitwait() {
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void explicitwait(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void FrameByInt(int integer) {
		try {
			driver.switchTo().frame(integer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frameByString(String string) {
		try {
			driver.switchTo().frame(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frameByWebelement(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sleep(int seconds) throws InterruptedException {
		try {
			Thread.sleep(seconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void defaultcontent() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void screenshot(String path) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isEnabled(WebElement element) {
		try {
			System.out.println(element.isEnabled());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void robotShiftC() throws AWTException {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_SHIFT);
			r.keyRelease(KeyEvent.VK_C);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
