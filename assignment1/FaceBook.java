package week2.day2.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Allow')]")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);	
		driver.findElement(By.name("firstname")).sendKeys("Alice");
		driver.findElement(By.name("lastname")).sendKeys("Rob");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9562345784");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Ar@245#nhj");
		WebElement day = driver.findElement(By.id("day"));
		Select obj = new Select(day);
		obj.selectByVisibleText("12");
		WebElement month = driver.findElement(By.id("month"));
		Select obj1 = new Select(month);
		obj1.selectByValue("4");
		WebElement year = driver.findElement(By.id("year"));
		Select obj2 = new Select(year);
		obj2.selectByVisibleText("1996");
		driver.findElement(By.xpath("//input[@name='sex']/preceding::label")).click();
		
		
		
	}

}


