package com.ashiq.maths;

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
	
	public void techNumberSolutionTwo() {
		int num  = 2025;
		String numString = num + "";
		if(numString.length() > 0 && numString.length() %2 == 0) {
			int mid = numString.length() / 2;
			int firstHalf = Integer.parseInt(numString.subSequence(0, mid).toString());
			int secondHalf = Integer.parseInt(numString.subSequence( mid, numString.length()).toString());
			
			if(((firstHalf+secondHalf)*(firstHalf+secondHalf)) == num) {
				System.out.println(num + " is a techNumber ");
			} else {
				System.out.println(num + " is not a techNumber ");
			}
			
		}else {
			System.out.println(num + " is not even digit number ");
		}
		
	}
}
