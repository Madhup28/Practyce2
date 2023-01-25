package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Day8Tasks {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		// CHROME
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\manoj\\eclipse-workspace\\Day2Task\\Driver\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 Actions a = new Actions(driver);
	            TakesScreenshot ss = (TakesScreenshot) driver;
	                 	
	            
	            // QUESTION 1
	            driver.get("http://www.greenstechnologys.com/");
	          
	            // Take SceenShot
	            File src = ss.getScreenshotAs(OutputType.FILE);
	
	            File dest = new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 1.jpeg");
	            
	            FileHandler.copy(src, dest);
	            
	            
	            // QUESTION 2
	            driver.get("http://toolsqa.com/");
	            
	            // Scroll to Latest Articles
	            WebElement lnkScrollTo = driver.findElement(By.xpath("//a[text() = 'Latest Articles']"));           
	            js.executeScript("arguments[0].scrollIntoView(true)",lnkScrollTo );
	            
	            
	            // QUESTION 4
	            driver.get("http://www.greenstechnologys.com/");
	            
	            // Scroll to Address
	            WebElement lblAddress = driver.findElement(By.xpath("//span[text() = 'Greens technology Perumbakkam']"));
	            js.executeScript("arguments[0].scrollIntoView(true)",lblAddress);
	            
	            // Take Screenshot
	            File srcAddr = ss.getScreenshotAs(OutputType.FILE);
	        	
	            File destAddr = new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 4.jpeg");
	            
	            FileHandler.copy(srcAddr, destAddr);
	            
	            // QUESTION 5
	            driver.get("https://greenstech.in/selenium-course-content.html");
	            
	            // Scroll to Job Openings
	            WebElement lnkJob = driver.findElement(By.id("heading2011"));
	            js.executeScript("arguments[0].scrollIntoView(true)",lnkJob);
	            
	            // Take ScreenShot
	            File srcJob = ss.getScreenshotAs(OutputType.FILE);
	            File destJob = new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 5 .jpeg");
	            
	            FileHandler.copy(srcJob, destJob);	            
	            
	            // Scroll Up to Online Classroom 
	            WebElement lnkOnlineClass = driver.findElement(By.xpath("//h3[text() ='Online Classroom']"));
	            js.executeScript("arguments[0].scrollIntoView(false)",lnkOnlineClass);
	            
	            
	            // QUESTION 6
	            driver.get("https://greenstech.in/selenium-course-content.html");
	            
	            // Scroll to Top Brands
	            WebElement lblBrand = driver.findElement(By.xpath("//h3[contains(text(),'Top Selenium Trends In 2020')]"));
	            js.executeScript("arguments[0].scrollIntoView(true)",lblBrand);
               
	            // Take ScreenShot
                File srcBrand = ss.getScreenshotAs(OutputType.FILE);
	            File destBrand = new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 6 .jpeg");
	            
	            FileHandler.copy(srcBrand, destBrand);  
	            
	            
	          //# DAY 8 - QUESTION 7
	            driver.get("https://greenstech.in/selenium-course-content.html");
	            
	            // Click Core Java
	            WebElement lblInterview = driver.findElement(By.id("heading20"));
	            lblInterview.click();
	              
	            // Take ScreenShot
	            File srcJava = ss.getScreenshotAs(OutputType.FILE);
	            File destJava =  new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 7.jpeg");
                FileHandler.copy(srcJava, destJava);
	            
	            // QUESTION 8
                driver.get("https://greenstech.in/selenium-course-content.html");
	            
	            WebElement lblInterviewGreens = driver.findElement(By.id("heading302"));
	            lblInterviewGreens.click();
	            
	            js.executeScript("arguments[0].scrollIntoView(true)", lblInterview);
	            File srcGreens = ss.getScreenshotAs(OutputType.FILE);	   
	            File destGreens =  new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 8.jpeg");
                FileHandler.copy(srcGreens, destGreens);
	
                // QUESTION 9
 	            driver.get("https://www.flipkart.com/");
	            
 	            
 	            // Check if Login is Present
	            if(driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).isDisplayed())
	            {
	            	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	            }
	            
	            // Search Product
	            WebElement txtSearch = driver.findElement(By.name("q"));
	            txtSearch.sendKeys("iphone" + Keys.ENTER);           
	                      
	            Thread.sleep(1500);           

	            // Click Product
	            WebElement txtPdt = driver.findElement(By.xpath("//div[@data-id='MOBFWQ6B7KKRXDDS']/div/a"));
	            txtPdt.click();
	            
	            Thread.sleep(1000);        
	            // Handle Windows 	            
	            ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	            //switch to new tab
	            driver.switchTo().window(newTb.get(1));
	            
	            // Take Screenshot
	            File from = ss.getScreenshotAs(OutputType.FILE);
	            File to =  new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 9.jpeg");
	            FileHandler.copy(from, to);
	            
	           
	            //QUESTION 10
                driver.get("https://www.amazon.in/");
                
                // Search Product 
                WebElement txtSearchAmaz = driver.findElement(By.id("twotabsearchtextbox"));
                txtSearchAmaz.sendKeys("motorola" + Keys.ENTER);
                
                // Take ScreenShot
                File srcAmaz = ss.getScreenshotAs(OutputType.FILE);
	            File destAmaz=  new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 10.jpeg");
	            FileHandler.copy(srcAmaz, destAmaz);
	            
	            
	            // QUESTION 11
                driver.get(" https://www.flipkart.com/");
	            
                // Check if Login is Present
	            if(driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).isDisplayed())
	            {
	            	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	            }
	            
	            // First MouseOver 
	            WebElement mvover = driver.findElement(By.xpath("//div[text()='Fashion']"));
	            a.moveToElement(mvover).perform();
	            
	            // Second MouseOver
	            WebElement mvoverkids = driver.findElement(By.xpath("//a[text()='Kids']"));
	            a.moveToElement(mvoverkids).perform();
	            
	            // Click Product
	            WebElement mvoverGirlDress = driver.findElement(By.xpath("//a[text()='Girls Dresses']"));
	            mvoverGirlDress.click();
	            
	            Thread.sleep(2000);
	            
	            // Take ScreenShot
	            File srcFlip = ss.getScreenshotAs(OutputType.FILE);
	            File destFlip =  new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 11.jpeg");
	            FileHandler.copy(srcFlip, destFlip);
	            
	            // QUESTION 12
	            driver.get("https://www.snapdeal.com/");
	             
	            // Search Product
	            WebElement txtSerachSnap = driver.findElement(By.name("keyword"));
	            txtSerachSnap.sendKeys("HP Laptop" + Keys.ENTER);
                
                // Take ScreenShot 
	            File srcHP = ss.getScreenshotAs(OutputType.FILE);
	            File desttHP =  new File("C:\\Users\\manoj\\eclipse-workspace\\SeleniumDay8\\ScreenShot\\Task 12.jpeg");
	            FileHandler.copy(srcHP, desttHP);
	
	            driver.quit();
	
	}
	
}
