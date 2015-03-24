import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class TestGeneratingPrimeNumbers {
	   private Integer inputNumber;
	   private int[] expectedResult;

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
	   public TestGeneratingPrimeNumbers(Integer inputNumber, 
	      List<Integer> expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = new int[expectedResult.size()];
	      for(int i = 0; i < expectedResult.size(); i++) {
	    	  this.expectedResult[i] = (Integer) expectedResult.get(i);
	      }
	   }

	   @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 1, Arrays.asList()},
	      });
	   }

	   // This test will run 4 times since we have 5 parameters defined
	   @Test
	   public void testPrimeNumberChecker() {
	      System.out.println("Parameterized Number is : " + inputNumber);
	      int[] actual =  PrimeFactorization.generatePrimeNumbers(inputNumber);
	      assertEquals(expectedResult.length, actual.length);
	      for(int i = 0; i < expectedResult.length; i++) {
	      assertEquals(expectedResult[i], actual[i]);
	      }
	   }
}