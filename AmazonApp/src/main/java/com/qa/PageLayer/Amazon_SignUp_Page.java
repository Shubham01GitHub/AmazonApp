package com.qa.PageLayer;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.TestBase.TestBase;

public class Amazon_SignUp_Page extends TestBase {

	// Declaration
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement lnk_accountsAndLists;
	
	@FindBy(xpath = "//a/i[@class='a-icon a-icon-logo']")
	private WebElement logo_Amazon;
	
	@FindBy(xpath = "//a[text()='Conditions of Use']")
	private WebElement lnk1_ConditionsOfUse;
	
	@FindBy(xpath = "//a[text()='Privacy Notice']")
	private WebElement lnk1_PrivacyNotice;
	
	@FindBy(xpath = "//span[@class='a-expander-prompt']")
	private WebElement lnk_NeedHelp;
	
	@FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
	private WebElement lnk_ForgotPassword;
	
	@FindBy(xpath = "//a[@id='ap-other-signin-issues-link']")
	private WebElement lnk_OtherIssues;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']") 
	private WebElement lnk_CreateYourAmazonAccount;
	 
	@FindBy(xpath = "(//a[@class='a-link-normal'])[4]")
	private WebElement lnk2_ConditionsOfUse;
	
	@FindBy(xpath = "(//a[@class='a-link-normal'])[5]")
	private WebElement lnk2_PrivacyNotice;
	
	@FindBy(xpath = "(//a[@class='a-link-normal'])[6]")
	private WebElement lnk_Help;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement txtBox_Email;
	
	@FindBy(xpath = "//span[@id='continue']")
	private WebElement btn_Continue;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtBox_Password;
	
	@FindBy(xpath = "//div[@id='auth-error-message-box']/div/div")
	private WebElement password_ErrorMessage; 
	
	@FindBy(xpath = "//div[@id='auth-error-message-box']/div/div")
	private WebElement email_ErrorMessage; 
	
	@FindBy(xpath = "//span[@id='auth-signin-button']")
	private WebElement btn_SignIn;
	
	@FindBy(xpath = "//a[@id='nav-item-signout']")
	private WebElement lnk_SignOut;

	// Initialization
	public Amazon_SignUp_Page() {
		PageFactory.initElements(driver, this);
	}

	// Usage or Action Methods
	public void clickOn_AccountsAndLists() {
		lnk_accountsAndLists.click();
	}
	
	public void checkAmazonLogo() {
		boolean actual = logo_Amazon.isDisplayed();
		Assert.assertEquals(actual, true , "Logo is not Displayed.");
	}
	
	public void clickOn_lnk1_ConditionsOfUse() {
		lnk1_ConditionsOfUse.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void clickOn_lnk1_PrivacyNotice() {
		lnk1_PrivacyNotice.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void clickOn_lnk_ForgotPassword() {
		lnk_NeedHelp.click();
		lnk_ForgotPassword.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void clickOn_lnk_OtherIssues() {
		lnk_NeedHelp.click();
		lnk_OtherIssues.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void clickOn_lnk_CreateYourAmazonAccount() {
		lnk_CreateYourAmazonAccount.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void clickOn_lnk2_ConditionsOfUse() {
		lnk2_ConditionsOfUse.click();
		Set<String> windowId1 = driver.getWindowHandles();
		ArrayList arrayList1 = new ArrayList(windowId1);
		driver.switchTo().window((String) arrayList1.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void clickOn_lnk2_PrivacyNotice() {
		lnk2_PrivacyNotice.click();
		Set<String> windowId2 = driver.getWindowHandles();
		ArrayList arrayList2 = new ArrayList(windowId2);
		driver.switchTo().window((String) arrayList2.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void clickOn_lnk_Help() {
		lnk_Help.click();
		Set<String> windowId3 = driver.getWindowHandles();
		ArrayList arrayList3 = new ArrayList(windowId3);
		driver.switchTo().window((String) arrayList3.get(1));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	public void enter_EmailID (String email) {
		txtBox_Email.click();
		txtBox_Email.sendKeys(email);
		String txtBox_Value = txtBox_Email.getAttribute("value");
		System.out.println(txtBox_Value);
	}
	
	public void clickOn_ContinueButton() {
		btn_Continue.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void enter_Password (String password) {
		txtBox_Password.click();
		txtBox_Password.sendKeys(password);
		String txtBox_Value = txtBox_Password.getAttribute("value");
		System.out.println(txtBox_Value);
	}
	
	public void clickOn_SignInButtton() {
		btn_SignIn.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	public void getPassword_ErrorMessage() {
		String passError = password_ErrorMessage.getText();
		System.out.println(passError);
	}
	
	public void getEmail_ErrorMessage() {
		String emailError = email_ErrorMessage.getText();
		System.out.println(emailError);
	}
	
	public void clickOn_lnk_SignOut() {
		act = new Actions(driver);
		act.moveToElement(lnk_accountsAndLists).perform();
		act.moveToElement(lnk_SignOut).click().build().perform();
	}
}