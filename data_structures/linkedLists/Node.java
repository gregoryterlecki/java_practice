public class Node {

  public String data;
  public Node next;

  public Node(String inData){
    this.data = inData;
  }

  public String toString(){
    return data;
  }

  public void display(){
    System.out.println(data);
  }

}
