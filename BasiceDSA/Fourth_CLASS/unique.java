package Fourth_CLASS;

public class unique {
    public static void main(String[] args) {

        int maxs = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = { 3, 1, 2, 3, 5, 6, 7, 4, 1, 3, 4, 4 };
        int n = arr.length;
        int max = 0;
        // array find maximum element
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        // hash table data insert
        int size = max + 1;
        int hash[] = new int[size];
        for (int i = 0; i < n; i++) {
            int index = arr[i];
            hash[index]++;
        }

        // find the unique element of array
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1) {
                System.out.println("print unique element :" + i);
            }
        }

        // find the maximum occurence in hash table
        for (int i = 0; i < hash.length; i++) {
            if (maxs < hash[i]) {
                maxs = hash[i];
            }
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == maxs) {
                maxs = Math.max(maxs, i);
            }
            if (hash[i] == 1) {

                min = Math.min(min, i);
            }

        }
        System.out.println("min :" + min);
        System.out.println("max :" + maxs);
        System.out.println("max and min frequency :" + (maxs - min));
    }

}
