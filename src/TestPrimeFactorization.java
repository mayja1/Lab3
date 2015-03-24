import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class TestPrimeFactorization {

	
	@Test
	public void testPrimeFactorizationOf1() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(1);
		assertEquals(0, primeFactors.length);
	}
	
	@Test
	public void testPrimeFactorizationOf2() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(2);
		assertEquals(1, primeFactors.length);
		assertEquals(2, primeFactors[0]);
	}
	
	@Test
	public void testPrimeFactorizationOf3() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(3);
		assertEquals(1, primeFactors.length);
		assertEquals(3, primeFactors[0]);
	}
	
	@Test
	public void testPrimeFactorizationOf4() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(4);
		assertEquals(2, primeFactors.length);
		assertEquals(2, primeFactors[0]);
		assertEquals(2, primeFactors[1]);
	}
	
	@Test
	public void testPrimeFactorizationOf6() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(6);
		assertEquals(2, primeFactors.length);
		assertEquals(2, primeFactors[0]);
		assertEquals(3, primeFactors[1]);
	}
	
	@Test
	public void testPrimeFactorizationOf9() {
		int[] primeFactors = PrimeFactorization.generatePrimeFactors(9);
		assertEquals(2, primeFactors.length);
		assertEquals(3, primeFactors[0]);
		assertEquals(3, primeFactors[1]);
	}
}
