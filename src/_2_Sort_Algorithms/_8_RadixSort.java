package _2_Sort_Algorithms;

public class _8_RadixSort {
    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(radixArray, 10, 4);
        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    //0 is the rightmost position, the least significant digit
    // all the values should have same radix and same width
    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {
        //stores how many items we are going to be sorting
        int numItems = input.length;

        //create array that is big enough to hold all possible values. Length will be 10
        int[] countArray = new int[radix]; //radix is the max amount of possible values

        //counts how many values have a certain digit in a position we are looking at
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++; //this method will return 0 to 9 and we will increment by 1. When this loop will be finished we will have a conventional count array
        }

        //adjust the count array. Instead of containing counts it contains the number of values that have that digit or less than that digit int the position that we are working with
        for (int j = 1; j < radix; j++) { //we do not need j=0 because the number of 0 is 0
            countArray[j] += countArray[j - 1]; //e.g. if j=3 it adds 0,1,2 and 3 and sums up values
        }

        //copying values into a temporary array, preserving a duplicates (from right to left)
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            //tempIndex starts in the end and moves right to left.
            //right to left preserves the ordering of duplicate values
            //from the least significant digit to the most significant digit (from 1-th to 1000th)
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];
        }

        //copy back from the temporary array into the input array
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix; //(int) because we don't want a floating point value returned
        //Math.pow takes the first parameter and raises it to the second parameter
        //we pass in position 0 because we are starting from 0. 4725 for value and 10 for radix
        //0 position 4725/Math.pow(10,0)%10 = 4725/1 %10=472 and remainder 5, so we will return 5
        //1 position: 4725/Math.pow(10,1)%10= 2
        //position 2: 4725/Math.pow (10,2) %10= 7 (the remainder)
    }
}
