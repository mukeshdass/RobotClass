package org.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MukeshDass\\eclipse-workspace\\RobotClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement d = driver
				.findElement(By.xpath("//p[contains(text(),' is a leading Training and Placements')]"));
		Actions acc = new Actions(driver);
		acc.doubleClick(d).perform();
		acc.contextClick(d).perform();
	}

}
