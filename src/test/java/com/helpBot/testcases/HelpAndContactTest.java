package com.helpBot.testcases;

import org.testng.annotations.Test;
import com.helpBot.baseclass.BaseClass;
import botPages.HelpAndContact;

public class HelpAndContactTest extends BaseClass
{
	HelpAndContact help;
	
	@Test
	public void clickOnHelpAnContact() throws Exception
	{
		help=new HelpAndContact();
		help.clickOn();
	}
}
