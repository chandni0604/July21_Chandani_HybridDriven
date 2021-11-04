package com.technocredits.orghrm.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.DashboardPage;
import com.technocredits.orghrm.pages.MenuPage;
import com.technocredits.orghrm.pages.PIM_EmployeeAddPage;


public class PIM_EmployeeAddTest extends TestBase {

	private MenuPage menuPage;
	
	@BeforeClass
	public void setUp() {
		menuPage = super.setup();
	}
	
	@Test
	public void verifyAddEmployeeTest() {
		menuPage.navigateTo("PIM->Add Employee");
		PIM_EmployeeAddPage pim_EmployeeAddPage = new PIM_EmployeeAddPage();
		pim_EmployeeAddPage
			.setFirstName("New")
			.setMiddleName("K")
			.setLastName("Employee")
			.setLocation("Canadian Development Center")
			.clickOnNext()
			.setOtherID("0604")
			.setBirthdate("Thu, 06 Apr 1989")
			.setMaritalStatus("Single")
			.setGender("Female")
			.setNationality("Indian")
			.setLicenseNo("9819-10")
			.setLicenseExpiryDate("Mon, 06 Nov 2045")
			.setNickName("Cheenu")
			.setMilitaryService("Unknown")
			.setBloodGroup("A")
			.setHobbies("Reading")
			.setShirtSize("Medium")
			.clickOnNext()
			.setJoinedDt("Mon, 08 Nov 2021")
			.setPermanencyDt("Mon, 08 Nov 2021")
			.setJobTitle("CEO")
			.setEmpStatus("Full-Time Permanent")
			.setJobCategory("Professionals")
			//.setSubUnit("     QA Team")
			//.setCostCenter("0001")
			.setWorkShift("Twilight")
			//.setPayPolicy("New York Pay Policy")
			.setComments("Selnium Framework")
			.setRegion("Region-2")
			.setFTE("0.75")
			.setTempDept("Sub unit-2")
			.clickOnSave()
			.getEmployeeIDDetails();
		
		System.out.println("Verify saved Employee");
		String expectedAddedEmployee = "New Employee";
		String actualAddedEmployee = pim_EmployeeAddPage.getEmployeeIDDetails();
		softAsset.assertEquals(actualAddedEmployee, expectedAddedEmployee, "The added employee do not match");

		System.out.println("Added employee verified");
		}
	
	/*@Test
	public void verifyPersonalDetailsPageTitle(){
		
		PIM_EmployeeAddPage pim_EmployeeAddPage = new PIM_EmployeeAddPage();

		System.out.println("VERFIY - Add Employee page title should be Personal Details");
		String expectedAddEmployeePageTitle = "Personal Details";
		String actualAddEmployeePageTitle = pim_EmployeeAddPage.getPageTitle();
		softAsset.assertEquals(actualAddEmployeePageTitle, expectedAddEmployeePageTitle, "The page Title does not match");
		
		System.out.println("VERFIY - Add Employee page Header title should be Personal Details");
		String expectedAddEmployeePageHeaderTitle = "Personal Details";
		String actualAddEmployeePageHeaderTitle = pim_EmployeeAddPage.getPageHeaderTitle();
		softAsset.assertEquals(actualAddEmployeePageHeaderTitle, expectedAddEmployeePageHeaderTitle, "The page Header Title does not match");
		
		softAsset.assertAll();
	}*/
	
	@AfterMethod
	public void teardown() {
		PredefinedActions.closeBrowser();
	}
	
	
}
