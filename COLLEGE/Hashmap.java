import java.util.HashMap;;
public class Hashmap {
    public static void main(String[] args) {
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(26,3);
        map.put(7,4);
        System.out.println(map.size());
        System.out.println(map);
        // data access
        System.out.println(map.get(26));
        System.out.println("remove element :"+map.remove(26));
        System.out.println("map element :"+map);
    }
//     given an unsorted array find 
}
