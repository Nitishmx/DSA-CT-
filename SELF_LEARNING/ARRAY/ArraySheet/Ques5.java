package SELF_LEARNING.ARRAY.ArraySheet;

import java.util.Scanner;

// 5.	WAP to display all numbers between two given range

public class Ques5 {
    public static void PrintRange(int arr[],int size){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two index");
        int first=scan.nextInt();
        int second=scan.nextInt();
        for(int i=first+1;i<second;i++){
            System.out.println("Range print of array element : "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        PrintRange(arr,arr.length);
      
        
    }
    
}
