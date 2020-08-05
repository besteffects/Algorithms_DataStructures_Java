package _2_Sort_Algorithms.factorial;

public class Factorial {
    public static void main(String[] args) {
        iterativeFactorial(4);
        System.out.println(recursiveFactorial(4));
    }
    // 1! = 0! * 1 = 1
    // 2! = 2*1 = 2 * 1!
    // 3! = 3*2*1= 3 * 2!
    // 4! = 4*3*2*1= 4 * 3!
    // n! = n * (n-1)!


    //recursiveFactorial(1)
    //recursiveFactorial(2)
    //recursiveFactorial(3) then this and so on...
    //recursiveFactorial(4) - this is put to the call stack first, but is not returned

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

    public static int recursiveFactorial(int num){
        if (num==0){
            return 1; //in order for a recursion to work properly, you need some condition that will end the recursion (breaking condition also called base case)
        }
        return num*recursiveFactorial(num-1);
    }
}
