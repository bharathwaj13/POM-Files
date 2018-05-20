package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit a Lead and verify EditedValue";
		testNodes="Leads";
		category="Smoke";
		authors="Bharath";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void editLead(String uName,String pwd,String vName,String fName,String viewLeadHeader,String cName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeadsLink()
		.typeFirstName(fName)
		.clickFindLeads()
		.clickFirstLead()
		.verifyViewLeadHeader(viewLeadHeader)
		.clickEdit()
		.typeCompanyName(cName)
		.clickSubmit()
		.verifyCompanyName(cName);
	}

}
