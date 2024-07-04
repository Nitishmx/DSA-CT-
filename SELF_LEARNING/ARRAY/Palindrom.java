package SELF_LEARNING;

public class Palindrom {
    // check array palindrom is yes or not
    public static int PalindromArray(int arr[]) {
        int flag = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = -1;
                System.out.println("Array is not palindrom");
                break;

            }
        }
        if (flag == 0) {
            System.out.println("array is palindrom");
            flag = 1;
        }
        return flag;

    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 2, 1 };
        int symbol = Palindrom.PalindromArray(array);
    }
}
