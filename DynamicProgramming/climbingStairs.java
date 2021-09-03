import java.util.*;
import java.io.*;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int cp = countStairs(n, new int[n + 1]) ;
        // System.out.println(cp) ;

        int total = countStairsTab(n);
        System.out.println(total);

    }
//Memoization..
    public static int countStairs(int n, int[] qb) {

        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (qb[n] != 0) {
            return qb[n];
        }

        int n1 = countStairs(n - 1, qb);
        int n2 = countStairs(n - 2, qb);
        int n3 = countStairs(n - 3, qb);

        int ts = n1 + n2 + n3;
        qb[n] = ts;

        return ts;
    }

//Tabulation..
    public static int countStairsTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            if (i == 1) {
                dp[i] = dp[i] + dp[i - 1];

            } else if (i == 2) {
                dp[i] = dp[i] + dp[i - 1] + dp[i - 2];

            } else {
                dp[i] = dp[i] + dp[i - 1] + dp[i - 2] + dp[i - 3];

            }
        }
        return dp[n];
    }

}
