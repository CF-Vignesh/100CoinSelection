package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coin16 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://cf-customer-site-stg.s3-website.ap-south-1.amazonaws.com/");
		driver.manage().window().maximize();

		// login
		Thread.sleep(2000);
		driver.findElement(By.id("text")).sendKeys("bluestar4@gmail.com");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='0']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='1']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='2']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='3']")).sendKeys("0");
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		Thread.sleep(2000);

		// join now
		driver.findElement(By.xpath("//span[contains(@class,'flex gap-1 lg:gap-2 items-center justify-center')]"))
				.click();

		// select coins
		// low cap
		Thread.sleep(3000);

		// sort option - price

		driver.findElement(By.xpath("//button[text()='Price']")).click();
		Thread.sleep(2000);

		// scroll

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("document.querySelector(\"div[id='coinLister']\").scrollTop=1700");
		Thread.sleep(2000);

		// low cap (+)

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[17]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[18]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='5x']/..")).click();

		/*
		 * driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[21]")).click();
		 * driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		 * driver.findElement(By.xpath("//button[text()='3x']/..")).click();
		 */

		// mid cap
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][2]")).click();
		Thread.sleep(3000);

		/*
		 * // scroll JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 * Thread.sleep(1000); js2.executeScript(
		 * "document.querySelector(\"div[id='coinLister']\").scrollTop=1500");
		 * Thread.sleep(2000);
		 */

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Up']/../..")).click();
		driver.findElement(By.xpath("//button[text()='3x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[4]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='4x']/..")).click();

		// high cap
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][3]")).click();
		Thread.sleep(3000);

		// scroll
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js1.executeScript("document.querySelector(\"div[id='coinLister']\").scrollTop=1700");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[20]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[21]")).click();
		driver.findElement(By.xpath("//button[text()='Up']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();

		/*
		 * driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[17]")).click();
		 * driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		 * driver.findElement(By.xpath("//button[text()='5x']/..")).click();
		 */

		Thread.sleep(3000);
		// Join game
		driver.findElement(By.xpath("//button[text()='Join Game']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View Game']")).click();

	}
}
