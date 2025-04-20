package GRAPH;

import java.util.ArrayList;

// create a arraylist of graph
// create a class of edge with 3 args src, des, weight
public class AdjcencyList_weighted {
    public static class Edge{
        int src;
        int des;
        int wet;
       public Edge(int src, int des, int wet){
          this.src = src;
          this.des = des;
          this.wet = wet;
       }
    }

    public static  void createWetedGraph( ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2, 5));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,0));
        graph[2].add(new Edge(2,3,-1));
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,1,-1));

    }



    public static void main(String[] args) {
        int n = 4;
        ArrayList<Edge> graph[] = new ArrayList[n];
        createWetedGraph(graph);

        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.des + " "+ e.wet);
        }

    }
}
