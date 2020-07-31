package _2_Sort_Algorithms;

public class _1_BubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // bubbleSort(intArray);
        bubblesort1(intArray);
    }

    static int[] bubbleSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
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
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    swap1(array, i, j);
                }

        System.out.println("Option1. Sorted array after the optimization: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    private static void swap1(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}

