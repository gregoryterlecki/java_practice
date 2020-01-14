public class Edge {

  Node v;
  Node w;
  int weight;

  public Edge(Node v, Node w, int weight){
    this.v = v;
    this.w = w;
    this.weight = weight;
  }

  public String toString(){
    return "(" + this.w.toString() + ": " + this.weight + ")";
  }

  public Node getSrcNode(){
    return this.v;
  }

  public Node getDestNode() {
    return this.w;
  }

}
