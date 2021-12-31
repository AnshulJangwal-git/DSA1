import java.util.* ;
import java.io.* ;

public class Introduction {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>() ;
        map.put("India", 135) ;
        map.put("China", 160) ;
        map.put("USA", 40) ;
        map.put("Russia", 75) ;
        map.put("Brazil", 25) ;
        map.put("Pakistan", 30) ;

        System.out.println(map) ;

        //put, get and containsKey...

        map.put("Nigeria", 15) ;
        map.put("USA", 35) ;

        System.out.println(map) ;
        System.out.println(map.get("India")) ;
        System.out.println(map.containsKey("Rahul")) ;


        //To get all the keys in a Hashmap..
        Set<String> keys = map.keySet() ;
        System.out.println(keys) ;

        //To get all the key-value Pairs.. OR To run a loop in all the keys
        for(String key : map.keySet()){
            int value = map.get(key) ;
            System.out.println(key + " <-> " + value) ;
        }

    }    
}
