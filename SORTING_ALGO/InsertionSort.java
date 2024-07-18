package SORTING_ALGO;

public class InsertionSort {
    public static void InsertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;

            }
        }

    }

    public static void PrintingArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int array[] = { 20, 40, 11, 19, 27, 45 };
        InsertionSort(array);
        PrintingArray(array);

    }

}