package _2_Sort_Algorithms.factorial;

public class Factorial {
    public static void main(String[] args) {
        iterativeFactorial(4);
    }
    // 1! = 0! * 1 = 1
    // 2! = 2*1 = 2 * 1!
    // 3! = 3*2*1= 3 * 2!
    // 4! = 4*3*2*1= 4 * 3!
    // n! = n * (n-1)!

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        return factorial;
    }
}
