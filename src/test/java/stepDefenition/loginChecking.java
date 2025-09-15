package stepDefenition;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginChecking {
	WebDriver w=new ChromeDriver();
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		w.get("https://ess.changepond.com/#/");
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
//	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter valid username and password in fields")
	public void enter_valid_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		w.findElement(By.name("empid")).sendKeys("4726");
		w.findElement(By.name("password")).sendKeys("8500");
 //throw new io.cucumber.java.PendingException();
	}

	@And("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div/div/form/button")).click();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		w.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/main/div[2]/div/div[3]/div/h6/button")).click();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		w.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/main/div[3]/div[2]/div/div[1]/div/div[1]/div[2]/button")).click();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		w.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/main/div[2]/div[1]/main/div/div[2]/button")).click();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	
		
		


		
	}

	@Then("user should navigate to next page")
	public void user_should_navigate_to_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		System.out.println(w.getCurrentUrl());
	  //  throw new io.cucumber.java.PendingException();
	}

}
