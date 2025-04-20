package GRAPH;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversal {
    public static class Edge{
        int src;
        int des;
       // int wet;

       public Edge(int src, int des){ // int wet;
           this.des = des;
           this.src = src;
           //this.wet = wet;
       }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));


        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[4].add(new Edge(5,4));
        graph[4].add(new Edge(5,6));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

    }
    public static void bfscall(ArrayList<Edge> graph[], int V, boolean vis[], int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while (!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i = 0;  i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int cnt = 0;
        boolean  vis[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                bfs(i,vis,adj);
                cnt++;
            }
        }
        return cnt;
    }
    private void bfs(int i, boolean[] vis, int[][] adj) {
        int n = adj.length;
        vis[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size() > 0){
            int front = q.remove();
            for(int j = 0 ; j < n; j++){
                if(adj[front][j] == 1 && vis[j] == false)
                    q.add(j);
                    vis[i] = true;

            }
        }

    }

    public static void main(String[] args) {   // time complicity bigof(v+e)
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];
        for(int i = 0; i <  V; i++){
            if(vis[i] == false){
                bfscall(graph,V,vis, i);

            }
        }




    }
}
