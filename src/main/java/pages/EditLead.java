package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement cName;
	
	@Then("edit companyName as (.*)")
	public EditLead typeCompanyName(String company)
	{
		type(cName,company);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement fName;
	
	@And("edit firstName as (.*)")
	public EditLead typeFirstName(String data)
	{
		type(fName,data);
		return this;
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement lName;
	
	@And("edit lastName as (.*)")
	public EditLead typeLastName(String data)
	{
		type(lName,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement updateButton;
	
	@And("click on update button") 
	public ViewLead clickUpdate()
	{
		click(updateButton);
		return new ViewLead();
	}
	
}
