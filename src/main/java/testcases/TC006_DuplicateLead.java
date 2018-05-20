package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends FindLeadsPage{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Delete a Lead and verify FirstName";
		testNodes="Leads";
		category="Sanity";
		authors="Bharath";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void duplicateLead(String uName,String pwd,String vName,String emailAddress,String sectionHeader,String fName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeadsLink()
		.clickEmailTab()
		.typeEmailAddress(emailAddress)
		.clickFindLeads()
		.clickFirstNameLink()
		.clickDuplicateButton()
		.verifySectionHeader(sectionHeader)
		.clickSubmitButton()
		.verifyFirstName(fName);
	}

}
