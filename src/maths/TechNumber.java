package maths;

public class TechNumber {
	public void techNumber() {
		int num = 2025;
		int digits = 0;
		int temp = num;
		while (temp > 0) {
			digits++;
			temp = temp / 10;
		}

		if (temp % 2 != 0) {
			System.out.println(num + " is not even digit number ");
		} else {
			int firstHalf = num % (int) Math.pow(10, digits / 2);
			int secondHalf = num / (int) Math.pow(10, digits / 2);

			int totalOfSquare = (firstHalf + secondHalf) * (firstHalf + secondHalf);

			if (totalOfSquare == num) {
				System.out.println(num + " is a techNumber ");
			} else {
				System.out.println(num + " is not a techNumber ");
			}
		}

	}
}
