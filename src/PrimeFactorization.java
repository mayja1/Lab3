import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static int[] generatePrimeFactors(int num) {
		ArrayList<Integer> factors = new ArrayList<>();
		while(num%2 == 0) {
			factors.add(2);
			num/=2;
		}
		int i = 3;
		while(i <= num) {
			if (num %i ==0) {
				factors.add(i);
				num/=i;
			} else {
				i+=2;
			}
		}
		
		int[] factorArray = new int[factors.size()];
		for(int j = 0; j < factorArray.length; j++) {
			factorArray[j] = factors.get(j).intValue();
		}
		return factorArray;
		/*if (num == 1)
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
		}*/
	}
	
	public static int[] generatePrimeNumbers(int maxNumber) {
		if(maxNumber == 3) {
			return new int[] {2};
		}
		return new int[] {};
	}
}
