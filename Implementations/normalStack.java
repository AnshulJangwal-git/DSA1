import java.util.* ;
import java.io.* ;

public class normalStack{
    
   public static class CustomStack {
    int[] data;
    int tos;

    public CustomStack(int cap) {
      data = new int[cap];
      tos = -1;
    }

    int size() {
      // write ur code here
      return tos + 1 ;
    }

    void display() {
      // write ur code here
      for(int i = tos; i >= 0; i--){
          System.out.print(data[i] + " ") ;
      }
      System.out.println() ;

    }

    void push(int val) {
        if(tos == data.length - 1){
            System.out.println("Stack overflow") ;
            
        }else{
            tos ++ ;
            data[tos] = val ;
        }
    }

    int pop() {
      // write ur code here
      if(tos == -1){
           System.out.println("Stack underflow") ;
           return -1 ;
           
       }else{
           int val = data[tos] ;
           tos -- ;
           return val ;
       }
    }

    int top() {
       // write ur code here
       if(tos == -1){
           System.out.println("Stack underflow") ;
           return -1 ;
           
       }else{
           int val = data[tos] ;
        //   tos -- ;
           return val ;
       }
    }
  }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        CustomStack st = new CustomStack(n) ;
        
        for(int i = 0; i < n; i++){
            st.push(sc.nextInt()) ;
        }
        
        
        st.pop() ;
        
        System.out.println(st.size()) ;
        st.display() ;
    }  
}

  
  
  
  
  
  
  
  
  