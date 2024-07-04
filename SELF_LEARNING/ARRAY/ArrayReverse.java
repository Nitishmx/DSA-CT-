package SELF_LEARNING;

public class ArrayReverse {
    public static void ReverseArray(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1] = temp;
        }
    }

    public static void PrintArrayElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        ArrayReverse.ReverseArray(arr);
        ArrayReverse.PrintArrayElement(arr);
    }
}
