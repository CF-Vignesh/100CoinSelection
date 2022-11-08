package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coin1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://cf-customer-site-qa.s3-website.ap-south-1.amazonaws.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// login
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("text")).sendKeys("sl10@gmail.com");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='0']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='1']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='2']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='3']")).sendKeys("0");
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		Thread.sleep(3000);

		// join now
		driver.findElement(By.xpath("//span[contains(@class,'flex gap-1 lg:gap-2 items-center justify-center')]"))
				.click();

		// select coins
		// low cap
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][1]")).click();
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// sort option - price

		driver.findElement(By.xpath("//button[text()='Price']")).click();
		Thread.sleep(3000);

		// +
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='5x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='3x']/..")).click();

		Thread.sleep(3000);
		// mid cap
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='3x']/..")).click();

		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='4x']/..")).click();

		Thread.sleep(3000);
		// high cap
		driver.findElement(By.xpath("//button[contains(@class,'disabled:cursor-not-allowed')][3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();

		Thread.sleep(3000);
		// Join game
		driver.findElement(By.xpath("//button[text()='Join Game']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View Game']")).click();

	}

}
