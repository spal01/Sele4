package com.browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.github.com/");
		String mainWindow=driver.getWindowHandle();
		
		System.out.println("Main window is " + mainWindow);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		//driver.findElement(By.linkText("Gmail")).click();
		
		Set<String> windows=driver.getWindowHandles();
		int numberOfWindows = windows.size();
		
		System.out.println("Number of windows is " + numberOfWindows);
		String secondWindow ="";
		for(String x:windows) {
			System.out.println("Window id is " + x);
			if(x!=mainWindow) {
				secondWindow=x;
				
			}
		}
		//do not use driver close
		//driver.close();
		
		driver.switchTo().window(mainWindow);
		String title=driver.getTitle();
		System.out.println("Title is " + title);
		
		driver.switchTo().window(secondWindow);
		title=driver.getTitle();
		System.out.println("Title is " + title);
		
		
	}

}
