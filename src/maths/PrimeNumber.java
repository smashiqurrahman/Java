package maths;

public class PrimeNumber {
	public void primeNumber() {
		int theNumber = 13;
		boolean flag = true;

		if (theNumber > 1) {
			for (int i = 2; i <= theNumber - 1; i++) {
				if (theNumber % i == 0) {
					flag = false;
					break;
				}
			}
		} else {
			System.out.println("Not accepted number");
		}

		if (flag) {
			System.out.println(theNumber + " is a prime number.");
		} else {
			System.out.println(theNumber + " is not a prime number.");
		}

	}
}
