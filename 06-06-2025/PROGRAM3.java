import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        //program for adjacencyList
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,0);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        graph.addEdge(3,2);
        graph.printGraph();
    }
}
class Graph{
    int vertices;
    ArrayList<ArrayList<Integer>> graph;
    Graph(int vertices){
        this.vertices = vertices;
        this.graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<vertices;i++){
            graph.add(new ArrayList<Integer>());
        }
    }
    boolean isValid(int src,int dest){
        return src>=0 && dest>=0 &&src<vertices && dest<vertices && src!=dest;
    }
    void addEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }
        else{
            System.out.println("Invalid destination and source");
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
           graph.get(src).remove(dest);
           graph.get(dest).remove(src);
    }
    else{
        System.out.println("Invalid destination and source");
    }
    }
    public ArrayList<Integer> neighbours(int node){
        return graph.get(node);
    }
    boolean havingEdge(int src ,int dest){
        if(isValid(src,dest)){
           var arr = graph.get(src);
           for(int i = 0;i<arr.size();i++){
               if(arr.get(i) == dest){
                   return true;
               }
           }
           return false;
        }
        System.out.println("Invalid source and destination");
        return false;
    }
    void printGraph(){
        for(int i = 0;i<vertices;i++){
            System.out.println(i + ":" + graph.get(i));
        }
        }
    }
    