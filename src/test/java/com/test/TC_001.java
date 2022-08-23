package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TC_001 extends BaseClass {

	@Test
	public void varify_testlogin_validCredential() {
		
		loginpom login=PageFactory.initElements(driver, loginpom.class );
		Library.custom_sendkeys(login.getTxt_email(),excel.getStringData("Sheet1", 0, 0),"email");
		Library.custom_sendkeys(login.getTxt_pass(),excel.getStringData("Sheet2", 0, 0),"pass");
		Library.custom_click(login.getLogin_btn(),"login");
		Library.custom_HandleDropDown(null, null);	
		Library.custom_HandleMouseOver_click(driver, null);
	}
}
