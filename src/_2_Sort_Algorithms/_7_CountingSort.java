package _2_Sort_Algorithms;

//counting sort is used for small ranges of values
public class _7_CountingSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(array, 1, 10);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void countingSort(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1]; //array of length 10-1+1, possible 10 values inclusive
        for (int i = 0; i < array.length; i++) {
            //incrementing the position, counting the number of repeats
            countArray[array[i] - min]++;    //for example for values 10 to 20 array[20]-10=10; countArray[10];
        }
//write values back into the input array
        int j = 0;  //j-index to write to the input array, i - index to traverse the count array
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i; //array[j++] is equivalent to array[j] =i; j=j+1; (arr[0]=i, arr[1]=i...)
                countArray[i - min]--;
            }
        }
    }
}
