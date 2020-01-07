import java.util.Arrays;

public class Heap {

  private int capacity = 64;
  private int size = 0;

  int[] items = new int[capacity];

  private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1; }
  private int getRightChildIndex(int parentIndex){ return 2 * parentIndex + 2; }
  private int getParentIndex(int childIndex){ return (childIndex - 1) / 2; }

  private boolean hasLeftChild(int index){
    return getLeftChildIndex(index) < size;
  }
  private boolean hasRightChild(int index){
    return getRightChildIndex(index) < size;
  }
  private boolean hasParent(int index){
    return getParentIndex(index) >= 0;
  }

  private int leftChild(int index){ return items[getLeftChildIndex(index)]; }
  private int rightChild(int index){ return items[getRightChildIndex(index)]; }
  private int parent(int index){ return items[getParentIndex(index)]; }

  private void swap(int[] items, int i, int j){
    int temp = items[i];
    items[i] = items[j]
    items[j] = temp;
  }

  private void ensureCapacity(){
    if(size == capacity){
      items = Arrays.copyOf(items, capacity * 2);
      capacity *= 2;
    }
  }

  public int poll(){
    if(size == 0) throw new IllegalStateException();
    int item = items[0];
    items[0] = items[size - 1];
    size--;
    heapifyDown();
    return item;
  }

  public void add(int item){
    ensureCapacity();
    items[size] = item;
    size++;
    heapifyUp();
  }

  public void heapifyUp(){
    int index = size - 1;
    while(hasParent(index) && parent(index) > items[index]){
      swap(parentIndex(index), index);
      index = getParentIndex(index);
    }

  }

  public void heapifyDown(){
    int index = 0;
    // it's equivalent to as if a node has a left child, and to ask whether a
    // node has any children at all, since if it doesnt have a left child,
    // it can't have a right child.
    while(hasLeftChild(index)){
      int smallerChildIndex = getLeftChildIndex(index);
      if(hasRightChild && leftChild(index) < rightChild(index)){
        smallerChildIndex = getRightChildIndex(index);
      }
      if(items[index] < items[smallerChildIndex]){
        break;
      }
      else {
        swap(index, smallerChildIndex);
      }
      index = smallerChildIndex;
    }
  }

}
