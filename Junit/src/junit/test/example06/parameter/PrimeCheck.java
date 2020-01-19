package junit.test.example06.parameter;

public class PrimeCheck {
	public Boolean primeNumberCheck(final Integer primeNum) {
		for (int i = 2; i < (primeNum/2); i++) {
			if(primeNum % i ==0) {
				return false;
			}
		}
		return true;
	}
}
