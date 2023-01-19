package Selenium_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.setProperty("webdriver.chrome.drive", "C:\\\\Selenium\\\\ChromeDriver_win32\\\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Properties prop= new Properties();
		prop.load(new FileInputStream("./src/Selenium_Basics/config.properties"));
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String url = prop.getProperty("url");

		driver.get(url);
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.xpath("//input[@id='user-name']"));
		un.sendKeys(username);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys(password);
		
	}

}
