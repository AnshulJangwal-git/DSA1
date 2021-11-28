import java.io.* ;
import java.util.* ;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
        int pi = partition(arr, arr[arr.length - 1], 0, arr.length - 1) ;
        System.out.println(pi) ;
    }   
    
    public static int partition(int arr[], int pivot, int lo, int hi){
        int i = lo ;
        int j = lo ;

        while(i <= hi){
            if(arr[i] <= pivot){
                swap(arr, i, j) ;
                i ++ ;
                j ++ ;
            }else{
                i ++ ;
            }
        }
        return j - 1 ;   
    }
    
    static void swap(int arr[], int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

}
