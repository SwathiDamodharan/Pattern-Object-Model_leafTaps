package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Logout")
	private WebElement eleLogOut;
	
	@Then("clikc on logout")
	public LoginPage clickLogOut() {
		click(eleLogOut);
		return new LoginPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement crmsfa;
	
	@And("click the crmsfa link")
	public MyHomePage clickCrmsfa() {
	click(crmsfa);
	return new MyHomePage();
	}

}
