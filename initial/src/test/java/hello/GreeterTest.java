package hello;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {
	private Greeter greeter = new Greeter();
	
	@Test
	public void greeterSaysHello() {
		Assert.assertThat(greeter.sayHello(), CoreMatchers.containsString("Hello"));
	}
}
