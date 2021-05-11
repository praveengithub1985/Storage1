package TestNGPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGAssertEqualsVariations 
{
	@Test (description="Test1 Description")
	public void test1()
	{
		Assert.assertEquals("Hi","hi","Didn't Match");
	}
	
	@Test (description="Test2 Description")
	public void test2()
	{
		Assert.assertEquals(12,12,"Didn't Match");
	}	
}
