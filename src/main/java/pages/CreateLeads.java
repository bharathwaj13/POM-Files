package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods{
	
	public CreateLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLead;
	
	public CreateLeads typeCompanyName(String data) {
		type(eleCompanyName,data);
		return this;
	}
	
	public CreateLeads typeFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	public CreateLeads typeLastName(String data) {
		type(eleLastName,data);
		return this;
	}
	
	public ViewLeadPage clickCreateLeads() {
		click(eleCreateLead);
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
