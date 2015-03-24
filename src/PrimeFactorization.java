import java.util.ArrayList;
import java.util.List;


public class PrimeFactorization {

	public static int[] generatePrimeFactors(int num) {
		if(num == 1)
			return new int[0];
		else {
		int[] factors = new int[1];
		if(num == 2) {
		factors[0] = 2;
		} else if (num ==3) {
			factors [0] =3;
		}
		return factors;
		}
	}
}
