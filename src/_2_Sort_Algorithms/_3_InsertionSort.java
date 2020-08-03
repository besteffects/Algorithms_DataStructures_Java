package _2_Sort_Algorithms;

public class _3_InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(intArray);
    }

    //Assume that first element in array is already sorted
    //Elements to the right of the first element are in unsorted partition
    //at the end of the first iteration the first two elements will be sorted and firstUnsortedIndex becomes 2
    static int[] insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
             firstUnsortedIndex++) {
            int selectedElement = array[firstUnsortedIndex]; //assign array[1] to newElement (1-st iteration). We are saving the value we are going to insert into a newElement

            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > selectedElement; //newElement=array[firstUnsortedIndex]
                 i--) { //keep searching as long as an element in sorted partition is greater than one we want to insert
                array[i] = array[i - 1]; //shift array to the beginning until it is sorted
            }
            array[i]=selectedElement; //Example: assign -15 to array[0]
        }
        System.out.println("Option1. Sorted array after the optimization: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
