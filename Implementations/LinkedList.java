import java.util.* ;

public class LinkedList{
    public static class Node{
        int data ;
        Node next ;
    }
    
    public static class LinkedLists{
        Node head ;
        Node tail ;
        static int size ;
        
        public void addLast(int val){
            Node temp = new Node() ;
            temp.data = val ;
            
            if(size == 0){
                head = tail = temp ;
                
            }else{
                tail.next = temp ;
                tail = temp ;
                
            }
            size ++ ;
        }
        
        public void addFirst(int val){
            Node temp = new Node() ;
            temp.data = val ;
            
            if(size == 0){
                head = tail = temp ;
                
            }else{
                temp.next = head ;
                head = temp ;
            }
            size ++ ;
            
        }
        
        public void removeFirst(){
            if(size == 0){
                System.out.println("Can't remove") ;
            }else if(size == 1){
                head = tail = null ;
                size = 0 ;
                
            }else{
                head = head.next ;
                size -- ;
            }
            
        }
        
        public void removeLast(){
            if(size == 0){
                System.out.println("Can't remove") ;
                
             }else if(size == 1){
                 head = tail = null ;
                 size -- ;
                 
             }else{
                 Node temp = head ;
                 for(int i = 1; i <= size - 2; i++){
                    temp = temp.next ;
                 }
                 temp.next = null ;
                 tail = temp ;
                 size -- ;
             }
        }
        
        public int size(){
            return size ;
        }
        
        public void display(){
            Node temp = head ;
            while(temp != null){
                System.out.println(temp.data + " ") ;
                temp = temp.next ;
            }
            System.out.println() ;
        }
        
    }
    
    
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        LinkedLists list = new LinkedLists() ;
        
        list.addLast(10) ;
        list.addLast(20) ;
        list.addLast(30) ;
        list.addFirst(5) ;
        
        System.out.println(list.size()) ;
        // list.display() ;
        // list.removeFirst() ;
        list.display() ;
        list.removeLast() ;
        System.out.println(list.size()) ;
        list.display() ;
        
        
    }
    
    
}