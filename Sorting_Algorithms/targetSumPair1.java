import java.util.* ;

class targetSumPair{
    public static void targetSumPair(int arr[], int target){
        Arrays.sort(arr) ;

        int i = 0 ;
        int j = arr.length - 1 ;

        while(i < j){
            if(arr[i] + arr[j] < target){
                i ++ ;

            }else if(arr[i] + arr[j] > target){
                j -- ;

            }else{
                System.out.println(arr[i] + ", " + arr[j]) ;
                i ++ ;
                j -- ;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] = new int[n] ;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() ;
        }
        int target = sc.nextInt() ;
        targetSumPair(arr, target) ;

    }
}