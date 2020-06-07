package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{


	public CreateLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyname;

	@Then("enter company name as (.*)") 
	public CreateLead typeCompanyName(String data) {
		// eleUName = locateElement("username");
		type(companyname,data);		
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstname;
	
	@And("enter first name as (.*)") 
	public CreateLead typeFirstName(String data)
	{
		type(firstname,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastname;
	
	@And("enter last name as (.*)") 
	public CreateLead typeLastName(String data)
	{
		type(lastname,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement phonenum;
	
	@And("enter phone number as (.*)") 
	public CreateLead typePhoneNum(String data)
	{
		type(phonenum,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement email;
	
	@And("enter mail id as (.*)") 
	public CreateLead typeEmail(String data)
	{
		type(email,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton' and @value='Create Lead']")
	private WebElement submit;
	
	@Then("click on create lead button")
	public LoginPage clickCreateLeadButton()
	{
		click(submit);
		return new LoginPage();
	}
	
	
	
	




}
