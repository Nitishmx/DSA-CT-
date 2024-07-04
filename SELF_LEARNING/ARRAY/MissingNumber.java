package SELF_LEARNING;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 6, 3 };
        // calculate sun of natural number
        int n = arr.length;
        int sumNatural = ((n + 1) * (n + 2)) / 2;

        // sum of current element of array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        // find the missing element
        int missingElement = sumNatural - sum;
        System.out.println("Find the missing element : " + missingElement);

    }

}
