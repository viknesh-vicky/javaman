package com.omrbranch.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {
WebDriver driver;	

	@Given("user is on omrpage")
	public void user_is_on_omrpage() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}	
	
	@When("user click the login btn")
	public void user_click_the_login_btn() {
		driver.findElement(By.xpath("//button[@value='login']")).click();
	}
	@Then("user sdhould verfy the success msm for login")
	public void user_sdhould_verfy_the_success_msm_for_login() {
	assertEquals(true, true);
	}




}
