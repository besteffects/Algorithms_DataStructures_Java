package _2_Sort_Algorithms.challenges;

public class InsertionSortRecursion {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        insertionSortRecursion(intArray,7);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void insertionSortRecursion(int[] input, int numItems) {
        if (numItems < 2) { //breaking condition
            return;
        }
        insertionSortRecursion(input, numItems - 1); //instead of using a loop from left to right we are using recursion to iterate from left to right

        int selectedElement = input[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && input[i - 1] > selectedElement;
             i--) { //keep searching as long as an element in sorted partition is greater than one we want to insert
            input[i] = input[i - 1]; //shift input to the beginning until it is sorted
        }
        input[i] = selectedElement;
        System.out.println("Result of call when numItems = " +numItems);
        for (i = 0; i <input.length ; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("-------");
    }
}
