package DAY1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edureka {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.get("https://www.edureka.co");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//img[@alt='Edureka Veranda logo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		Thread.sleep(3000);
		
	}

}
