package SORTING_ALGO;

public class SelectionSort {
    public static void SelectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int mindIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[mindIndex]) {
                    mindIndex = j;

                }
            }
            // swaping the array element
            if (mindIndex != i) {
                int temp = array[i];
                array[i] = array[mindIndex];
                array[mindIndex] = temp;

            }
        }
    }

    public static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 20, 50, 10, 15, 17, 25, 65 };
        SelectionSort(array);
        PrintArray(array);
    }

}
