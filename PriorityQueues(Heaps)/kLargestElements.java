import java.util.* ;
import java.io.* ;

public class kLargestElements {
    public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }

       public static void solve(int n,int[] arr,int k){
        //Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        for(int i = 0; i < arr.length; i++){
            if(i < k){
                pq.add(arr[i]) ;

            }else{
                if(arr[i] > pq.peek()){
                    pq.remove() ;
                    pq.add(arr[i]) ;
                }
            }
        }
        Stack<Integer> st = new Stack<>() ;
        while(pq.size() > 0){
            st.push(pq.remove()) ;
        }
        while(st.size() > 0){
            System.out.print(st.pop() + " ") ;
        }
   }
}
