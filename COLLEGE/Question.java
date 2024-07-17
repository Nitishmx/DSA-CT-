// Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum
//  and return its sum.
public class Question {
    public static void main(String[] args) {
      // int arr[] = {1, 2, 3, -2, 5};
      // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3}; //7
      int arr[]={1,2,3,4,5,6,8}; //0
      
        // for(int i=0;i<arr.length;i++){
        //     if (arr[i]<0) {
        //           if (negative<arr[i]) {
        //                 negative=arr[i];
            
        //             }
            
        //         }
            
        //       }
        //     int max=Integer.MIN_VALUE;
        //       for(int i=0;i<arr.length;i++){
        //           int sum=0;
        
        //           for(int j=0;j<=i;j++)
        //           {
        //               sum=sum+arr[j];
                
        //             }
        //             max = Math.max(sum,max);
                
        //           }
        //           System.out.println("max sub array sum :"+max);
        //         int arr[]={-1, -2, -3, -4}; //-1
                int max=arr[0];
                for(int i=1;i<arr.length;i++){
                  if (max<arr[i]) {
                    max=arr[i];
                  }
                }
                System.out.println("Array max :"+max);


                
                
              }  
            }
