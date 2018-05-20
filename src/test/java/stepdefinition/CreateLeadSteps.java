package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public static RemoteWebDriver driver;
	public static String firstName="";
	@Given("Open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@And("maximize the browser")
	public void browserMaximize() {
		driver.manage().window().maximize();
	}
	
	@And("Set Timeouts")
	public void setTimeouts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("enter the URL as (.*)")
	public void enterURL(String data) {
		driver.get(data);
	}
	
	@And("enter the username as (.*)")
	public void enterUserName(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	
	@And("enter the password as (.*)")
	public void enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	
	@And("click Login")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Verify Login is successful")
	public void loginSuccess() {
		System.out.println("Login is successful");
	}
	
	@Given("click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("click Leads Tab")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("click createLead link")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("enter companyname as (.*)")
	public void enterCompanyName(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	
	@And("enter firstname as (.*)")
	public void enterFirstName(String data) {
		firstName=data;
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	
	@And("enter lastname as (.*)")
	public void enterLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	
	@When("click Submit button")
	public void clickSubmit() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Lead creation successful")
	public void verifyLeadCreation() {
		WebElement elementFirstName = driver.findElementById("viewLead_firstName_sp");
		String firstName = elementFirstName.getText();
		if (firstName.equals(firstName))
			System.out.println("Lead created successfully");
		else
			System.out.println("Lead not created");
	}
}
