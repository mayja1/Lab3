import java.util.ArrayList;
import java.util.List;


public class PrimeFactorization {

	public static int[] generatePrimeFactors(int num) {
		if(num == 1)
			return new int[0];
		int[] factors = new int[1];
		factors[0] = 2;
		return factors;
	}
}
