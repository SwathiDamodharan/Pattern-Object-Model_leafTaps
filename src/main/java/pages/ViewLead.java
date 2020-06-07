package pages;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {

	public ViewLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findLeads;
	
	public FindLead clickFindLeads() {
		click(findLeads);
		return new FindLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement editLead;
	
	@And("click on the Edit button")
	public EditLead clickEditLeads()
	{
		click(editLead);
		return new EditLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement deleteLead;
	
	public MyLeads clickDelete()
	{
		click(deleteLead);
		return new MyLeads();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement duplicateLead;
	
	public DuplicateLead clickDuplicateLead()
	{
		click(duplicateLead);
		return new DuplicateLead();
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement compareName;
	
	public ViewLead comapreduplicatedFirstName()
	{
		verifyExactText(compareName, capturedFirstName);
		return this;
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement editCompanyName;
	
	@And("verify the generated company name and edited company name is same")
	public ViewLead verifyCompanyNameUpdate(String data)
	{
		updatedCompanyName=editCompanyName.getText();
		String[] split = updatedCompanyName.split(" ");	
		splittedCompanyName = split[0];
		try {
				if(splittedCompanyName.equals(data)) {
					reportStep("The text: "+splittedCompanyName+" matches with the value :"+data,"PASS");
				}else {
					reportStep("The text "+splittedCompanyName+" doesn't matches the actual "+data,"FAIL");
				}
			} catch (WebDriverException e) {
				reportStep("Unknown exception occured while verifying the Text", "FAIL");
			} 
		
		return this;
	}
	
}
