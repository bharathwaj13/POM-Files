package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends FindLeadsPage{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge 2 Leads and verify first Lead does not exist";
		testNodes="Leads";
		category="Sanity";
		authors="Bharath";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String vName,String fromLeadID,String toLeadID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeadsLink()
		.clickFromLead()
		.typeLeadID(fromLeadID)
		.clickFindLeadsButton()
		.clickFirstLink()
		.clickToLead()
		.typeLeadID(toLeadID)
		.clickFindLeadsButton()
		.clickFirstLink()
		.clickMergeLeadsButton()
		.clickFindLeadLink()
		.typeLeadID(fromLeadID)
		.clickFindLeads()
		.verifyNoRecordsError();
	}

}
