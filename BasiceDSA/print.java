public class print {
    public static void main(String[] args) {
        // int array[] = { 10, 40, 20, 3, 10, 10 };
        // int sum = 1;
        // for (int i = 0; i < array.length; i++) {
        //     sum = sum * array[i];
        // }
        // System.out.println(sum);
        int array[] = { 10, 40, 20, 3, 10, 10 };
        for(int i=0;i<array.length;i++){
            if (array[i]>array[i+1]) {
                System.out.println("array is not sorted");
                
            }
            break;
            

        }




        
    }

}
