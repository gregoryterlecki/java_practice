public class LinkedList {

  private Node head;

  public LinkedList(){
    head = null;
  }
  public LinkedList(Node inputHead){
    head = inputHead;
  }

  public Boolean isEmpty(){
    return (head == null);
  }

  public void insertAtHead(String inData){
    Node n = new Node(inData);
    n.next = head;
    head = n;
  }

  public void insertAtTail(String inData){
    Node n = new Node(inData);
    Node tempNode = head;
    while(tempNode.next != null){
      tempNode = tempNode.next;
    }
    tempNode.next = n;
  }

  public Node deleteAtHead(){
    Node tempNode = head;
    if(!isEmpty()){
      head = head.next;
    }
    else {
      System.out.println("Linked list is empty");
    }
    return tempNode;
  }

  public Node deleteAtTail(){
    Node tempNode = head;
    Node returnNode = head;
    if(!isEmpty()){
      while(tempNode.next.next != null){
        tempNode = tempNode.next;
      }
      returnNode = tempNode.next;
      tempNode.next = null;
      return returnNode;
    }
    else {
      System.out.println("Linked list is empty");
    }
    return returnNode;
  }

  public Node find(String searchData){
    Node tempNode = head;
    if(!isEmpty()){
      while(tempNode.data != searchData){
        if(tempNode.next == null){
          System.out.println("Warning: node not found");
          return null;
        } else {
          tempNode = tempNode.next;
        }
      }
      return tempNode;
    }
    else {
      System.out.println("Linked list is empty");
      return null;
    }
  }

  public Node deleteAt(String searchData){
    Node tempNode = head;
    Node prevNode = head;
    if(!isEmpty()){
      while(tempNode.data != searchData){
        if(tempNode.next == null){
          System.out.println("Warning: node not found");
          return null;
        } else {
          prevNode = tempNode;
          tempNode = tempNode.next;
        }
      }
      prevNode.next = tempNode.next;
      tempNode.next = null;
      return tempNode;
    }
    else {
      System.out.println("Linked list is empty");
      return null;
    }
  }

  public void displayData(){
    Node tempNode = head;
    if(!isEmpty()){
      while(tempNode != null){
        System.out.println(tempNode.toString());
        tempNode = tempNode.next;
      }
    }
    else {
      System.out.println("Linked list is empty");
    }
  }

}
