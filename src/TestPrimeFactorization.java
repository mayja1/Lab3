import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class TestPrimeFactorization {

	
	@Test
	public void testPrimeFactorizationOf1() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(1);
		assertEquals(primeFactors.length, 0);
	}
	
	@Test
	public void testPrimeFactorizationOf2() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(2);
		assertEquals(primeFactors.length, 1);
		assertEquals(primeFactors[0], 2);
	}
}
