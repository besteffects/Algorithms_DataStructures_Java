package _2_Sort_Algorithms;

public class _4_ShellSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        shellSort(array);
    }

    public static int[] shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int selectedElement = array[i]; //array[i] is array[gap], element we essentially look at
                int j = i; //j is used for traversing

                while (j >= gap && array[j - gap] > selectedElement) { //if j==gap we hit the front of the array 20>7 (array[0]>array[3])
                    array[j] = array[j - gap]; //compare 7 with j-gap (j-3) assign array[0] to array[3], 20 to 7
                    j -= gap; //subtract the gap from j (j=j-gap)
                }
                array[j]=selectedElement; //we found the insertion point for 7 (selected element). Assign selected element to insertion point (7 to 20)
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}
