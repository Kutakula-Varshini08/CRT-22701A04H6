import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
class Main {
    public static void main(String[] args) {
        //Program for Depth-First Sreach program using Adjacency List
    Graph graph = new Graph(5,false);
    graph.addEdge(0,1);
    graph.addEdge(1,2);
    graph.addEdge(1,4);
    graph.addEdge(1,3);
    graph.addEdge(3,4);
    graph.addEdge(2,3);
    graph.printGraph();
    graph.dfs(0,new boolean[5]);
    System.out.println();
    }
}
class Graph{
    ArrayList<HashSet<Integer>> graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        this.vertices = vertices;
        this.isDirected = isDirected;
        this.graph = new ArrayList<HashSet<Integer>>();
        for(int i =0;i<vertices;i++){
            graph.add(new HashSet<>());
        }
    }
    public void addEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).add(dest);
            if(!this.isDirected)
            this.graph.get(dest).add(src);
        }else{
            System.out.println("Invalid source and destinations. \n a.Avaliable vertices are:");
            for(int i=0;i<this.vertices;i++){
                System.out.print(i+ " ");
            }
        }
    }
    public void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            this.graph.get(src).remove(dest);
            if(!this.isDirected)
            this.graph.get(dest).remove(src);
        }else{
            System.out.println("Invalid source and destinations. \n Avaliable vertices are:");
            for(int i=0;i<this.vertices;i++){
                System.out.print(i+ " ");
            }
        }
    }
    boolean isHavingEdge(int src,int dest){
        return this.graph.get(src).contains(dest);
    }
    HashSet<Integer> getNeighbours(int src) throws IndexOutOfBoundsException{
        if(src>=0 && src<vertices)
            return this.graph.get(src);
        throw new IndexOutOfBoundsException("Invalid source and Destinations.");
    }
    boolean isValid(int src,int dest){
        return src>=0 && dest>=0 && src<this.vertices && src!=dest;
    }
    void printGraph(){
        System.out.println(graph);
    }
    void dfs(int start,boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");
        var neighbours = getNeighbours(start);
        for(int neighbour : neighbours){
            if(!visited[neighbour]){
                dfs(neighbour,visited);
            }
        }
    }
}