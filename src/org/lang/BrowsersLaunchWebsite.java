package org.lang;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class BrowsersLaunchWebsite {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\subash boss\\eclipse-workspace\\BrowserLaunch\\driver\\chromedriver.exe" );
WebElement driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
}
}
