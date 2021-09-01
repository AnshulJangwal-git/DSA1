package Implementations;
import java.util.* ;
import java.io.* ;

public class primsAlgorithm_MinimumWireToConnectAllPCs {
    static class Edge{
        int src ;
        int nbr ;
        int wsf ;

        Edge(int src, int nbr, int wsf){
            this.src = src ;
            this.nbr = nbr ;
            this.wsf = wsf ;
        }
    }    
    static class Pair implements Comparable<Pair>{
        int v ; //vertex...
        int av ;//acquiring vertex..
        int wt ;

        Pair(int v, int av, int wt){
            this.v = v ;
            this.av = av ;
            this.wt = wt ;
        }
        public int compareTo(Pair o){
            return this.wt - o.wt ;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int vtces = Integer.parseInt(br.readLine()) ;
        
        ArrayList<Edge> graph[] = new ArrayList[vtces] ;
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

        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        pq.add(new Pair(0, -1, 0)) ;

        boolean[] visited = new boolean[vtces] ;
        while(pq.size() > 0){
            Pair rem = pq.remove() ;
            if(visited[rem.v] == true){
                continue ;
            }
            visited[rem.v] = true ;

            if(rem.av != -1){
                System.out.println("[" + rem.v + "-" + rem.av + "@" + rem.wt + "]") ;
            }

            for(Edge e : graph[rem.v]){
                if(visited[e.nbr] == false){
                    pq.add(new Pair(e.nbr, rem.v, e.wsf)) ;
                }
            }
        }
    }
}
