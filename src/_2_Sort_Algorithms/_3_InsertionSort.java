package _2_Sort_Algorithms;

public class _3_InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

    }

    //Assume that first element in array is already sorted
    //Elements to the right of the first element are in unsorted partition
    static int[] insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
             firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex]; //assign array[1] to newElement (1-st iteration)

            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; //newElement=array[firstUnsortedIndex]
                 i--) {
                array[i] = array[i - 1]; //shift array to the beginning until it is sorted
            }
            array[i]=newElement;
        }
        System.out.println("Option1. Sorted array after the optimization: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
