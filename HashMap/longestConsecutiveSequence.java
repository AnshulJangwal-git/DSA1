import java.util.* ;
import java.io.* ;

public class longestConsecutiveSequence {
    public static void main(String[] args){
        // write your code here
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
    
        HashMap<Integer, Boolean> map = new HashMap<>() ;
        for(int val : arr){
            map.put(val, true) ;
        }
    
        for(int key : arr){
            if(map.containsKey(key - 1)){
                map.put(key, false) ;
            }
        }
        int ml = 0 ;
        int msp = 0 ;
        for(int val : arr){
            if(map.get(val) == true){
                int tsp = val ;
                int tl = 1 ;
    
                while(map.containsKey(tsp + tl)){
                    tl ++ ;
                }
                    if(tl > ml){
                    ml = tl ;
                    msp = tsp ;
                }
            }
        }
        for(int i = 0; i < ml; i++){
            System.out.println(msp + i) ;
        }
     }   
}
