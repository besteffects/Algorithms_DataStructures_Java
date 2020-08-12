package _2_Sort_Algorithms;
//unstable algorithm O (n log n) - base 2
public class _6_QuickSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) { //the end index will be 1 greater than the last index in the input array
        //if end-start<2 we are dealing with an 1 element array
        if (end - start < 2) {
            return;
        }

//partition () will return the position of the pivot
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex); //left subarray
        quickSort(input, pivotIndex + 1, end); //right subarray
    }

    private static int partition(int[] input, int start, int end) {
        //this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        //we stop when j crosses i.
        while (i < j) {

            // NOTE: Empty loop body, we use it to decrement j
            //looking for an element that is less than a pivot
            while (i < j && input[--j] >= pivot) ;
//we use j to find the first element that is less than a pivot and we want to put all elements that are less then a pivot to the left, and move the pivot
            if (i < j) {
                input[i] = input[j];
            }

            //looking for an element that is greater than a pivot
            //NOTE:Empty loop body
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;

        return j;
    }
}
