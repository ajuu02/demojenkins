package com.GIT.app;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Launch {
	@Test
	public void LaunchTest()
	{
		System.setProperty("webdriver.chrome.driver", "D://Software//Env//chromedriver//chromedriver.exe");
		WebDriver d1 = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d1,10);
		//d1.navigate().to("www.google.com");
		d1.quit();
	}
	
	@Test
	public void LaunchTest2()
	{
		System.out.println("test 2 also passed");
	}
	
	@Test
	public void LaunchTest3()
	{
		System.out.println("test 3 also passed");
	}
}
