package SELF_LEARNING.ARRAY.ArraySheet;
// 9.	WAP to find the difference of maximum and minimum element of an array
public class Ques9 {
    public static void main(String[] args) {
        int arr[] = { 1,4,8,6,2,10,80};
        int large=0;
        int small=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    large=arr[i];
                }
                else if (arr[i]<arr[j]) {
                    small=arr[i];
                    
                }
                
            }
        }
        int a=large-small;
        System.out.println("different the large and small element : "+a);
    }
    
}
