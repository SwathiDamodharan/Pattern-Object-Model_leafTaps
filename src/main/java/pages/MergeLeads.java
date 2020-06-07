package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods {
	
	public MergeLeads()
	{
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how=How.XPATH,using="//span[text()='From Lead']/following::img")
	private WebElement flIcon;
	
	public FindLead clickFromLeadIcon()
	{
		click(flIcon);
		switchToWindow(1);
		return new FindLead();
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='To Lead']/following::img")
	private WebElement tlIcon;
	
	public FindLead clickToLeadIcon()
	{
		click(tlIcon);
		switchToWindow(1);
		return new FindLead();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement mergeButton;
	
	public ViewLead clickMergeLeadButton() throws InterruptedException
	{
		clickWithNoSnap(mergeButton);
		Thread.sleep(3000);
		acceptAlert();
		return new ViewLead();
	}

}
