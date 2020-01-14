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
    gr.addEdge(a, h, 2);
    gr.addEdge(b, a, 1);
    gr.addEdge(c, d, 3);
    gr.addEdge(d, i, 1);
    gr.addEdge(e, f, 2);
    gr.addEdge(f, d, 6);
    gr.addEdge(f, h, 1);
    gr.addEdge(g, e, 3);
    gr.addEdge(h, g, 2);
    gr.addEdge(h, i, 1);
    gr.addEdge(i, b, 2);
    gr.addEdge(i, d, 3);
    gr.printGraph();
  }

}
