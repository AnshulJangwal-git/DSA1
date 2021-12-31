import java.util.* ;
import java.io.* ;

public class getCommonElements1{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n1 = Integer.parseInt(br.readLine()) ;
        int a1[] = new int[n1] ;
        for(int i = 0; i < a1.length; i++){
            a1[i] = Integer.parseInt(br.readLine()) ;
        }

        int n2 = Integer.parseInt(br.readLine()) ;
        int a2[] = new int[n2] ;
        for(int i = 0; i < a2.length; i++){
            a2[i] = Integer.parseInt(br.readLine()) ;
        }
        System.out.println() ;
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
            if(map.containsKey(val)){
                System.out.println(val) ;
                map.remove(val) ;
            }
        }

    }

}
