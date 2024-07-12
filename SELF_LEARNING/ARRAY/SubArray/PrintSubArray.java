package SELF_LEARNING.ARRAY.SubArray;

public class PrintSubArray {
    public static void PrintSubArray(int arrya[]) {
        int totalSubArray = 0;
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arrya.length; i++) {
            for (int j = i + 1; j < arrya.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    System.out.print(arrya[k]);
                    sum += arrya[k];
                    if (max < sum) {
                        max = sum;

                    }
                    if (min>sum) {
                        min=sum;
                    }
                }
                System.out.println();
                System.out.println("sum of subarray element :" + sum);
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sum of subarray :" + totalSubArray);
        System.out.println("Maximum sum of array :" + max);
        System.out.println("Minum sun of subarray element :"+min);
        // System.out.println("sum of all subarray :"+sum);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        PrintSubArray(array);
    }

}
