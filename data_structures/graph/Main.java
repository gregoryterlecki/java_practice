public class Main {

  public static void main(String[] args){
    Node a = new Node("A");
    Node b = new Node("B");
    Node c = new Node("C");
    Node d = new Node("D");
    Node e = new Node("E");
    Node f = new Node("F");
    Node g = new Node("G");
    Node h = new Node("H");
    Node i = new Node("I");
    Node[] nodes = {a, b, c, d, e, f, g, h, i};
    Graph gr = new Graph(nodes);
    gr.addEdge(a, b);
    gr.addEdge(a, h);
    gr.addEdge(b, a);
    gr.addEdge(b, d);
    gr.addEdge(b, i);
    gr.addEdge(c, d);
    gr.addEdge(d, b);
    gr.addEdge(d, c);
    gr.addEdge(d, e);
    gr.addEdge(e, d);
    gr.addEdge(e, f);
    gr.addEdge(e, g);
    gr.addEdge(f, e);
    gr.addEdge(f, g);
    gr.addEdge(f, i);
    gr.addEdge(g, e);
    gr.addEdge(g, f);
    gr.addEdge(g, h);
    gr.addEdge(h, a);
    gr.addEdge(h, g);
    gr.addEdge(h, i);
    gr.addEdge(i, b);
    gr.addEdge(i, f);
    gr.addEdge(i, h);

    Node dfs = gr.depthFirstSearch(c, h);
    System.out.println("Node found: " + dfsNode.toString());
    gr.resetVisited();

    Node bfsNode = gr.breadthFirstSearch(c, a);
    System.out.println("Node found: " + dfsNode.toString());
    gr.resetVisited();
  }

}
