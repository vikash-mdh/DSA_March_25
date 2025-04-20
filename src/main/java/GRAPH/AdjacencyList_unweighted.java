package GRAPH;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList_unweighted {
    ///  frist you have to create the Edge classes
 static class Edge{
    int src;
    int des;
    ///  This is the constructor
    public Edge(int src, int des){
        this.src = src;
        this.des = des;
    }
}

public static void createGraph(ArrayList<Edge> graph[]){
     for(int i = 0; i < graph.length; i++){
         graph[i] = new ArrayList<Edge>();
     }
     graph[0].add(new Edge(0,2));

     graph[1].add(new Edge(1,2));
     graph[1].add(new Edge(1,3));

     graph[2].add(new Edge(2,0));
     graph[2].add(new Edge(2,1));
     graph[2].add(new Edge(2,3));

    graph[3].add(new Edge(3,1));
    graph[3].add(new Edge(3,2));



}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  4;
//        int n = sc.nextInt();
        ArrayList<Edge> graph[]  = new ArrayList[n];

        createGraph(graph);

        for(int i = 0; i < graph[2].size(); i++){
            Edge ed = graph[2].get(i);
            System.out.print(ed.des +" ");
        }
        System.out.println();
        for(int i = 0; i <  graph[3].size(); i++){
            Edge e = graph[3].get(i);
            System.out.print(e.des+" ");
        }


    }

}
