import java.util.* ;
import java.io.* ;

public class LinkedList {
    public static class Node{
        int data ;
        Node next ;
    }

    public static class LinkedLists {
        Node head ;
        Node tail ;
        int size ;

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
        public int size(){
            return size ;
        }

        public void display(){
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data + " ") ;
                temp = temp.next ;
            }
            System.out.println() ;

            //or using FOR Loop, we can write as..
            // for(Node temp = head; temp != null; temp = temp.next){
            //     System.out.print(temp.data + " ") ;
            // }
            // System.out.println() ;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        LinkedLists list = new LinkedLists() ;

        // String str = sc.next() ;
        
        list.addLast(20) ;
        list.addLast(30) ;
        list.addLast(40) ;
        
        list.display();
        int sz = list.size() ;
        System.out.println(sz) ;

    }

}
