package TestNGPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParallelDemo 
{
	@Parameters("Param")
	@Test (invocationCount=2,priority=1,description="Test1 Description")
	public void test1(String paramName) 
	{
		System.out.println("test1 "+paramName+Thread.currentThread().getId());		
	}
	
	@Parameters("Param")
	@Test (dependsOnMethods= {"test4","test3"},description="Test2 Description")
	public void test2(String paramName)
	{
		System.out.println("test2 "+paramName+Thread.currentThread().getId());
	}
		
	
	@Parameters("Param")
	@Test (enabled=true,description="Test3 Description")
	public void test3(String paramName)
	{
		System.out.println("test3 "+paramName+Thread.currentThread().getId());
	}
	
	@Parameters("Param")
	@Test (invocationCount=1,description="Test4 Description")
	public void test4(String paramName)
	{
		System.out.println("test4 "+paramName+Thread.currentThread().getId());
		Assert.fail();
	}
	
	@Parameters("Param")
	@Test (priority=-1,description="Test5 Description")
	public void test5(String paramName)
	{
		System.out.println("test5 "+paramName+Thread.currentThread().getId());	
	}
}
