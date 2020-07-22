package zSundayBatch;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLearning {

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		
		
		WebDriverManager.chromedriver().setup(); // 
		//WebDriverManager.firefoxdriver().setup();
		
		
		//System.setProperty("webdriver.chrome.driver", "//Users//rasulm//Downloads//chromedriver");

		
		
		// Open A Chrome Browser 
		ChromeDriver mychrome = new ChromeDriver();
		
		
		// Go to your This  web stie 
		mychrome.get("https://www.demo.iscripts.com/multicart/demo/");
		
		// Click LInk to start the sign in process
		mychrome.findElement(By.xpath("//*[@id='dLabellogin']")).click();
		
		mychrome.findElement(By.xpath("//*[@id='username']")).sendKeys("user");
		mychrome.findElement(By.xpath("//*[@id='password']")).sendKeys("pass");

		mychrome.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mychrome.close();
		
		
		
		
	}

}
