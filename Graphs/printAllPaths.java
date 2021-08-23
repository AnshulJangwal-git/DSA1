package Graphs;
import java.util.* ;
import java.io.* ;

public class printAllPaths {
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

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

        int vtces = Integer.parseInt(br.readLine()) ;
        ArrayList<Edge>[] graph = new ArrayList[vtces] ;

        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<>() ;
        }

        int Edges = Integer.parseInt(br.readLine()) ;
        for(int i = 0; i < Edges; i++){
            String[] parts = br.readLine().split(" ") ;
            int v1 = Integer.parseInt(parts[0]) ;
            int v2 = Integer.parseInt(parts[1]) ;
            int wt = Integer.parseInt(parts[2]) ;

            graph[v1].add(new Edge(v1, v2, wt)) ;
            graph[v2].add(new Edge(v2, v1, wt)) ;

        }
        int src = Integer.parseInt(br.readLine()) ;
        int dest = Integer.parseInt(br.readLine()) ;

        //write your code here..
        boolean[] visited = new boolean[vtces] ;
        printAllPaths(graph, src, dest, visited, src + "") ;
    }

    public static void printAllPaths(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, String psf){
        if(src == dest){
            System.out.println(psf) ;
            return ;
        }

        visited[src] = true ;
        for(Edge e : graph[src]){
            if(visited[e.nbr] == false){
                printAllPaths(graph, e.nbr, dest, visited, psf + e.nbr) ;
            }
        }
        visited[src] = false ;
    }
}
