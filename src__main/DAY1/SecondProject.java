package DAY1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.findElement(By.id("inputUsername")).sendKeys("Frank");
		driver.findElement(By.name("inputPassword")).sendKeys("babu123");
		Thread.sleep(5000);
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Frank");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Frank1256@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("4567345677");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String msg1=driver.findElement(By.className("infoMsg")).getText();
		String[]msgarry=msg1.split("'");
		System.out.println(msgarry[1]);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Frank");
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).sendKeys(msgarry[1].trim());
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		String msg2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText();
		if(msg2.contains("logged")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.findElement(By.className("logout-btn")).click();
		driver.close();
	}

}
