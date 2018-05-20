package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{

	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-panel-header sectionHeaderTitle']")
	private WebElement eleDuplicateLeadSectionHeader;
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitButton;
	
	public DuplicateLeadPage verifySectionHeader(String data) {
		verifyExactText(eleDuplicateLeadSectionHeader, data);
		return this;
	}
	
	public ViewLeadPage clickSubmitButton() {
		click(eleSubmitButton);
		return new ViewLeadPage();
	}
}


