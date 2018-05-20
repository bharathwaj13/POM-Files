package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//table[@id='widget_ComboBox_partyIdFrom']/following::a")
	private WebElement eleFromLead;
	
	@FindBy(how=How.XPATH,using="//table[@id='widget_ComboBox_partyIdTo']/following::a")
	private WebElement eleToLead;
	
	@FindBy(how=How.XPATH,using="//div[starts-with(@id,'x-form-el-ext-gen')]/input")
	private WebElement eleLeadIDText;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	@FindBy(how=How.XPATH,using="//table[@class='x-grid3-row-table']//a")
	private WebElement eleFirstLink;
	
	@FindBy(how=How.CLASS_NAME,using="buttonDangerous")
	private WebElement eleMergeLeadsButton;
	
	public MergeLeadsPage clickFromLead() {
		click(eleFromLead);
		switchToWindow(1);
		return this;
	}
	
	public MergeLeadsPage clickToLead() {
		click(eleToLead);
		switchToWindow(1);
		return this;
	}
	
	public MergeLeadsPage typeLeadID(String data) {
		type(eleLeadIDText,data);
		return this;
	}
	
	public MergeLeadsPage clickFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;
	}
	
	public MergeLeadsPage clickFirstLink() {
		clickWithNoSnap(eleFirstLink);
		switchToWindow(0);
		return this;
	}
	
	public ViewLeadPage clickMergeLeadsButton() {
		clickWithNoSnap(eleMergeLeadsButton);
		acceptAlert();
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	
	
	
	
	

}
