package testcases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class LogIn extends ProjectMethods{	

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC001";
		testDescription = "Login to LeafTaps";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC001";

	}

	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd) {
		
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickLogOut();
	}



}
