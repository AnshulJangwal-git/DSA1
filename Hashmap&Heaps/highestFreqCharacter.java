import java.util.* ;
import java.io.* ;

public class highestFreqCharacter {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;

        HashMap<Character, Integer> fmap = new HashMap<>() ;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i) ;
            if(fmap.containsKey(ch)){
                int of = fmap.get(ch) ;
                int nf = of + 1 ;
                fmap.put(ch, nf) ;
            }else{
                fmap.put(ch, 1) ;
            }
        }
    
    char mfc = str.charAt(0) ;
    for(Character key : fmap.keySet()){
        if(fmap.get(key) > fmap.get(mfc)){
            mfc = key ;
        }
    }
    System.out.println(mfc) ;

    }
}
