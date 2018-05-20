package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLead;
	
	public CreateLeads clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeads();
	}
	
	public FindLeadsPage clickFindLeadsLink() {
		click(eleFindLeads);
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage clickMergeLeadsLink() {
		click(eleMergeLead);
		return new MergeLeadsPage();
	}
	
	
	
	
	
	
	
	
	
	
	

}
