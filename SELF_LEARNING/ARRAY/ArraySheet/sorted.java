package SELF_LEARNING.ARRAY.ArraySheet;
public class sorted {
    public static void main(String[] args) {
        int array[]={0,1,1,1,2,2,2,2,3,3,4,5,5,7};
        int first=0;
        int second=0;
        int count=0;
        for(int i=0;i<array.length;i++){
           if (array[i]==array[first]) {
            count=array[i];
            second++;
           }
           else{
            first++;
            // second++;
           }

        }
        System.out.println(count);
    }
    
}
