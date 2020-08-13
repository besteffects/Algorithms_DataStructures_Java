package _2_Sort_Algorithms.challenges;

public class InsertionSortRecursion {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        insertionSortRecursion(intArray,intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void insertionSortRecursion(int[] input, int numItems) {
        if (numItems < 2) { //breaking condition
            return;
        }
        //we do the insertionSort with the same input, but with one less items
        //lets do the insertion sort with first 6 items of array, 5,4,3,2 items
        //the recursive call to 1 will be able to continue executing
        //each recursive call grows the sorted partition by 1
        insertionSortRecursion(input, numItems - 1); //instead of using a loop from left to right we are using recursion to iterate from left to right

        int selectedElement = input[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && input[i - 1] > selectedElement;
             i--) { //keep searching as long as an element in sorted partition is greater than one we want to insert
            input[i] = input[i - 1]; //shift input to the beginning until it is sorted
        }
        input[i] = selectedElement;

        //we assume that first element (20) is sorted
        System.out.println("Result of call when numItems = " +numItems);
        for (i = 0; i <input.length ; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("-------");
    }
}
