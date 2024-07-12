package THIRD_CLASS;

public class Recurns {
    public static int FindRecusive(int arr[]){
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==1) {
                count++;
                
            }
            else{
                if (ans<count) {
                    ans=count;
                    count=0;
                }
            }
        }
        return Math.max(ans,count);
    }
    public static void main(String[] args) {
        int array[]={11,1,2,20,7,8,5,63,14};
        System.out.println(FindRecusive(array));
    }
}
