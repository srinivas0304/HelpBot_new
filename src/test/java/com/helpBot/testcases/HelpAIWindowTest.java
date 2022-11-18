package com.helpBot.testcases;

import org.testng.annotations.Test;
import com.helpBot.baseclass.BaseClass;
import botPages.ChatBot;
import botPages.BotWindowPage;
import botPages.HelpAndContact;
import botPages.SearchPage;

public class HelpAIWindowTest extends BaseClass
{
	HelpAndContact hc;
	SearchPage sp;
	ChatBot cb;
	BotWindowPage hw;
	
	@Test
	public void helpWindow() throws Exception
	{
		hc=new HelpAndContact();
		sp=hc.clickOn();
		//System.out.println("Title: "+driver.getTitle());
		sp.searchOpt();
		sp.selectArticle();
		cb=sp.scrollDown();
		hw=cb.clickOnChatBot();
		hw.cannotSignin();
		hw.verifyTimeStamp();		
	}
}
