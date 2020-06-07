package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{


	public MyLeads() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createLeads;

	@And("click create lead link")	
	public CreateLead clickCreateLead() {
		// eleUName = locateElement("username");
		click(createLeads);		
		return new CreateLead();
	}
	
	 
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findLeads;
	
	@And("click on Find Leads link")
	public FindLead clickFindLeads() {
		click(findLeads);
		return new FindLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement mergeLead;
	
	public MergeLeads clickMergeLeadd()
	{
		click(mergeLead);
		return new MergeLeads();
	}
}
