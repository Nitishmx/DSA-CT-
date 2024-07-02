public class print {
    public static void main(String[] args) {
        int array[] = { 10, 40, 20, 3, 0, 10 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

}
