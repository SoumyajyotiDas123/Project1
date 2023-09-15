package DAY1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='mobile phone 5g']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("OnePlus")).click();
		Thread.sleep(1000);
		Set<String>windows= driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parrentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.className("a-section")).getText());
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(4000);
		driver.switchTo().window(parrentid);
		driver.quit();
	}

}
