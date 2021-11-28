import java.io.* ;
import java.util.* ;

public class quickSelect {
    public static int quickSelect(int arr[], int lo, int hi, int k){
        int pivot = arr[hi] ;
        int pi = partition(arr, pivot, lo, hi) ;

        if(k > pi){
            return quickSelect(arr, pi + 1, hi, k) ;

        }else if(k < pi){
            return quickSelect(arr, lo, pi - 1, k) ;

        }else{
            return pivot ;

        }
    }
    
    public static int partition(int arr[], int pivot, int lo, int hi){
        int i = lo ;
        int j = lo ;

        while(i <= hi){
            if(arr[i] > pivot){
                i += 1 ;

            }else{
                swap(arr, i, j) ;
                i ++ ;
                j ++ ;

            }
        }
        return j - 1 ;
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;

    }
    static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ") ;

        }
        System.out.println() ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
            
        }
        int k = sc.nextInt() ;
        int ans = quickSelect(arr, 0, arr.length - 1, k - 1) ;
        System.out.println(ans) ;
        print(arr) ; // only the one side is sorted as it is quickSelect...
    }

}
