package Graphs;
import java.util.* ;
import java.io.* ;

public class Bipartite {
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

    static class Pair{
        int v ;
        String psf ;
        int level ;

        Pair(int v, String psf, int level){
            this.v = v ;
            this.psf = psf ;
            this.level = level ;
        }
    }

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int vtces = Integer.parseInt(br.readLine()) ;
        ArrayList<Edge>[] graph = new ArrayList[vtces] ;

        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>() ;
        }

        int edges = Integer.parseInt(br.readLine()) ;
        for(int i = 0; i < edges; i++){
            String parts[] = br.readLine().split(" ") ;
            int v1 = Integer.parseInt(parts[0]) ;
            int v2 = Integer.parseInt(parts[1]) ;
            int wt = Integer.parseInt(parts[2]) ;

            graph[v1].add(new Edge(v1, v2, wt)) ;
            graph[v2].add(new Edge(v2, v1, wt)) ;

        }

        int[] visited = new int[graph.length] ;
        Arrays.fill(visited, -1);

        for(int v = 0; v < vtces; v++){
            if(visited[v] == -1){
                boolean isBipartite = checkBipartite(graph, v, visited, "") ;
                if(isBipartite == false){
                    System.out.println(false) ;
                    return ;
                }
            }
        }
        System.out.println(true) ;

    }

    
    public static boolean checkBipartite(ArrayList<Edge>[] graph, int src, int[] visited, String psf){
        ArrayDeque<Pair> q = new ArrayDeque<>() ;
        q.add(new Pair(src, src + "", 0)) ;

        while(q.size() > 0){
            Pair rem = q.removeFirst() ;
            if(visited[rem.v] != -1){ //Already visited..
                if(rem.level != visited[rem.v]){
                    return false ;
                }
            }else{
                visited[rem.v] = rem.level ;
            }

            for(Edge e : graph[src]){
                if(visited[e.nbr] == -1){
                    q.add(new Pair(e.nbr, rem.psf + e.nbr, rem.level + 1)) ;
                }
            }
        }
        return true ;
    }
}
