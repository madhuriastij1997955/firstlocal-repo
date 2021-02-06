package login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void print3() {
		int a=10; int b=20;
		Assert.assertEquals(30, a+b);
		System.out.println("test2");
	}
	@Test
	public void print4() {
		int a=10; int b=20;
		Assert.assertEquals(10, b-a);
	}
}
