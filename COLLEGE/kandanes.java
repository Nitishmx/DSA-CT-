public class kandanes {
    public static void main(String[] args) {
        int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int cs = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            cs += array[i];
            if (cs < 0) {
                cs = 0;
            }
            if (cs > maxSum) {
                maxSum = cs;
            }
        }
        System.out.println("the maximum element of array :" + maxSum);
    }

}
