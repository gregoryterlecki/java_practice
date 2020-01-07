/*
  HEAP

  What is it?
  A heap is a way to store data that is organized like a tree, except it's
  an array in memory.

  How does it work?
  There are two types of heaps, min heaps and max heaps. The difference is
  what order the heap stores its values. The root node is the highest element
  in the collection in a max heap, and it is the smallest value in a min heap.
  Since heaps are arrays where the last index is known, insertion is very fast.
  However, when we insert, the element we added will most likely be in the wrong
  position (depending on min or max heap). We can just add it at first anyways,
  but to fix the ordering problem, we can continuously swap the node with its
  parent until it the child is larger than this node, and the parent is smaller
  (other way around in a max heap).
  If we remove the root node, we'll have an empty spot. To fix this issue, we
  replace the node with the last element in the heap, then bubble this new value
  down the heap until it's found itself in the right spot.

  Internal representation:
  Elements are stored in an array. No node class is needed in this case.
  Since the heap has continuous indices, we can use a math expression to find
  the parent, left child and right child relative to a particular elements index
  in the array representation of the heap.
  This is how the swapping described in the above paragraph is done. 

  Strengths:
  Quick for insertion and deletion

  Weaknesses:
  Slow for traversal and searching

  Performance:

*/

public class Main {

  public static void main(String[] args){

  }

}
