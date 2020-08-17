package _2_Sort_Algorithms.challenges;

public class RaddixSortString {
    public static void main(String[] args) {
        String[] stringsArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort
        radixStringSort(stringsArray, 26, 5); //26 letters in alphabet
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    static void radixStringSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) { //to start i at the rightmost position
            raddixSingleSort(input, i, radix);
        }
    }

    static void raddixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        for (String value : input) {
            countArray[getString(position, value)]++;
        }
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) { // from 1-th to 1000th
            temp[--countArray[getString(position, input[tempIndex])]] =
                    input[tempIndex]; //we decrement the value for the digit first, then we use that index as index of the temporary and we assign a value at input [tempIndex]
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }

    }

    static int getString(int position, String value) {
        return value.charAt(position) - 'a';

    }
}