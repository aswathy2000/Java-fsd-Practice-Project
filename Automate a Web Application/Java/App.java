package com.example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("http://localhost:4200/");

		wd.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);

		Thread.sleep(3000);

		WebElement we1 = wd.findElement(By.className("mainpage"));
		explictLink(wd, we1,3000);

		Thread.sleep(3000);

		WebElement we2 = wd.findElement(By.id("sign-up"));
		explictLink(wd, we2, 3000);

		Thread.sleep(3000);

		WebElement we3 = wd.findElement(By.id("email"));
		explictField(wd, we3, 3000, "Aswathy@email.com");

		WebElement we4 = wd.findElement(By.id("sign-username"));
		explictField(wd, we4, 3000, "Aswathy");

		WebElement we5 = wd.findElement(By.id("sign-password"));
		explictField(wd, we5, 3000, "Aswathy");

		Thread.sleep(3000);

		WebElement we6 = wd.findElement(By.className("sign-up-button"));
		explictLink(wd, we6, 3000);

		Thread.sleep(3000);

		WebElement we7 = wd.findElement(By.id("username"));
		explictField(wd, we7, 3000, "Aswathy");

		WebElement we8 = wd.findElement(By.id("password"));
		explictField(wd, we8, 3000, "Aswathy");

		Thread.sleep(3000);

		WebElement we9 = wd.findElement(By.className("sign-in-button"));

		explictLink(wd, we9, 3000);
		
		Thread.sleep(5000);
		
		wd.close();

	}


	private static void explictLink(WebDriver wd, WebElement we1, int timeout) {
		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we1));
		we1.click();
	}
	private static void explictField(WebDriver wd, WebElement we2, int timeout, String value) {
		new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we2));
		we2.sendKeys(value);

	}
}
