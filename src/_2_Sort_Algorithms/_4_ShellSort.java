package _2_Sort_Algorithms;

public class _4_ShellSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        shellSort(array);
    }

    public static int[] shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int selectedElement = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > selectedElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j]=selectedElement;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}
