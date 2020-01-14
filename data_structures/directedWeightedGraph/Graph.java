/*
  Directed Weighted Graph
*/
import java.util.HashMap;
import java.util.ArrayList;


public class Graph {

  private HashMap<Node, ArrayList<Edge>> adjacencyList = new HashMap<Node, ArrayList<Edge>>();

  public Graph(Node[] nodes){
    for(Node node : nodes){
      this.adjacencyList.put(node,new ArrayList<Edge>());
    }
  }

  public void addEdge(Node src, Node dest, int weight){
    Edge e = new Edge(src, dest, weight);
    this.adjacencyList.get(e.getSrcNode()).add(e);
  }

  public void printGraph(){
    for(Node keyNode : adjacencyList.keySet()){
      System.out.print(keyNode.toString() + ": ");
      ArrayList<Edge> edgeList = adjacencyList.get(keyNode);
      for(Edge edge : edgeList){
        System.out.print(edge.toString() + " ");
      }
      System.out.println();
    }

  }

  /*
    runtime complexity is O( (|E|+|V|)log(|V|) ), assuming a min heap is used to
    keep track of nodes with the least tentative distance values
  */
  public void dijkstraPath(Node s, Node w){

  }

  // get edges
  // get adjacent nodes to given node
  // get edge weight
  //

}
