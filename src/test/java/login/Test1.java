package login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void print1() {
		int a=10; int b=20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void print2() {
		int a=10; int b=20;
		Assert.assertEquals(10, b-a);
	}
}
