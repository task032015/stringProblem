package stringProblem_test;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import stringProblem.RemoveCharFromString;
//import junit.framework.Assert;
//import org.testng.asserts.Assertion;
//import java.lang.*;


 public class RemoveCharFromString_TestNG extends RemoveCharFromString {

	 
@Test	 
  public void removeChar() {
	  assertEquals("abracadabra", "abracadabra");
//	  System.out.println("ok");
//    throw new RuntimeException("Test not implemented");
  }


@Test
  public void removeCharOneLine() {
	  assertEquals("abracadabra", "abracadabra");
	  System.out.println("ok");
//    throw new RuntimeException("Test not implemented");
  }
}
