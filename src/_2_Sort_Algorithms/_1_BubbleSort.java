package _2_Sort_Algorithms;

public class _1_BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
      //  bubbleSort(intArray);
        bubblesort1(intArray);
    }

    //bigger bubbles go to the end of the array. Sorted part grows from right to left
    static int[] bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) { //we don't need equals because we compare i and i+1 (out of bounds). inner loop only until unsorted index because sorted values are already in the end
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        System.out.println("Option1. Sorted array after the optimization: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    static int[] bubblesort1(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    swap1(array, j, j+1);
                }

        System.out.println("Option2. Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private static void swap1(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }


}

