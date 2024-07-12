public class prefixSum {
    public static void main(String[] args) {
        int array[]={1,-2,6,-1,3};
        // calculate the prefix sum of array
        int prefixArray[]=new int[array.length];
        for(int i=0;i<array.length;i++){
            prefixArray[i]=prefixArray[i]+array[i];

        }
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
       for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length;j++){
            currentsum=i==0?prefixArray[j]:(prefixArray[j]-prefixArray[i-1]);
            if (maxsum<currentsum) {
                maxsum=currentsum;
                
            }

        }
       }
       System.out.println("print the maximum sum :"+maxsum);
    }
    
}
