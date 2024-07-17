package SORTED;

public class bubble {
    public static void Checking(int arr[]){
        for(int i=0;i<arr.length;i++){

            System.out.print("   "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={3,1,2,5,23,-1,17};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;i++){
                if (array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    
                }
                Checking(array);
                
            }
        }
     
    }
    
}
