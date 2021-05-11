package TestNGPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGAssertTrueVariations 
{
	@Test (description="Test1 Description")
	public void test1()
	{
		Assert.assertTrue(true);
	}
	
	@Test (description="Test2 Description")
	public void test2()
	{
		Assert.assertTrue(false);
	}
	
	@Test (description="Test3 Description")
	public void test3()
	{
		Assert.assertTrue(true,"No match found");
	}
	
	@Test (description="Test4 Description")
	public void test4()
	{
		Assert.assertTrue(false,"No match found");
	}
	
	@Test (description="Test5 Description")
	public void test5()
	{
		String n="Praveen Kumar";
		Assert.assertTrue(n.contains("Pravin"));
	}
	
	@Test (description="Test6 Description")
	public void test6()
	{
		String n="Praveen Kumar";
		Assert.assertTrue(n.contains("Pravin"),"No match found");
	}
}
