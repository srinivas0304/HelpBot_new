package com.helpBot.testcases;

import org.testng.annotations.Test;
import com.helpBot.baseclass.BaseClass;
import botPages.ChatBot;
import botPages.HelpAndContact;
import botPages.SearchPage;

public class ChatBotTest extends BaseClass
{
	HelpAndContact hc;
	SearchPage sp;
	ChatBot cb;
		
	@Test
	public void chatBotOpen() throws Exception
	{
		hc=new HelpAndContact();
		sp=hc.clickOn();
		System.out.println("Title of the page: "+driver.getTitle());
		sp.searchOpt();
		sp.selectArticle();
		cb=sp.scrollDown();
		cb.clickOnChatBot();
	}
}
