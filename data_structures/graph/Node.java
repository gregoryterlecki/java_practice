public class Node {

  private String id;
  private boolean visited = false;

  public Node(String id){
    this.id = id;
  }

  public String toString(){
    return this.id;
  }

  public boolean isVisited(){
    return this.visited;
  }

  public void visit(){
    this.visited = true;
  }
  public void unvisit(){
    this.visited = false;
  }

}
