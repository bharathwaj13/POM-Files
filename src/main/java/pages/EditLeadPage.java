package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleEditButton;
	
	public EditLeadPage clearCompanyName() {
		clearText(eleCompanyName);
		return this;
	}
	public EditLeadPage typeCompanyName(String data) {
		type(eleCompanyName,data);
		return this;
	}
	
	public ViewLeadPage clickSubmit() {
		click(eleEditButton);
		return new ViewLeadPage();
	}

}


