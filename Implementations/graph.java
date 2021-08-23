package Implementations;
import java.io.* ;
import java.util.* ;

public class graph {
    
    static class Edge{
        int src ;
        int nbr ;
        int wt ;

        Edge(int src, int nbr, int wt){
            this.src = src ;
            this.nbr = nbr ;
            this.wt = wt ;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int vtces = sc.nextInt() ;

        ArrayList<Edge>[] graph = new ArrayList[vtces] ;

        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<>() ;
        }

        int edges = sc.nextInt() ;
        for(int i = 0; i < edges; i++){
            String parts[] = sc.next().split(" ") ;
            int v1 = sc.nextInt() ;
            int v2 = sc.nextInt() ;
            int wt = sc.nextInt() ;

            graph[v1].add(new Edge(v1, v2, wt)) ;
            graph[v2].add(new Edge(v2, v1, wt)) ;

        }

        int src = sc.nextInt() ;
        int dest = sc.nextInt() ;

        //write your code here...
    }
}
