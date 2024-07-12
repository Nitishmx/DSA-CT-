import java.util.HashMap;

public class hashmap2 {
    public static void main(String[] args) {
        int array[]={1,28,8,86,6,6,3,3,7,58,8,8,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if (map.containsKey(array[i])) {
                int value=map.get(array[i]);
                map.put(array[i],value+1);

                
            }
            else{
                map.put(array[i], 1);
            }
        }
        System.out.println(map);
    }
}
