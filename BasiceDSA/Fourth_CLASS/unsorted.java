package Fourth_CLASS;

public class unsorted {
    public static void main(String[] args) {
        int arr[]={0,2,2,2,2,3,3,4,5,5,7,1,1,1};
        int n=arr.length;
        int max=0;
        // find the maximun element in array
        for(int j=0;j<arr.length;j++){
            if (arr[j]>max) {
                max=arr[j];
            }
        }
        int size=max+1;
        int hash[]=new int[size];
        for(int i=0;i<n;i++){
            int index=arr[i];
            hash[index]++;
        }
        for(int i=0;i<hash.length;i++){
            System.out.println(hash[i]);
        }
    }
    
}
