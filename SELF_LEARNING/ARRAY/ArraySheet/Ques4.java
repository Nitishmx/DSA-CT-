package SELF_LEARNING.ARRAY.ArraySheet;

// 4.	WAP to calculate the difference of sum of even elements and odd elements 
public class Ques4 {
    public static int EvenSum(int arr[],int size){
        int even=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
              even=even+arr[i];
            }
        }
        return even;

    }

    public static int OddSum(int arr[],int size){
        int odd=0;
        for(int i=0;i<size;i++){
            if (arr[i]%2!=0) {
                odd=odd+arr[i];
            }
        }
        return odd;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
       int even= EvenSum(arr,arr.length);
       int odd= OddSum(arr,arr.length);
       int diff=odd-even;
       System.out.println("Different between even and odd : "+diff);

    }

}
