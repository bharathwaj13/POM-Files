package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	private WebElement eleDeleteButton;
	
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleDuplicateButton;
	
	@FindBy(how=How.XPATH,using="//div[text()='View Lead']")
	private WebElement eleViewLeadHeader;
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadLink;
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditButton;

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(eleFirstName, data);
		return this;
	}
	
	public ViewLeadPage verifyViewLeadHeader(String data) {
		verifyExactText(eleViewLeadHeader, data);
		return this;
	}
	
	public EditLeadPage clickEdit() {
		click(eleEditButton);
		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyCompanyName(String data) {
		verifyPartialText(eleCompanyName, data);
		return this;
	}
	
	public MyLeadsPage clickDeleteButton() {
		click(eleDeleteButton);
		return new MyLeadsPage();
	}
	
	public DuplicateLeadPage clickDuplicateButton() {
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
	
	public FindLeadsPage clickFindLeadLink() {
		click(eleFindLeadLink);
		return new FindLeadsPage();
	}
}


