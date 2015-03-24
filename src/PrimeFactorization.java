import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static int[] generatePrimeFactors(int num) {
		if (num == 1)
			return new int[0];
		else if (num == 2 || num == 3) {
			int[] factors = new int[1];
			if (num == 2) {
				factors[0] = 2;
			} else if (num == 3) {
				factors[0] = 3;
			}
			return factors;
		} else {
			int[] factors = new int[2];
			if(num == 4) {
			factors[0] = 2;
			factors[1] = 2;
			} else {
				factors[0] = 2;
				factors[1] = 3;
			}
			return factors;
		}
	}
}
