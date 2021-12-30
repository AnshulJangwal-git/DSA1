package Graph;
import java.util.* ;
import java.io.* ;

public class implementation {
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

    static void display(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            System.out.print(i + "->" + " ") ;
            
            for(Edge e : graph[i]){
                System.out.print(e.nbr + "  ") ;
            }
            System.out.println() ;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        
        int vtces = sc.nextInt() ;
        int edges = sc.nextInt() ;
        
        ArrayList<Edge> graph[] = new ArrayList[vtces] ;
        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<Edge>() ;
        }
        
        for(int i = 0; i < edges; i++){
            int v1 = sc.nextInt() ;
            int v2 = sc.nextInt() ;
            int wt = sc.nextInt() ;
            
            graph[v1].add(new Edge(v1,v2, wt)) ;
            graph[v2].add(new Edge(v2, v1, wt)) ;
        }
        display(graph) ;
        
    }  
}
