package DAY1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String>windows= driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parrentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.className("im-para")).getText());
		driver.switchTo().window(parrentid);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("learning");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("btn-success")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
