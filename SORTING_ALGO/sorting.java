package SORTING_ALGO;
public class sorting {
    public static void PrintingArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("   "  +arr[i]);
        }
        System.out.println();
    }
    public static void BubbleSort(int array[]){
        for (int i = 0; i < array.length; i++) {
         boolean flag=false;
            for (int j = 0; j < array.length - i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag=true;
                    
                }
            }
            PrintingArray(array);
            if (flag==false) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        // int array[] = { 20,50,10,40,100,90};
        int array[] = {6,0,3,5};
        BubbleSort(array);
      
        
    }

}
