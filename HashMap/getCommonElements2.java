import java.util.* ;
import java.io.* ;

public class getCommonElements2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n1 = sc.nextInt() ;
        int a1[] = new int[n1] ;
        for(int i = 0; i < a1.length; i++){
            a1[i] = sc.nextInt() ;
        }
    
        int n2 = sc.nextInt() ;
        int a2[] = new int[n2] ;
        for(int i = 0; i < a2.length; i++){
            a2[i] = sc.nextInt() ;
        }
    System.out.println() ;
    
        HashMap<Integer, Integer> map = new HashMap<>() ;
        for(int val : a1){
            if(map.containsKey(val)){
                int nf = map.get(val) + 1 ;
                map.put(val, nf) ;
    
            }else{
                map.put(val, 1) ;
            }
        }
    
        for(int val : a2){
            if(map.containsKey(val) && map.get(val) > 0){
                System.out.println(val) ;
                int nf = map.get(val) - 1 ;
                map.put(val, nf) ;
            }
        }
     }
}
