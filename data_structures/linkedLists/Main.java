/*
  LINKED LIST

  Summary:
  A linked list is a data structure for holding an ordered set of information.
  Each unit of data is held within a node, which itself contains a reference
  to the next node, which also has a value, and so on.
  In a vanilla linked list, the last node will contain a null reference to the
  next node, essentially meaning it doesnt have one.

  Internal representation:
  Unlinke an array, which stores data in contiguous locations in memory, the
  order of the elements in a linked list are not given by the order the nodes
  appear in memory. Instead, they are located in more or less random locations
  but one node contains the reference to the next, which could be hypothetically
  anywhere.

  Strengths:
  While arrays and dynamic arrays are useful for direct access by index, they
  perform poorly for insertions and deletions, which is where a linkedlist
  shines. Furthermore, expanding the size of the dynamic array collection is a
  very expensive operation. However, as long as there is memory left in the
  system, a linked list will always be able to efficiently add or remove data.

  Weaknesses:
  A linked list uses more memory than an array containing the same data, making
  it impractical for containing small numbers of items.

  Performance:
  Insertion and deletion with index: O(1)
  Insertion and deletion without index: O(n)    [we have to search for the node]


*/

public class Main {
  public static void main(String[] args){
    LinkedList l1 = new LinkedList();
    l1.insertAtHead("A");
    l1.insertAtHead("B");
    l1.insertAtHead("C");
    l1.insertAtHead("D");
    l1.insertAtTail("W");
    l1.insertAtTail("X");
    l1.insertAtTail("Y");
    l1.insertAtTail("Z");
    l1.deleteAtHead();
    l1.deleteAtTail();
    Node searchNode = l1.find("A");
    System.out.println("Node found: " + searchNode.toString());
    l1.deleteAt("W");
    l1.displayData();

    // testing deletion on empty linked list
    LinkedList l2 = new LinkedList();
    l2.deleteAtHead();
    l2.deleteAtTail();
  }
}
