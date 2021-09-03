import java.util.* ;

public class MinCostPathInMazeTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        int arr[][] = new int[n][m] ;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt() ;
            }
        }
        sc.close() ;

        int dp[][] = new int[n][m] ;

        for(int i = dp.length - 1; i >= 0; i--){
            for(int j = dp[0].length - 1; j >= 0; j--){

                if(i == dp.length - 1 && j == dp[0].length - 1){
                    dp[i][j] = arr[i][j]  ;

                }else if(i == dp.length - 1){
                    dp[i][j] = arr[i][j] + dp[i][j + 1] ;

                }else if(j == dp[0].length - 1){
                    dp[i][j] = arr[i][j] + dp[i + 1][j] ;

                }else{
                    dp[i][j] = arr[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j]) ;

                }
            }
        }
        System.out.println(dp[0][0]) ;
    }    
}
