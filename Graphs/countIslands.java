package Graphs;
import java.util.* ;
import java.io.* ;

public class countIslands {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(br.readLine()) ;
        int m = Integer.parseInt(br.readLine()) ;

        int[][] arr = new int[n][m] ;

        for(int i = 0; i < arr.length; i++){
            String parts = br.readLine() ;
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]) ;
            }
        }
        
        boolean[][] visited = new boolean[arr.length][arr[0].length] ;
        int count = 0 ;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(visited[i][j] == false && arr[i][j] == 0){
                    count ++ ;
                    drawTree(arr, i, j, visited) ;
                }
            }
        }
        System.out.println(count) ;
    }
    
    public static void drawTree(int[][] arr, int i, int j, boolean[][] visited){
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 1 || visited[i][j] == true){
            return ;
        }
        visited[i][j] = true ;
        drawTree(arr, i - 1, j, visited) ;
        drawTree(arr, i, j + 1, visited) ;
        drawTree(arr, i + 1, j, visited) ;
        drawTree(arr, i, j - 1, visited) ;

    }
}