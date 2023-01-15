package com.qa.TestLayer;

import org.testng.annotations.Test;
import com.qa.PageLayer.Amazon_SignUp_Page;
import com.qa.TestBase.TestBase;

public class Test_Amazon_SignUp_Page extends TestBase {
	
	@Test(priority = 1)
	public void check_SignInPage() {
		verify_SignIn_Page_Functionality = new Amazon_SignUp_Page();
		verify_SignIn_Page_Functionality.clickOn_AccountsAndLists();
	}
	
	@Test(priority = 2)
	public void verify_SignIn_WithValidCredentials() {
		try{
			check_SignInPage();
		verify_SignIn_Page_Functionality.enter_EmailID("shubham.jadyar01@gmail.com");
		verify_SignIn_Page_Functionality.clickOn_ContinueButton();
		verify_SignIn_Page_Functionality.enter_Password("Jadyar@1997");
		verify_SignIn_Page_Functionality.clickOn_SignInButtton();
		verify_SignIn_Page_Functionality.clickOn_lnk_SignOut();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 3)
	public void verify_SignIn_WithValidEmailAndInvalidPassword() {
		try {
		check_SignInPage();
		verify_SignIn_Page_Functionality.enter_EmailID("shubham.jadyar01@gmail.com");
		verify_SignIn_Page_Functionality.clickOn_ContinueButton();
		verify_SignIn_Page_Functionality.enter_Password("Shubham@1111");
		verify_SignIn_Page_Functionality.clickOn_SignInButtton();
		verify_SignIn_Page_Functionality.getPassword_ErrorMessage();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	public void verify_SignIn_WithInvalidEmailAndValidPassword() {
		try {
		check_SignInPage();
		verify_SignIn_Page_Functionality.enter_EmailID("shubham897495@gmail.com");
		verify_SignIn_Page_Functionality.clickOn_ContinueButton();
		verify_SignIn_Page_Functionality.getEmail_ErrorMessage();
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5)
	public void check_lnk1_ConditionsOfUse() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk1_ConditionsOfUse();
	}
	
	@Test(priority = 6)
	public void check_lnk1_PrivacyNotice() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk1_PrivacyNotice();;
	}
	
	@Test(priority = 7)
	public void check_lnk_ForgotPassword() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk_ForgotPassword();
	}
	
	@Test(priority = 8)
	public void check_lnk_OtherIssues() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk_OtherIssues();
	}
	
	@Test(priority = 9)
	public void check_lnk_CreateYourAmazonAccount() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk_CreateYourAmazonAccount();
	}
	
	@Test(priority = 10)
	public void check_lnk2_ConditionsOfUse() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk2_ConditionsOfUse();
	}
	
	@Test(priority = 11)
	public void check_lnk2_PrivacyNotice() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk2_PrivacyNotice();
	}
	
	@Test(priority = 12)
	public void check_lnk_Help() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.clickOn_lnk_Help();
	}
	
	@Test(priority = 13)
	public void check_AmazonLogo() {
		check_SignInPage();
		verify_SignIn_Page_Functionality.checkAmazonLogo();
	}
}
