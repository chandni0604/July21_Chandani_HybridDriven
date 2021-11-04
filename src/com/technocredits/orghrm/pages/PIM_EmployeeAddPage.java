package com.technocredits.orghrm.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.technocredits.orghrm.base.PredefinedActions;

public class PIM_EmployeeAddPage extends PredefinedActions {

	public PIM_EmployeeAddPage setFirstName(String fname) {
		driver.findElement(By.xpath("//input[@id='first-name-box']")).sendKeys(fname);
		return this;
	}
	
	public PIM_EmployeeAddPage setLastName(String lname) {
		driver.findElement(By.xpath("//input[@id='last-name-box']")).sendKeys(lname);
		return this;
	}
			
	public PIM_EmployeeAddPage setMiddleName(String mname) {
		driver.findElement(By.xpath("//input[@id='middle-name-box']")).sendKeys(mname);
		return this;
	}
	
	public PIM_EmployeeAddPage setLocation(String location) {
		driver.findElement(By.xpath("//i[text()= 'arrow_drop_down']")).click();
		driver.findElement(By.xpath("//span[text() = '"+location+"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage clickOnNext() {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60); // 1000 ms
		return this;
	}
		
	
	public String getPageTitle() {
		String pageTitle = driver.findElement(By.xpath("//div[@class='container col s12']//li[@class='page-title navbar-title-last-list-item']")).getText();
		System.out.println(pageTitle);
		return pageTitle;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 60); // 1000 ms
	
	public String getPageHeaderTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public PIM_EmployeeAddPage setOtherID(String otherid) {
		driver.findElement(By.xpath("//input[@id='otherId']")).sendKeys(otherid);
		return this;
	}
	
	public PIM_EmployeeAddPage setBirthdate(String birthdate) {
		driver.findElement(By.xpath("//input[@id='emp_birthday']")).sendKeys(birthdate);
		return this;
	}
	
	
	public PIM_EmployeeAddPage setMaritalStatus(String MaritalStatus) {
		driver.findElement(By.xpath("//div[@id='emp_marital_status_inputfileddiv']//input[@class = 'select-dropdown']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ MaritalStatus +"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage setGender(String Gender) {
		driver.findElement(By.xpath("//div[@id='emp_gender_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ Gender +"']")).click();
		return this;
	}
	public PIM_EmployeeAddPage setNationality(String Nationality) {
		driver.findElement(By.xpath("//div[@id='nation_code_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ Nationality +"']")).click();
		return this;
	}
	

	public PIM_EmployeeAddPage setLicenseNo(String licenseNo) {
		driver.findElement(By.xpath("//input[@id='licenseNo']")).sendKeys(licenseNo);
		return this;
	}
		
	public PIM_EmployeeAddPage setLicenseExpiryDate(String licenseexpiryDt) {
		driver.findElement(By.xpath("//input[@id='emp_dri_lice_exp_date']")).sendKeys(licenseexpiryDt);
		return this;
	}
	
	public PIM_EmployeeAddPage setNickName(String nickname) {
		driver.findElement(By.xpath("//input[@id='nickName']")).sendKeys(nickname);
		return this;
	}
	
	public PIM_EmployeeAddPage setMilitaryService(String militrySrvc) {
		driver.findElement(By.xpath("//input[@id='militaryService']")).sendKeys(militrySrvc);
		return this;
	}
			
	public PIM_EmployeeAddPage setBloodGroup(String bloodgrp) {
		driver.findElement(By.xpath("//div[@id='1_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ bloodgrp +"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage setHobbies(String hobbies) {
		driver.findElement(By.xpath("//input[@id='5']")).sendKeys(hobbies);
		return this;
	}
	
	public PIM_EmployeeAddPage setShirtSize(String shirtsize) {
		driver.findElement(By.xpath("//div[@id='19_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ shirtsize +"']")).click();
		return this;
	}
	
	WebDriverWait wait1 = new WebDriverWait(driver, 60); // 1000 ms
	
	/*-------------------------------------------------------------*/

	public PIM_EmployeeAddPage setJoinedDt (String joineddt) {
		driver.findElement(By.xpath("//input[@id='joined_date']")).sendKeys(joineddt);
		return this;
	}
	
	public PIM_EmployeeAddPage setPermanencyDt(String permDt) {
		driver.findElement(By.xpath("//input[@id='date_of_permanency']")).sendKeys(permDt);
		return this;
	}
	
	public PIM_EmployeeAddPage setJobTitle(String jobTitle) {
		driver.findElement(By.xpath("//div[@id='job_title_id_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ jobTitle +"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage setEmpStatus(String empstatus) {
		driver.findElement(By.xpath("//div[@id='employment_status_id_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ empstatus +"']")).click();
		return this;
	}

	
	public PIM_EmployeeAddPage setJobCategory (String jobcatgry) {
		driver.findElement(By.xpath("//div[@id='job_category_id_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ jobcatgry +"']")).click();
		return this;
	}
	
	
	/*public PIM_EmployeeAddPage setSubUnit(String subunit) {
		driver.findElement(By.xpath("//div[@id='subunit_id_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ subunit +"']")).click();
		return this;
	}*/
	
	/*public PIM_EmployeeAddPage setCostCenter(String costcnter) {
		driver.findElement(By.xpath("//input[@id='costCentre_value']")).sendKeys(costcnter);
		WebDriverWait wait = new WebDriverWait(driver, 30); // 1000 ms
		driver.findElement(By.xpath("//input[@id='costCentre_value']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='costCentre_value']")).sendKeys(Keys.ENTER);
		return this;
	}*/
	
	public PIM_EmployeeAddPage setWorkShift(String workshift) {
		driver.findElement(By.xpath("//div[@id='work_shift_id_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ workshift +"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage setComments(String comments) {
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys(comments);
		return this;
	}
	
	public PIM_EmployeeAddPage setRegion(String region) {
		driver.findElement(By.xpath("//div[@id='9_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ region +"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage setFTE(String fte) {
		driver.findElement(By.xpath("//div[@id='10_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ fte +"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage setTempDept(String tempdpt) {
		driver.findElement(By.xpath("//div[@id='11_inputfileddiv']")).click();
		driver.findElement(By.xpath("//span[text() = '"+ tempdpt +"']")).click();
		return this;
	}
	
	public PIM_EmployeeAddPage clickOnSave() {
		WebDriverWait wait = new WebDriverWait(driver, 30); // 1000 ms
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		return this;
	}
	
	WebDriverWait wait2 = new WebDriverWait(driver, 60); // 1000 ms
	
	public String getEmployeeIDDetails() {
		WebDriverWait wait = new WebDriverWait(driver, 60); // 1000 ms
		String empname = driver.findElement(By.xpath("//span[@id='pim.navbar.employeeName']")).getText();
		System.out.println(empname);
		return empname;
	}
}

