import java.util.* ;
import java.io.* ;

public class countSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
            max = Math.max(max, arr[i]) ;
            min = Math.min(min, arr[i]) ;
        }
        countSort(arr, min, max) ;
        print(arr) ;
    }
    
    static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ") ;
        }
        System.out.println() ;
    }

    public static void countSort(int[] arr, int min, int max){
        int range = max - min + 1 ;
        int farr[] = new int[range] ;

        for(int i = 0; i < arr.length; i++){
            farr[arr[i] - min] ++ ;
        }

        for(int i = 1; i < farr.length; i++){
            farr[i] = farr[i] + farr[i - 1] ;
        }

        int ans[] = new int[arr.length] ;
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = farr[arr[i] - min] ;
            ans[pos - 1] = arr[i] ;
            farr[arr[i] - min] -- ;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i] ;
        }
    }

}

//Note - count sort is a stable sort.

//Time Complexity
//Best Case -> O(n) , Worst Case -> O(n + k) , Average Case -> O(n + k) 