package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public WebDriver driver;
	
	@BeforeTest
	public void getDriver() throws MalformedURLException {
		
		//below is driver setups.
		//WebDriverManager.chromedriver().setup();
		if(Boolean.getBoolean("selenium.grid.enabled")) {
			this.driver=getRemoteDriver();
			//this.driver.manage().window().maximize();
		}else {
			this.driver=getLocalDriver();
			this.driver.manage().window().maximize();
		}
			
		//this.driver=new ChromeDriver();
		//this.driver.manage().window().maximize();
		//this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   }
	
	 @AfterTest
	 public void quitDriver() {
		this.driver.quit();
	 }
	 
	 public WebDriver getRemoteDriver() throws MalformedURLException {
	  String url="http://localhost:4444";
		 Capabilities capabilities=null;
	  if(System.getProperty("browser").equalsIgnoreCase("chrome")) {
		  capabilities=new ChromeOptions();
		 // opt.addArguments("--remote-allow-origins=*");
		 // capabilities=new ChromeOptions(opt);
		  
	  }else {
		  capabilities=new FirefoxOptions(); 
	  }
	  return new RemoteWebDriver(new URL(url),capabilities);
		 
	 }
	 
	 public WebDriver getLocalDriver() {
		 WebDriverManager.chromedriver().setup();
		 return new ChromeDriver(); 
	 }
}