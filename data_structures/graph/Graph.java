import java.util.HashMap;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class Graph {

  HashMap<Node, ArrayList<Node>> adjacencyList = new HashMap<Node, ArrayList<Node>>();

  public Graph(){}

  public Graph(Node[] nodes){
    for(Node node : nodes){
      adjacencyList.put(node, new ArrayList<Node>());
    }
  }

  public void addNode(Node node){
    System.out.println("Added node: " + node.toString());
  }

  public void addEdge(Node src, Node dest){
    this.adjacencyList.get(src).add(dest);
  }

  /*
    depth first v, w
    mark v as visited
    if v is equal to w, return w
    for all nodes n adjacent to v,
      if node n is not visited, return depth first on n, w
  */
  /*
    PROS:
     * works better when the node you're looking for is deep within the graph
     * better on memory; unlike BFS, nodes are added to the stack only to travel deeper into the tree
    CONS:
     * even when solutions are deep in the graph, they may take a very long time to find and
       theres no telling if BFS is faster in that case or not
  */
  public Node depthFirstSearch(Node v, Node w){
    v.visit();
    if(v == w)
      return w;
    for(Node n : this.adjacencyList.get(v)){
      if(!n.isVisited()){
        return depthFirstSearch(n, w);
      }
    }
    return new Node("ERROR ID: node not found.");
  }

  /*
    breadth first v, w
    initialize new queue q
    visit node v,
    q.enqueue(v)
    while q is not empty,
      node n = queue.dequeue
      if node n is equal to w, return n
      for all nodes x adjacent to n
        if x is not visited
          q.enqueue x
          mark x as visited
  */
  /*
    PROS:
     * BFS is fast when the node being searched for is close to the first node you're searching from
    CONS:
     * impractical when the tree is deep, even if there are lots of acceptable target nodes in the tree
     * uses a lot of memory to find a solution; all adjacent nodes are appended to the queue
  */
  public Node breadthFirstSearch(Node v, Node w){
    Queue<Node> q = new LinkedList<Node>();
    v.visit();
    q.add(v);
    while(!q.isEmpty()){
      Node n = q.remove();
      if(n == w)
        return n;
      for(Node x : this.adjacencyList.get(n)){
        if(!x.isVisited())
          q.add(x);
          x.visit();
      }
    }
    return new Node("ERROR ID: node not found.");
  }

  public void printNodes(){
    for(Node node : adjacencyList.keySet()){
      System.out.println(node.toString());
    }
  }

  public void printGraph(){
    for(Node keyNode : adjacencyList.keySet()){
      System.out.print(keyNode.toString() + ": ");
      ArrayList<Node> nodeList = adjacencyList.get(keyNode);
      for(Node node : nodeList){
        System.out.print(node.toString() + " ");
      }
      System.out.println();
    }
  }

  public void resetVisited(){
    for(Node node : adjacencyList.keySet()) node.unvisit();
  }
}
