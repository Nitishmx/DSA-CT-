public class Sorted {
    public static boolean sortedArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int arrya[] = { 1, 2, 3, 4, 5 };
        Sorted obj = new Sorted();

        System.out.println(obj.sortedArray(arrya));
    }
}
