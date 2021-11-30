import java.util.* ;

public class pivotOfRotatedAndSortedArray {
    public static int getPivot(int[] arr){
        int lo = 0 ;
        int hi = arr.length - 1 ;

        while(lo < hi){
            int mid = (lo + hi) / 2 ;

            if(arr[mid] < arr[hi]){
                hi = mid ;

            }else{
                lo = mid + 1 ;

            }
        }
        return arr[lo] ; //either arr[lo] or arr[hi]
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
        int pivot = getPivot(arr) ;
        System.out.println() ;
        
        System.out.println(pivot) ;
    }
}
