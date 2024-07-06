package SELF_LEARNING.ARRAY.ArraySheet;

// 10.	WAP to find the second largest element in an array
public class Ques10 {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 8, 6, 2, 10, 80 };
        int large = 0;
        int secondlarge = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    large = arr[i];

                }
                if (arr[j] < large) {
                    secondlarge = arr[j];

                }
            }
        }
        System.out.println("Second largest element of array :" + secondlarge);

    }

}
