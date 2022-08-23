package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {

	//webelement--->loginpage
	@FindBy(how=How.XPATH,using="//input[@id='emai']")//wrong email xpath--->email--->emai
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement login_btn;

	
	public WebElement getTxt_email() {
		return txt_email;
	}

	
	public WebElement getTxt_pass() {
		return txt_pass;
	}

	
	public WebElement getLogin_btn() {
		return login_btn;
	}

	
	
}
