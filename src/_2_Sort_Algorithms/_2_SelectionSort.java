package _2_Sort_Algorithms;

public class _2_SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(intArray);

    }
/*
Set element with index 0 as the current maximum, then iterate through the remaining unsorted elements to find the true maximum, then swap.
Grow sorted partition from right to left.
It also can be implemented the same way, but with a minimum TODO
 */
    static int[] selectionSort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            int largest = 0; //index of presumably biggest number

            for (int i = 1; i <= lastUnsortedIndex; i++) { //comparing the last element as well, this is why we use =<. Going from right to left
                if (array[i] > array[largest]) { //in bubble sort: if array[i]>array[i+1]{swap(i,i+1))}
                    largest = i; //Example: 35>20 -> Largest is array[1]=1; int[] intArray = {20, 35, -15, 7, 55, 1, -22};
                }
            }
            swap(array, largest, lastUnsortedIndex); //lastUnsortedIndex -> last element in unsorted partition
        }
        System.out.println("Selection sort. Option 1. Sorted array after the optimization: ");
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

}
