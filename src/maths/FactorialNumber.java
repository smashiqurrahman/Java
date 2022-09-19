package maths;

public class FactorialNumber {
	public void factorialNumber() {
		int theNum = 5;
		int temp = 1;
		
		for(int i = 1;  i <= theNum;  i++) {
			temp = temp*i;
		}
		
		System.out.println(temp);
		
	}
}
