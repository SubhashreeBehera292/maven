package test;

import java.io.IOException;

import org.testng.annotations.Test;

import design.BaseTest;
import pom.POMActitimeLoginPage;

public class TESTActitimeLogin extends BaseTest 
{
	@Test
	public void enter() throws IOException
	{
		POMActitimeLoginPage pom=new POMActitimeLoginPage(driver);
		pom.loginMethod();
	}
}