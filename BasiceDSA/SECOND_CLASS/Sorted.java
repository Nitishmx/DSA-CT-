package SECOND_CLASS;
import java.util.Scanner;

public class Sorted {

    public static boolean sortedArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static void ReverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int tem = arr[0];
            arr[first] = arr[last];
            arr[last] = tem;
            first++;
            last--;

        }

    }

    public static int LinSearch(int arry[], int target) {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == target) {
                return 1;

            }
        }

        return -1;
    }

    // left shift element of array
    public static void LeftShift(int arra[]) {
        int temp = arra[0];
        for (int i = 0; i < arra.length-1; i++) {
            arra[i] = arra[i + 1];

        }
        arra[arra.length - 1] = temp;

    }

    // right shift array all element
    public static void RightShift(int arra[]){
        int lengt=arra.length-1;
        int temp=arra[arra.length-1];


        // 

        // for(int i=lengt;i>=1;i--)  some doute create
        for(int i=lengt;i>=1;i--){
            arra[i]=arra[i-1];
        }
        arra[0]=temp;

    }

    public static void main(String[] args) {
        int arrya[] = { 1, 2, 3, 4, 5,6 };
        // check array element sorted order arrange or not
        // System.out.println(Sorted.sortedArray(arrya));

        // array element reverserorder store
        // Sorted.ReverseArray(arrya);

        // reverse element printed
        // for (int i = 0; i < arrya.length; i++) {
        // System.out.println(arrya[i]);
        // }

        Scanner scan = new Scanner(System.in);
        // System.out.println("enter the use element");
        // int user = scan.nextInt();
        // System.out.println(Sorted.LinSearch(arrya, user));
        // Sorted.LeftShift(arrya);
        // all element print
        // for (int i = 0; i < arrya.length; i++) {
        //     System.out.println(arrya[i]);
        // }

        Sorted.RightShift(arrya);
        for (int i = 0; i < arrya.length; i++) {
            System.out.println(arrya[i]);
        }
        scan.close();

    }

}
