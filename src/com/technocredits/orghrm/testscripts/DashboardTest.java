package com.technocredits.orghrm.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.technocredits.orghrm.pages.DashboardPage;

public class DashboardTest extends TestBase {
	
	@BeforeClass
	public void setUp() {
		super.setup();
	}
	
	@Test
	public void verifyWidgetsTest() {
		
		System.out.println("VERFIY - Dashboard page title should be Dashboard");
		DashboardPage dashboardPage = new DashboardPage();
		String expectedDashboardPageHeaderTitle = "Dashboard";
		String actualDashboardPageHeaderTitle = dashboardPage.getPageHeaderTitle();
		softAsset.assertEquals(actualDashboardPageHeaderTitle, expectedDashboardPageHeaderTitle);
		
		String expectedDashboardPageTitle = "Dashboard";
		String actualDashboardPageTitle = dashboardPage.getPageTitle();
		softAsset.assertEquals(actualDashboardPageTitle, expectedDashboardPageTitle);
		
		System.out.println("VERIFY - total 12 widget's are disply on Dashboard page");
		int totalWidgets = dashboardPage.getTotalWidgets();
		softAsset.assertEquals(totalWidgets, 12);
		softAsset.assertAll();
	}
	

	public void tearDown() {
		super.teardown();
	}
	
	
}
