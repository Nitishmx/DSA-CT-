package SELF_LEARNING.ARRAY.ArraySheet;

public class Ques8 {
    public static void main(String[] args) {
        int arr[] = { 1,4,8,6,2,10};
        int ans=0;
        for(int i=0;i<arr.length;i++){
           for(int j=1;j<arr.length;j++){
            if (arr[i]<arr[j]) {
                ans=arr[i];
            }
           }
        }
        System.out.println(ans);
    }
    
    
    
}
