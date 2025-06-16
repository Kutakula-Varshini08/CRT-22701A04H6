import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4,true);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.printGraph();
        ArrayList<Integer> neighboursOfZero = graph.neighbours(0);
        System.out.println("Neighbours of node 0: " + neighboursOfZero);
    }
}
class Graph{
    int[][] graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        graph = new int[vertices][vertices];
        this.vertices = vertices;
        this.isDirected = isDirected;
    }
    boolean isValid(int src,int dest){
        return src>=0 && dest>=0 &&src<vertices && dest<vertices && src!=dest;
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            graph [src][dest] = 1;
            if(!isDirected)
            graph [dest][src] = 1;
        }
        else{
            System.out.println("Invalid destination and source");
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph [src][dest] = 0;
            if(!isDirected)
            graph [dest][src] = 0;
    }
    else{
        System.out.println("Invalid destination and source");
    }
    }
    boolean havingEdge(int src ,int dest){
        if(isValid(src,dest)){
            if(graph[src][dest] == 1)
            return true;
            else
            return false;
        }
        System.out.println("Invalid source and destination");
        return false;
    }
    void printGraph(){
        for(int i = 0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
            System.out.print(graph[i][j] + " ");
        }
        System.out.println();
        }
    }
    public ArrayList<Integer> neighbours(int node){
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0;i<vertices;i++){
            if(graph[node][i] == 1){
                n.add(i);
            }
        }
        return n;
    }
}