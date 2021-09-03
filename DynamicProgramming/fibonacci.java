//Memoization..
import java.util.* ;
import java.io.* ;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        sc.close() ;

        int fibn = Fib(n, new int[n + 1]) ;
        System.out.println(fibn) ;

    }   
    
    public static int Fib(int n, int qb[]){
        if(n == 0 || n == 1){
            return n ;
        }

        if(qb[n] != 0){
            return qb[n] ;
        }

        int fibnm1 = Fib(n - 1, qb) ;
        int fibnm2 = Fib(n - 2, qb) ;

        int fb = fibnm1 + fibnm2 ;

        qb[n] = fb ;
        return qb[n] ;

    }
}
