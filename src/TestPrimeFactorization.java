import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class TestPrimeFactorization {

	
	@Test
	public void testPrimeFactorizationOf1() {
		List<Integer> primeFactors = PrimeFactorization.generatePrimeFactors(1);
		assertEquals(primeFactors.size(), 0);
	}
	
	@Test
	public void testPrimeFactorizationOf2() {
		List<Integer> primeFactors = PrimeFactorization.generatePrimeFactors(1);
		assertEquals(primeFactors.size(), 1);
		assertEquals(primeFactors.get(0).intValue(), 2);
	}
}
