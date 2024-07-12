package Fourth_CLASS;

import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,2,2,2,2,3,3,4,5,5,7};
        int n=arr.length;
        int size=arr[n-1]+1;
        int hash[]=new int[size];
        for(int i=0;i<n;i++){ 
            int index=arr[i];
            hash[index]++;
        }
        for(int i=0;i<hash.length;i++){
            System.out.print("hash index :"+i);
            System.out.println("  ===>  hash no of value :"+hash[i]);
        }
    }
}
