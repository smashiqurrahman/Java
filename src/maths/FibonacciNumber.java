package maths;
public class FibonacciNumber {
    public void fibonacciNumber() {
        int element, i, a, b, c;

        element = 5;
        i = 5;
        a = 0;
        b = 1;
        c = 0;

        System.out.print(" " + a);
        System.out.print(" " + b);

        for (i = 1; i <= element; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }


}
