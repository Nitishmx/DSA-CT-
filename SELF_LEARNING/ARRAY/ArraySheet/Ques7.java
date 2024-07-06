package SELF_LEARNING.ARRAY.ArraySheet;
// 7.	WAP to find largest element from an array
public class Ques7 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int big=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if (arr[i]<arr[j]) {
                    big=arr[j];
                    
                }
            }
        }
        System.out.println("Largest element of array : "+big);
    }
    
}
