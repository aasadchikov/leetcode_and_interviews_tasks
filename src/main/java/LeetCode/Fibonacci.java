package LeetCode;

public class Fibonacci {
    public static void getFibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void getFibonacciRec(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }


    public static void main(String args[])
    {

        getFibonacci(10);

        getFibonacciRec(10);
    }
}
