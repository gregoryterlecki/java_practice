/*
  BINARY TREES

  What is it?
  A binary tree is a data structure that organizes units of data (each within
  their own node) into a tree structure. The tree has a root node, each node can
  have either 0, 1 or 2 children, and nodes that have no children are called
  leaf nodes.

  Internal representation:

  Strengths:

  Weaknesses:

  Performance:

*/

public class Main {

  public static void main(String[] args){

    BinaryTree t = new BinaryTree();

    t.add(50, "Greg");
    t.add(40, "Jonathan");
    t.add(60, "Gombac");
    t.add(30, "Anujan");
    t.add(35, "Simic");
    t.add(70, "Nathan");
    t.inOrderTraversal(t.getRoot());

    System.out.println("Search for 70:");
    System.out.println(t.find(70));
  }

}
