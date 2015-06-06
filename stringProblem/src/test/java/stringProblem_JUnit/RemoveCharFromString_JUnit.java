package stringProblem_JUnit;

import org.junit.Before;
import org.junit.Test;
import org.testng.AssertJUnit;

public class RemoveCharFromString_JUnit {

	@Before
	public void setUp() throws Exception {
		AssertJUnit.assertEquals("abracadabra", "abracadabra");
	}

	@Test
	public void test() {
		AssertJUnit.assertEquals("abracadabra", "abracadabra");
		
	}

}
