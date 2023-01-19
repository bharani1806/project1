package Selenium_Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive","C:\\Selenium\\ChromeDriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		driver.get("");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.getPageSource();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com");
		
		//WebDriver driver2=new ChromeDriver("webdriver.chrome.drive","C:\\Selenium\\ChromeDriver_win32\\ChromeDriver.exe");
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Set<String>handles=driver.getWindowHandles();
		List<String>ls=new ArrayList<String>(handles);
		String parent_window_id=ls.get(0);
		String child_window_id=ls.get(1);
		System.out.println(parent_window_id);
		System.out.println(child_window_id);
		System.out.println("before switching"+driver.getTitle());
		driver.switchTo().window(parent_window_id);
		System.out.println("after switching"+driver.getTitle());
		int count=handles.size();
		System.out.println("no.of tabs/windows"+count);
		driver.close();
		driver.findElement(by.)
		   
		
		
		

	}

}
x