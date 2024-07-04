package SELF_LEARNING.ARRAY.ArraySheet;

public class Ques6 {
    public static void ReverseElement(int arr[]) {
        int first=0;
        int last=arr.length-1;
        // while(first<last) {
        //     int temp = arr[first];
        //     arr[first] = arr[last];
        //     arr[last] = temp;
        //     first++;
        //     last--;

        // }

        // same approch
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=temp;
        }

    }

    public static void PrintElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        ReverseElement(arr);
        PrintElement(arr);

    }

}
