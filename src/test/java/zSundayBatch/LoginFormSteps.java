package zSundayBatch;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
import io.cucumber.junit.*;

public class LoginFormSteps {
	
	ChromeDriver mychrome;
	
	@Given("I browse to https:\\/\\/www.demo.iscripts.com\\/multicart\\/demo\\/index.php")
	public void i_browse_to_https_www_demo_iscripts_com_multicart_demo_index_php() {
		WebDriverManager.chromedriver().setup(); // 
		mychrome = new ChromeDriver();
		mychrome.get("https://www.demo.iscripts.com/multicart/demo/");
	}

	@Then("I expect a login form with ID Password & login button exist")
	public void i_expect_a_login_form_with_id_password_login_button_exist() {
		
		// 1. Click Login Link At Top Right Corner Of the Page 
		mychrome.findElement(By.xpath("//*[@id='dLabellogin']")).click();
		
		
		// 2. Check [ID Field] & [ID Label] Is Available 
		boolean userNameFiledExist = mychrome.findElement(By.xpath("//*[@id='username']")).isDisplayed();
		Assert.assertEquals("Failed User NameField Not Exist", true, userNameFiledExist);
		
		
		String placeHolderValue = mychrome.findElement(By.xpath("//*[@id='username']")).getAttribute("placeholder");
		Assert.assertEquals("Failed Placeholder Not Matched", "User Name", placeHolderValue);

		

		
		// Check Password Field & Password Label is Available 
		
		// Check Login Button is Aviablale 
		
		
	}

	
	
	
	
	
	
	
	@Then("I expect a signUp option available inside login form")
	public void i_expect_a_sign_up_option_available_inside_login_form() {
	    // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	}

	@Then("I expect a forgotpassword link option available inside login form")
	public void i_expect_a_forgotpassword_link_option_available_inside_login_form() {
	    // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	}

}
