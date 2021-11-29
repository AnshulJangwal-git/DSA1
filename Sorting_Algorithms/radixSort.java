import java.util.* ;

public class radixSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
        radixSort(arr) ;
        print(arr) ;
    }  
    
    public static void radixSort(int arr[]){
        int max = Integer.MIN_VALUE ;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i] ;
            }
        }
        int exp = 1 ;
        while(exp <= max){
            countSort(arr, exp) ;
            exp = exp * 10 ;
        }
    }
    
    public static void countSort(int[] arr, int exp){
        int farr[] = new int[10] ;
        //freq Array
        for(int i = 0; i < arr.length; i++){
            farr[arr[i] / exp % 10] ++ ;
        }
        //prefexSum Array..
        for(int i = 1; i < farr.length; i++){
            farr[i] += farr[i - 1] ;
        }

        //stable sorting(filling ans Array)..
        int ans[] = new int[arr.length] ;
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = farr[arr[i] / exp % 10] - 1 ;
            ans[pos] = arr[i] ;
            farr[arr[i] / exp % 10] -- ;
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i] ;
        }
        System.out.print("After sorting on " + exp  + " place -> ") ;
        print(arr) ;
    }

    static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]  + " ") ;
        }
        System.out.println() ;
    }
}

//Time Complexity -> O(n + b) * log(k)
