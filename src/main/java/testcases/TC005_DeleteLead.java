package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends FindLeadsPage{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete a Lead and verify Lead is deleted";
		testNodes="Leads";
		category="Sanity";
		authors="Bharath";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void deleteLead(String uName,String pwd,String vName,String pNumber) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.typePhoneNumber(pNumber)
		.clickFindLeads()
		.getLeadID()
		.clickLeadID()
		.clickDeleteButton()
		.clickFindLeadsLink()
		.typeLeadID(leadID)
		.clickFindLeads()
		.verifyNoRecordsError();
	}

}
