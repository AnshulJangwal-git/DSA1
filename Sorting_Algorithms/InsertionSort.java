import java.util.* ;
import java.io.* ;

public class InsertionSort {
    public static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(isGreater(arr, j, j + 1) == true){
                    swap(arr, j, j + 1) ;
                }else{
                    break ;
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

    public static boolean isGreater(int[] arr, int i, int j){
        if(arr[i] > arr[j]){
            return true ;
        }else{
            return false ;
        }
    }

    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ") ;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;

        int arr[] = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }

        insertSort(arr) ;
        print(arr) ;
    }
}

//Time Complexity => worst case - o(n^2), best case - o(n)