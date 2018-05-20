package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	public static String leadID;
	
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//table[@class='x-grid3-row-table']//a")
	private WebElement eleFirstLead;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement eleFirstNameLink;
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-form-element']/input[@name='id']")
	private WebElement eleLeadIDEdit;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	@FindBy(how=How.XPATH,using="(//a[@class='x-tab-right'])[2]")
	private WebElement elePhoneTab;
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneNumber;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleLeadID;
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleNoRecordsError;
	
	@FindBy(how=How.XPATH,using="(//a[@class='x-tab-right'])[3]")
	private WebElement eleEmailTab;
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailAddress;
	
	
	public ViewLeadPage clickFirstLead() {
		click(eleFirstLead);
		return new ViewLeadPage();
	}
	
	public FindLeadsPage typeFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	
	public FindLeadsPage clickFindLeads() {
		click(eleFindLeads);
		return this;
	}
	
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	public FindLeadsPage typePhoneNumber(String data) {
		type(elePhoneNumber,data);
		return this;
	}
	
	public FindLeadsPage getLeadID() {
		leadID = getText(eleLeadID);
		return this;
	}
	
	public ViewLeadPage clickLeadID() {
		click(eleLeadID);
		return new ViewLeadPage();
	}
	
	public FindLeadsPage typeLeadID(String data) {
		type(eleLeadIDEdit,data);
		return this;
	}
	
	public ViewLeadPage verifyNoRecordsError() {
		verifyDisplayed(eleNoRecordsError);
		return new ViewLeadPage();
	}
	
	public FindLeadsPage clickEmailTab() {
		click(eleEmailTab);
		return this;
	}
	
	public FindLeadsPage typeEmailAddress(String data) {
		type(eleEmailAddress,data);
		return this;
	}
	
	public ViewLeadPage clickFirstNameLink() {
		click(eleFirstNameLink);
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	

}
