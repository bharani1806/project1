package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2 {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver_win32\\ChromeDriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://letcode.in/edit");
driver.findElement(By.id("fullName")).sendKeys("bharani");
driver.findElement(By.id("join")).sendKeys(" person");
String s1= driver.findElement(By.id("getMe")).getAttribute("value");
System.out.println(s1);
driver.findElement(By.id("clearMe")).clear();
boolean b1 = driver.findElement(By.id("noEdit")).isEnabled();
System.out.println(b1);

	}

}
