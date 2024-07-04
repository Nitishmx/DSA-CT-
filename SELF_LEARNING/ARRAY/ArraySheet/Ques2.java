package SELF_LEARNING.ARRAY.ArraySheet;

// 2.	WAP to calculate sum of all the array elements

public class Ques2 {
    public static int SumOfArray(int arr[],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        System.out.println(SumOfArray(arr,arr.length));

    }
    
}
