import java.util.Arrays;

public class Stack implements StackInterface {

  int[] items;
  int size;
  int capacity;

  public Stack(){
    items = new int[8];
    capacity = 8;
    size = 0;
  }

  public Stack(int[] newItems){
    size = newItems.length;
    capacity = size * 2;
    items = new int[capacity];
    for(int i = 0; i < size; i++){
      items[i] = newItems[i];
    }
  }

  public boolean isEmpty(){ return size==0; }

  public void push(int item){
    ensureCapacity();
    items[size++] = item;
  }

  public int pop(){
    int item = items[size-1];
    size--;
    return item;
  }

  public int peek(){
    return items[size-1];
  }

  public void print(){
    for(int i = 0; i < size; i++){
      System.out.print(items[i] + " ");
    }
    System.out.println();
  }

  private void ensureCapacity(){
    if(size == capacity){
      items = Arrays.copyOf(items, capacity * 2);
      capacity *= 2;
    }
  }

}
