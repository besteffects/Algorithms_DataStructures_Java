package _2_Sort_Algorithms;
//Stable algorithm
public class _5_MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

     static void mergeSort(int[] array, int start, int end) {

        if (end - start < 2) { //breaking condition is when we have 1 element array
            return;
        }

        int mid = (start + end) / 2; //end is always 1 greater than the last valid index of partition we want to sort
        //0+7=3  0,1,2- left array, 3,4,5,6 - left array
        mergeSort(array, start, mid);//merge sort on left partition. In the end all elements from this partition are sorted
        mergeSort(array, mid, end); //merge sort on right partition. Indexes 3 to 7 are sorted in the end
        merge(array, start, mid, end); //merge all partitions
    }

    //Merging step
     static void merge(int[] input, int start, int mid, int end) {

        //if the last element in the left partition is less or equal than the first element in the left partition
//it means that all the elements in the left partition are <= than elements in the right partition, because both partitions are sorted
        if (input[mid - 1] < input[mid]) { //optimization
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0; //track where we are in a temporary array when we are doing a copy

        int[] temp = new int[end - start]; //the same length as initial array
        //when we are merging a partitions we are going to copy values back into same positions
//compare elements with index i in a right array with elements with index j in a left array
        //and write a smaller of the two into a current position in temp with tempIndex
        //when i==mid we finish traversing the left array, or j==end we finish traversing right array
        while (i < mid && j < end) {
            //compare elements with indexes i with elements with indexes j and write the smaller of the two in temp array
            //if elements are equal, left element will be written first, algorithm is stable
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++]; //fill temp array with sorted elements = make the sort stable!
        }

        //second optimization
        //If there leftover elements in the left array, this will copy them directly from one location in the input array
        // to another location in the input array

        //input - source array, i - start copying from position i, input - destination array
        //start+tempIndex - start-destination index, tempIndex - counted how many elements we handled
        //mid-i -number of elements we did not copy into the left array from the left partition
         //start with the input array and then add start and temp index and copy the value to this index, mid -1 is 1. So we copy 1 element
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        //source - temp, target-input array, copy from start, length - tempIndex. We are only copying the elements we copied into the temp array, we are not copying entire tempArray
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
