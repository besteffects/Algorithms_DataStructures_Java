package _2_Sort_Algorithms;

public class _5_MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(array, start, mid);//merge sort on left partition
        mergeSort(array, mid, end); //merge sort on right partition
        merge(array, start, mid, end); //merge all partitions
    }

    public static void merge(int[] input, int start, int mid, int end){

    }
}
