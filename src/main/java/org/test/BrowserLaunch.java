package org.test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		WebElement S1 = driver.findElement(By.id("username"));
		S1.sendKeys("BalajiSrinivasan");

		WebElement S2 = driver.findElement(By.id("password"));
		S2.sendKeys("Jackychan007");

		WebElement S3 = driver.findElement(By.id("login"));
		S3.click();

		Robot r = new Robot();

		WebElement txtuser1 = driver.findElement(By.id("location"));
		txtuser1.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement txtuser2 = driver.findElement(By.id("hotels"));
		txtuser2.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement txtuser3 = driver.findElement(By.id("room_type"));
		txtuser3.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement txtuser4 = driver.findElement(By.id("room_nos"));
		txtuser4.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement txtuser5 = driver.findElement(By.id("adult_room"));
		txtuser5.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement txtuser6 = driver.findElement(By.id("Submit"));
		txtuser6.click();

		WebElement txtuser7 = driver.findElement(By.id("radiobutton_0"));
		txtuser7.click();

		WebElement txtuser8 = driver.findElement(By.id("continue"));
		txtuser8.click();

		WebElement T1 = driver.findElement(By.id("first_name"));
		T1.sendKeys("Balaji");

		WebElement T2 = driver.findElement(By.id("last_name"));
		T2.sendKeys("Srinivasan");

		WebElement T3 = driver.findElement(By.id("address"));
		T3.sendKeys("qwertyuiopasdfghjkl");

		WebElement T4 = driver.findElement(By.id("cc_num"));
		T4.sendKeys("1234 5678 8765 4321");

		WebElement T5 = driver.findElement(By.id("cc_type"));
		T5.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement T6 = driver.findElement(By.id("cc_exp_month"));
		T6.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement T7 = driver.findElement(By.name("cc_exp_year"));
		T7.click();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement T8 = driver.findElement(By.id("cc_cvv"));

		T8.sendKeys("123");

		WebElement T9 = driver.findElement(By.id("book_now"));
		T9.click();

	}

}
