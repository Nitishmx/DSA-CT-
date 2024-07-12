package FIRST_CLASS;
import java.util.Scanner;

public class firstDsa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the array element");
            array[i] = scan.nextInt();

        }
        System.out.println("array all element print"); 
        // print the array all
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        // find the array maximun element
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (ans < array[i]) {
                ans = array[i];

            }
        }
        System.out.println("find the maximum element :" + ans);

        // find the second last element
        // 10,20,30,40
        int secondmin = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (secondmin < array[i] && array[i] != ans) {
                secondmin = array[i];

            }
        }
        System.out.println("find the second maximun element :" + secondmin);

        // find the third maximum number inthe array
        // 10,20,30,40
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if ((third < array[i]) && (array[i] < secondmin)) {
                third = array[i];
            }
        }
        System.out.println("find the third mixmum number in the all array element :" + third);

        scan.close();

    }

}