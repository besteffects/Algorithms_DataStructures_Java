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
     static void radixSort(int[] input, int radix, int width) {  //radix -10, width - the number of digits in a value of an array (loops 4 times)
        for (int i = 0; i < width; i++) { //zero is the rightmost position. here we are traversing position, from 0 tu 3, i=position
            radixSingleSort(input, i, radix); //1000-th will be sorted last, 1-th - first
        }
    }

     static void radixSingleSort(int[] input, int position, int radix) {
        //stores how many items we are going to be sorting
        int numItems = input.length;

        //create array that is big enough to hold all possible values. Length will be 10. We create 4 count arrays while traversing
        int[] countArray = new int[radix]; //radix is the max amount of possible values (10)

        //1 counts how many values have a certain digit in a position we are looking at. Counting from left to right. We create countArray few times (in this case 4)
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++; //this method will return 0 to 9 and we will increment by 1. When this loop will be finished we will have a conventional count array
        //first 1-th elements, then 10-th, 100-th and so on
        }

        // 2 adjust the count array. Instead of containing counts it contains the number of values that have that digit or less than that digit int the position that we are working with
        for (int j = 1; j < radix; j++) { //we do not need j=0 because the number of 0 is 0. Adjusting from left to right
            countArray[j] += countArray[j - 1]; //e.g. if j=3 it adds 0,1,2 and 3 and sums up values
        }

        //3 copying values into a temporary array, preserving a duplicates (from right to left)
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) { // from 1-th to 1000th
            //tempIndex starts in the end and moves right to left.
            //right to left preserves the ordering of duplicate values
            //from the least significant digit to the most significant digit (from 1-th to 1000th)
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex]; //we decrement the value for the digit first, then we use that index as index of the temporary and we assign a value at input [tempIndex]
        }

        //4 copy back from the temporary array into the input array
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

     static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix; //(int) because we don't want a floating point value returned, radix is always 10
        //Math.pow takes the first parameter and raises it to the second parameter
        //we pass in position 0 because we are starting from 0. 4725 for value and 10 for radix
        //0 position 4725/Math.pow(10,0)%10 = 4725/1 %10=472 and remainder 5, so we will return 5
        //1 position: 4725/Math.pow(10,1)%10= 2
        //position 2: 4725/Math.pow (10,2) %10= 7 (the remainder)
    }
}
