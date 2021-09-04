import java.util.* ;
// import jdk.internal.org.jline.utils.InputStreamReader;

import java.io.* ;

public class Goldmine {
    public static void main(String[] args)throws Exception{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        // int n = Integer.parseInt(br.readLine()) ;
        // int m = Integer.parseInt(br.readLine()) ;
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;

        int arr[][] = new int[n][m] ;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                // arr[i][j] = Integer.parseInt(br.readLine()) ;
                arr[i][j] = sc.nextInt() ;
            }
        }
        sc.close() ;

        int dp[][] = new int[n][m] ;
        for(int j = arr[0].length - 1; j >= 0; j--){
            for(int i = 0; i < arr.length; i++){
                if(j == arr[0].length - 1){
                    dp[i][j] = arr[i][j] ;

                }else if(i == 0){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]) ;

                }else if(i == arr.length - 1){
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]) ;

                }else{
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1])) ;

                }
            }
        }

        int max = dp[0][0] ;
        for(int i = 1; i < arr.length; i++){
            if(dp[i][0] > max){
                max = dp[i][0] ;
            }
        }
        System.out.println(max) ;
    }    
}
