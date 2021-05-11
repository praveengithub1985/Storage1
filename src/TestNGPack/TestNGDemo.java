package TestNGPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo 
{
	@Test (invocationCount=2,priority=1,description="Test1 Description")
	public void test1()
	{
		Reporter.log("1",true);
	}
	
	@Test (dependsOnMethods= {"test4","test3"},description="Test2 Description")
	public void test2()
	{
		Reporter.log("2",true);
	}
	
	@Test (enabled=true,description="Test3 Description")
	public void test3()
	{
		Reporter.log("3",true);
	}
	
	@Test (invocationCount=1,description="Test4 Description")
	public void test4()
	{
		Reporter.log("4",true);
		Assert.fail();
	}
	
	@Test (priority=-1,description="Test5 Description")
	public void test5()
	{
		Reporter.log("5",true);		
	}
}
