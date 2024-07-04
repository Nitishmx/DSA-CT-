package SELF_LEARNING.ARRAY.ArraySheet;


// 3.	WAP to product of all the array elements

public class Ques3 {
    public static int ProductArray(int arr[],int size){
        int product=1;
        for(int i=0;i<size;i++){
            product=product*arr[i];
        }
        return product;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(ProductArray(arr,arr.length));
        
    }
    
}
